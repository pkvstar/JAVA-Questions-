import java.util.*;
public class fibo{
    //? 0 1 1 2 3 5 8 13 21 .....
    // f(0) -> 0 , f(2) -> 1 , f(5) -> 5
    public static void main(String args[]){
        int n = 5;
        // System.out.print(rec_fibo(n));

        // Integer[] dp = new Integer[n+1];
        // System.out.print(memo_fibo(n,dp));

        // System.out.print(tabulation_fibo(n));

        System.out.print(optimal_fibo(n));
    }
    // recursive solution
    public static int rec_fibo(int n){
        if(n<=1){
            return n;
        }
        int first = rec_fibo(n-1);
        int second = rec_fibo(n-2);
        return first+second;
    }

    // memoization
    public static int memo_fibo(int n,Integer[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n] != null){
            return dp[n];
        }
        int first = memo_fibo(n-1,dp);
        int second = memo_fibo(n-2,dp);
        return dp[n]=first+second;
    }

    // tabulation
    public static int tabulation_fibo(int n){
        if(n<=1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    // optimal code (extension of tabulation)
    public static int optimal_fibo(int n){
        if(n<=1){
            return n;
        }
        int prev = 1;
        int secondPrev = 0;
        for(int i=2;i<=n;i++){
            int curr = prev+secondPrev;
            secondPrev = prev;
            prev = curr;
        }
        return prev;
    } 
}