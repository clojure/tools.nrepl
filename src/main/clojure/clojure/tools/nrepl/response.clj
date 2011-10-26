(ns clojure.tools.nrepl.response
  ; TODO gah! Can we restrict ourselves to java 1.6 and use javax.xml.bind.DatatypeConverter?
  ;      Or maybe just snag http://migbase64.sourceforge.net? (It's not in central)
  (:import (sun.misc BASE64Encoder BASE64Decoder))
  (:use [clojure.core.incubator :only (-?>)]))

(defn base64-encode
  [bytes]
  (.encode (BASE64Encoder.) bytes))

(defn base64-decode
  [string]
  (.decodeBuffer (BASE64Decoder.) string))

(defmulti render
  ""
  (fn [value data-type] [(type value) (keyword "clojure.tools.nrepl.response" data-type)]))

(defn render->base64
  [value data-types]
  (->> data-types
    (map #(-?> value (render %) base64-encode (vector %)))
    (remove nil?)
    first))

(derive ::png ::image)
(derive ::jpg ::image)
(derive ::jpeg ::image)
(derive ::bmp ::image)

(defmethod render
  [java.awt.image.RenderedImage ::image]
  [img image-format]
  (let [out (java.io.ByteArrayOutputStream.)
        ; good grief: can't just use (ImageIO/write img format out) because of http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6967419
        img-out (javax.imageio.stream.MemoryCacheImageOutputStream. out)]
    ; TODO provide some way to control image resolution, format, maybe max file size (hard?)
    (javax.imageio.ImageIO/write img (name image-format) img-out)
    (doto img-out .flush .close)
    (.toByteArray out)))

(defmethod render :default [_ _] nil)