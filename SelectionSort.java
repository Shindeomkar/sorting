package Sorting;

public class SelectionSort {
    static void selectionSort(int arr[])
    {

        for (int i=0;i< arr.length;i++)
        {
            int minindex=i;
            int temp;
            for (int j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
            temp=arr[i];
           arr[i]= arr[minindex];
           arr[minindex]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={10,5,8,20,2,18};
        selectionSort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
