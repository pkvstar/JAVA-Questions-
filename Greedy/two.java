import java.util.*;
public class two{   
    // lemonade change
    public static void main(String args[]){
        int[] arr = {5,5,5,5,10,10,20,20};
        System.out.print(lemonadeChange(arr));
    }
    public static boolean lemonadeChange(int []bill) { // TC -> O(n)
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int el : bill){
            if(el == 5) five++;
            else if(el == 10){
                if(five>=1){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five=five-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}