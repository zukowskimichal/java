package pl.dev.java.essentials.hackerrank.days30challenge.day27;

import java.util.Random;

public class Solution {

    static class TestDataEmptyArray {

        public static int[] get_array() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {

        public static int[] get_array() {

            return new int[]{1, 2};
        }

        public static int get_expected_result() {
            int[] array = get_array();
            int minValue = array[0];
            int minValueIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (minValue > array[i]) {
                    minValue = array[i];
                    minValueIndex = i;
                }
            }
            return minValueIndex;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {

        public static int[] get_array() {
            return new int[]{1, 0, 1, 0};
        }

        public static int get_expected_result() {
            int[] array = get_array();
            int minValue = array[0];
            int minValueIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (minValue > array[i]) {
                    minValue = array[i];
                    minValueIndex = i;
                }
            }
            return minValueIndex;
        }
    }

}
