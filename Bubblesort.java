package Sorting;

public class Bubblesort {
    static void bubbleSort(int arr[])
    {int temp;
        for (int i=0;i< arr.length-1;i++)
            for (int j=0;j< arr.length-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
    }
    public static void main(String[] args) {
        int arr[]={2,10,8,7};
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
