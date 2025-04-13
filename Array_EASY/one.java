import java.util.*;
public class one{
    // Largest element in a array
    public static void main(String args[]){
        int[] arr = {23,56,2,345,789,52,445};
        // System.out.print(bruteForce(arr));

        System.out.print(optimal(arr));
    }
    public static int bruteForce(int[] arr){ // TC -> O(n * logn)
        Arrays.sort(arr);
        return arr[arr.length-1];
    } 
    public static int optimal(int[] arr){ // TC -> O(n)
        int max = arr[0];
        for(int el : arr){
            max = Math.max(el,max);
        }
        return max;
    }
}