package com.isa;

public class Main {

    public static void main(String[] args) {

        int array [] = {1,2,3,4,5,6};
        int subArray [] = {4,5};


        System.out.println(findArray(array, subArray));
    }

    public static int findArray(int[] array, int[] subArray) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        String str1 = sb.toString();

        sb = new StringBuilder();

        for (int j = 0; j < subArray.length; j++) {
            sb.append(subArray[j]);
        }
        String str2 = sb.toString();

        if (!str1.contains(str2)) {
            return -1;
        } else {
            return str1.lastIndexOf(str2);
        }
    }
}
