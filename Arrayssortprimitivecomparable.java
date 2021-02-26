package Sorting;

import java.util.Arrays;

public class Arrayssortprimitivecomparable {
    public static void main(String[] args) {
        int arr1[]=new int[]{3,1,4,2,5};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int arr2[]={1,5,2,6,3,7};
        Arrays.sort(arr2,1,4);
        System.out.println(Arrays.toString(arr2
        ));
    }
}
