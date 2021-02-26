package Sorting;

import java.util.Arrays;

class point implements Comparable <point>
{
    int x,y;
    point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(point o) {
        return this.x-o.x;
    }
}
public class Arrayssortnonprimitive {
    public static void main(String[] args) {
        point arr[]={new point(3,4),new point(2,5),new point(5,1),new point(5,6)};
        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++)
            System.out.println(arr[i].x+" + "+arr[i].y);

    }

}
