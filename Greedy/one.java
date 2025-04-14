import java.util.*;
public class one{
    // Assign cookies
    public static void main(String args[]){
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.print(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0;
        int right = 0;
        int count=0;
        while(left<g.length && right<s.length){
            if(g[left] <= s[right]){
                count++;
                // left++; OR Part
                right++;
            }
            // else if(g[left]<s[right]){
            //     left++;
            // }
            // else{
            //     right++;
            // }
            //OR
            left=left+1;
        }
        return count;
    }
}