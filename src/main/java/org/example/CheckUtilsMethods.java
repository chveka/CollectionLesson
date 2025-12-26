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

    private void log (String message) {
        System.out.println(message);
    }
}
