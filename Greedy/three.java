import java.util.*;
public class three{   
    // Shortest Job First (or SJF) CPU Scheduling
    public static void main(String args[]){ // TC -> O( n ) + O(n * logn)
        int[] arr = {4,3,7,1,2};
        Arrays.sort(arr);
        int time = 0;
        int waitTime = 0;
        for(int i=0;i<arr.length;i++){
            waitTime+=time;
            time+=arr[i];
        }
        System.out.print(waitTime/arr.length);
    }
}