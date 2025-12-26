package org.utils;

import org.filter.Filter;

import java.lang.reflect.Array;

public class CustomCollectionUtils {

    public static <T> T[] getFiltredArray(T[] array, Filter filter) {
        T[] newArray = null;
        if (array != null && array.length > 0 && filter != null) {
            newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
            for (int i = 0; i < array.length; i++) {
                newArray[i] = (T) filter.apply(array[i]);
            }
        }
        return newArray;
    }
}
