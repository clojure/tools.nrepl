/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *   which can be found in the file epl-v10.html at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 *   the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

package clojure.tools.nrepl;

import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

/**
 * @author Chas Emerick
 */
public class main {
    public static void main (String[] args) throws Exception {
        RT.var("clojure.core", "require").invoke(Symbol.intern("clojure.tools.nrepl.cmdline"));
        RT.var("clojure.tools.nrepl.cmdline", "-main").applyTo(RT.seq(args));
    }
}
