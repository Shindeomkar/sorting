package Sorting;

public class Naivepartition {
    static void naiviePartition(int arr[],int p)
    { int l=0,h= arr.length-1, k=0;
    int temp[]=new int[h-l+1];
    for (int i=l;i<=h;i++)
        if (arr[i]<=arr[p])
        {temp[k]=arr[i];k++;}

        for (int i=l;i<=h;i++)
            if (arr[i]>arr[p]){
                temp[k]=arr[i];k++;}

            for (int i=l;i<=h;i++)
                arr[i]=temp[i-l];

    }
    public static void main(String[] args) {
        int arr[]={2,1,3,5,7,9,4,8};
        naiviePartition(arr,5);
        for (int x:arr)
            System.out.print(x+" ");

    }
}
