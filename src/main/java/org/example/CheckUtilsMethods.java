package org.example;

import org.filter.Filter;
import org.utils.CustomCollectionUtils;

import java.util.Arrays;

public class CheckUtilsMethods {

    public void checkFilterArray() {
        String[] students = new String[3];
        students[0] = "John";
        students[1] = "Mary";
        students[2] = "Jane";

        log(Arrays.toString(students));

        String[] filterArray = CustomCollectionUtils.getFiltredArray(students, new Filter() {
            @Override
            public Object apply(Object o) {
                return o != null ? o + " is enrolled" : null;
            }
        });
        log(Arrays.toString(filterArray));
    }

    public void checkArrayCounter() {
        String[] students = new String[15];
        students[0] = "John";
        students[1] = "Mary";
        students[2] = "Mary";
        students[3] = "Jane";
        students[4] = "John";
        students[5] = "Jane";
        students[6] = "Jane";
        students[7] = "John";
        students[8] = "John";
        students[9] = "Jane";
        students[10] = "Jane";
        students[11] = "John";
        students[12] = "Mary";
        students[13] = "John";
        students[14] = "Jane";

        log(Arrays.toString(students));

        log(String.valueOf(CustomCollectionUtils.getMapWithCountArrayElements(students)));
    }

    private void log(String message) {
        System.out.println(message);
    }
}
