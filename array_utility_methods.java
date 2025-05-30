package fsd53.str_arr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDynamic {
    //Arrays class methods
    //toString,deepToString,equals,deepEquals,sort,copyOf,copyOfRange,fill,binarySearch
    public static void main(String[] args) {
//        dyn1();
//        arr2();
//        array2D();
//        arrMeth();
    }

    private static void dyn1() {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = new int[5];
//        System.out.println(Arrays.toString(arr3));
//        arr3[3]=100;
//        arr3[0]=140;
//        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i <= arr3.length - 1; i++) {
            System.out.println("Enter the value");
            arr3[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr3));
//        for(datatype reference : array or Collection){}
        String s = "acd";
        for (char c : s.toCharArray()) {
        }
        for (int i : arr3) {
            System.out.print(i);
        }
        char[] c = {'a', 'z', 'c'};
        String[] str_arr = {"apple", "orange"};
        for (String st : str_arr) {
            System.out.println(st);
        }
    }

    private static void arr2() {
        int[] arr = {1, 2, 3, 3, 45, 55, 6, 7, 18};
        //(arr.length%2==0)?arr.length:arr.length+1
        //(arr.length-(arr.length/2))
        int[] a1 = new int[arr.length / 2];
        int[] a2 = new int[arr.length - (arr.length / 2)];
        int i = 0, j = 0;
        while (i < arr.length) {
            if (i < a1.length) {//first array fill
                a1[i] = arr[i];
            } else {//second array fill
                a2[j] = arr[i];
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }

    private static void arra() {
        int[] arr1 = {1, 2, 3, 4};//1D
//        int[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};//1D
        int[][] arr2 = {
                {1, 2, 24, 4, 4, 43, 34, 45},
                {3, 4},
                {5, 6}
        };//2D
        int[][][] arr3 = {
                {{1, 2}, {3, 4}, {5, 6}},
                {{10, 12, 1, 1, 1, 1, 11, 1, 123}, {1}},
                {{10, 12}, {1}},
                {{10, 12}, {1}},
                {{10, 12}, {1}}
        };//3D
        System.out.println(arr3[1][2][0]);
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[1][0]);
    }

    private static void array2D() {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6}, {7, 8, 9, 10, 11}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {//j < arr.length //j < arr[i].length
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
        int[][] arrr = new int[2][2];//[row size][col size]
        System.out.println(Arrays.deepToString(arrr));
    }

    private static void arrMeth() {
        //Arrays class method (Arrays utility methods)
        int[] arr1 = {9, 32, 3, 336, 4, 55};
        int[] arr3 = {9, 32, 3, 336, 4, 55};
        int[][] arr2 = {arr1, {1, 2, 4}};
        int[][] arr4 = {arr1, {1, 2, 4}};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println(Arrays.deepEquals(arr2, arr4));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        //copy array values
        int[] a1 = {1, 32, 3, 14, 234, 25};
        int[] a2 = a1;//shallow copy (affect)
        int[] a3 = Arrays.copyOf(a1, 3);//deep copy (doesn't affect)
        int[] a4 = Arrays.copyOf(a1, a1.length);//deep copy (doesn't affect)
        int[] a5 = Arrays.copyOf(a1, 10);//deep copy (doesn't affect)
        int[] a6 = Arrays.copyOfRange(a1, 1, 5);//deep copy (doesn't affect)
        Arrays.fill(a6, 10);//fill the array  values 10
        System.out.println(Arrays.binarySearch(a1, 10));//find the value in the given array
        System.out.println(Arrays.binarySearch(a1, 1, 5, 10));//find the value in the given array
    }
}