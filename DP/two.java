import java.util.*;
public class two{
    // Count distinct ways to climb stairs
    public static void main(String args[]){
        int stairs = 5;
        // System.out.print(rec_stairs(stairs));

        Integer[] dp = new Integer[stairs+1];
        System.out.print(memo_stairs(dp,stairs));
    }
    public static int rec_stairs(int n){ // TC -> O( 2^n )
        if(n==0 || n==1){
            return 1;
        }
        int left = rec_stairs(n-1);
        int right = rec_stairs(n-2);
        return left+right;
    }
    public static int memo_stairs(Integer[] dp,int idx){  // TC -> O(n) + O(n) => O(n)
        if(idx==0 || idx==1){
            return 1;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }
        int left = memo_stairs(dp,idx-1);
        int right = memo_stairs(dp,idx-2);
        return dp[idx] = left+right;
    }
}