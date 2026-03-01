package org.utils;

import org.filter.Filter;

import java.lang.reflect.Array;
import java.util.*;

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

    public static <T> Map<T, Integer> getMapWithCountArrayElements(T[] array) {
        Map<T, Integer> map = new HashMap<>();
        Set<T> set = new HashSet<>(Arrays.asList(array));
        for (T setElement : set) {
            map.put(setElement, 0);
        }
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (map.containsKey(array[i])) {
                    map.put(array[i], map.get(array[i]) + 1);
                }
            }
        }
        return map;
    }
}
