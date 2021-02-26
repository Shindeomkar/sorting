package Sorting;

public class Quicksortusinglomuto {
    static void qsort(int arr[],int l,int h)
    {
        int p=sort(arr, l, h);
        sort(arr,l,p-1);
        sort(arr,p+1,h);

    }
    static int  sort(int arr[],int l,int h)
    {
        int p=arr[h];
        int i=l-1;
        int temp;
        for (int j=l;j<=h;j++)
        {
            if(arr[j]<p)
            {
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return (i+1);
    }
    public static void main(String[] args) {
        int  arr[]=new int[]{10,80,30,90,40,50,70};
        qsort(arr,0,6);
        for (int x:arr)
            System.out.print(x+" ");


    }
}
