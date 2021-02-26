package Sorting;

import java.util.Arrays;
import java.util.Comparator;
// This class implements
// Comparator interface to compare
 class Mycomp implements Comparator<Point>
{
    public int compare(Point p1,Point p2)
    {
        return p1.x - p2.x;
    }
}
class Point
{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
public class Arrayssortnonprimitivecomparator {
    public static void main(String[] args) {
        Point arr[]={new Point(3,5),new Point(2,5),new Point

                (1,3)};
        Arrays.sort(arr, new Mycomp());
        for (int i=0;i< arr.length;i++)
            System.out.println(arr[i].x+" "+arr[i].y);
    }
}
