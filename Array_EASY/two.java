import java.util.*;
public class two{
    // Second largest element in an array
    public static void main(String args[]){
        int[] arr = {23,56,2,345,789,52,445};
        // System.out.print(bruteForce(arr));

        // System.out.print(BetterApproach(arr));

        System.out.print(Optimal(arr));
    }
    public static int bruteForce(int[] arr){ //  TC -> O( n * logn) + O(n) 
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static int BetterApproach(int[] arr){  // TC -> O(2n)
        int largest = arr[0];
        for(int el : arr){
            largest = Math.max(el,largest);
        }
        int secondLargest = Integer.MIN_VALUE;
        for(int el : arr){
            if(el>secondLargest && el<largest){
                secondLargest = el;
            }
        }
        return secondLargest;
    }
    public static int Optimal(int[] arr){  // TC -> O(n)
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int el : arr){
            if(el>largest){
                secondLargest = largest;
                largest = el;
            }
            if(el<largest && el>secondLargest){
                secondLargest = el;
            }
        }
        return secondLargest;
    }
}