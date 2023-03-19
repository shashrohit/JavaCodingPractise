package org.shashank.problems.misc;

// Java program to merge overlapping Intervals in
// O(n Log n) time and O(1) extra space
import java.util.Arrays;
import java.util.Comparator;

// An Interval
class Interval
{
    int start,end;

    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}

public class MergeOverlappingIntervalsOfArray  {

    public static void mergeIntervals(Interval arr[])
    {
        // Sort Intervals in increasing order of start time
//        Arrays.sort(arr,new Comparator<Interval>(){
//            public int compare(Interval i1,Interval i2)
//            {
//                return i1.start - i2.start;
//            }
//        });

        Arrays.sort(arr, (i1, i2) -> i1.start-i2.start);

        int index = 0; // Stores index of last element
        for (int i=1; i<arr.length; i++)
        {
            // If this is not first Interval and overlaps with the previous one
            if (arr[index].end >= arr[i].start)
            {
                // Merge previous and current Intervals
                arr[index].end = Math.max(arr[index].end, arr[i].end);
            }
            else {
                index++;
                arr[index] = arr[i];
            }
        }

        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++)
        {
            System.out.print("[" + arr[i].start + "," + arr[i].end + "]");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Interval[] arr=new Interval[5];
        arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,12);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);
        arr[4]=new Interval(11,12);
        mergeIntervals(arr);
    }
}
