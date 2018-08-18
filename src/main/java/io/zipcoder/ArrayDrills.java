package io.zipcoder;

public class ArrayDrills {


    /**
     * Given an array of ints, return true if value appears as either the first or last element in the array.
     * The array will be length 1 or more.
     * example : firstLast(6, [1,2,6); // Should return true
     *           firstLast(6, [1,2,3]); // Should return false
     */
    public Boolean firstLast(Integer value, Integer[] input){
        boolean isFirstOrLast = false;
        for (int i = 0; i < input.length; i++) {
            if(input[0] == value ) {
                isFirstOrLast = true;
            }
            if (input[input.length - 1] == value) {
                isFirstOrLast = true;
            }
        }
        return isFirstOrLast ;
    }

    /**
     * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
     * example : sameFirstLast([1,2,3]); // Should return false
     *           sameFirstLast([1,2,1]); // Should return true
     */
    public Boolean sameFirstLast(Integer[] input){
        boolean firstIsSameAsLast = false;
        for (int i = 0; i < input.length; i++) {
            if (input[0] == input[input.length - 1]) {
                firstIsSameAsLast = true;
            }
        }
        return firstIsSameAsLast;
    }


    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
     * Both arrays will be length 1 or more.
     * example : commonEnd([1, 2, 3], [7, 3]); // Should return true
     *           commonEnd([1, 2, 3], [7, 3, 2]); // Should return false
     */
    public Boolean commonEnd(Integer[] input1, Integer[] input2){
        boolean sameFirstAsLast = false;
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {
                if (input1[0] == input2[0] || input1[input1.length - 1] == input2[input2.length - 1]) {
                 sameFirstAsLast = true;
                }
            }
        }
        return sameFirstAsLast;
    }

    /**
     * Given an array of ints, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     * example : rotateLeft([1, 2, 3]); // Should return [2,3,1]
     *           rotateLeft([5, 11, 9]); // Should return [11,9,5]
     */
    public Integer[] rotateLeft(Integer[] input){
        Integer[] rotatedArray = new Integer[input.length];
        for (int i = 0; i < input.length - 1; i++) {
            if (i == 0) {
                rotatedArray[rotatedArray.length - 1] = input[i];
            }
            rotatedArray[i] = input[i + 1];
        }
        return rotatedArray;
    }


    /**
     * Given an array of ints, figure out which is element in the array is largest,
     * and set all the other elements to be that value. Return the changed array.
     * example : maxValue([1, 2, 3]); // Should return [3,3,3]
     *           maxValue([5, 11, 9]); // Should return [11,11,11]
     */
    public Integer[] maxValue(Integer[] input){
        Integer[] maxArray = new Integer[input.length];
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            max = (input[i] > max) ? input[i] : max;
        }

        for (int i = 0; i < maxArray.length; i++) {
            maxArray[i] = max;
        }
        return maxArray;
    }


    /**
     * Given 2 int arrays, a and b, return a new array length 2 containing their middle elements, if length is odd.
     * If the array length is even the sum of the middle 2 elements in the array.
     * example : middleWay([1, 2, 3], [4,5,6,2]); // Should return [2,11]
     *           middleWay([5, 1, 2, 9], [3, 4, 5, 5]); // Should return [3, 9]
     */
    public Integer[] middleWay(Integer[] input1, Integer[] input2){

        return null;
    }


    /**
     * Start with 2 int arrays, a and b, each length 2.
     * Consider the sum of the values in each array.
     * Return the array which has the largest sum. In event of a tie, return a.
     */
    public Integer[] biggerTwo(Integer[] a, Integer[] b){
        int largest = (a[0] < b[0]) ? a[0] : b[0];
        Integer[] bigger;
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + ": " + b[i]);
            sumA += a[i];
            sumB += b[i];
        }
        bigger = (sumA > sumB) ? a : (sumA == sumB) ? a : b;
        return bigger;
    }

    /**
     * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
     * The array length will be at least 3.
     * example : midThree([1, 2, 3, 4, 5]); // Should return [2, 3, 4]
     *           midThree([8, 6, 7, 5, 3, 0, 9]); // Should return [7, 5, 3]
     */
    public Integer[] midThree(Integer[] nums){
        Integer[] midArray = new Integer[3];
        int middle = (nums.length / 2) + 1;
        int a = 0, b = 1, c = 2;

        for (int i = 0; i < midArray.length; i++) {
            if (nums.length == 3) {
                midArray[i] = nums[i];
            } else {
                midArray[a] = nums[middle - 2];
                midArray[b] = nums[middle -1];
                midArray[c] = nums[middle];
            }
        }
        return midArray;
    }
}
