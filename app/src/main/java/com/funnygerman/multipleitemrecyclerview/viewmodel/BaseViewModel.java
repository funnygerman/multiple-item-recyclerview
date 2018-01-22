
package com.funnygerman.multipleitemrecyclerview.viewmodel;

/**
 * Please add a proper description here.
 *
 * @author funnygerman
 * @version 1.0
 * @since 1.0
 */

public interface BaseViewModel {

    enum Type {
        TYPE_A, TYPE_B, TYPE_C;

        private static final Type[] VALUES = values();

        public static Type fromInt(int value) {
            try {
                return VALUES[value];
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new IllegalArgumentException("Unknown value for : " + value);
            }
        }
    }

    Type getType();
}
