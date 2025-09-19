import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = generateParenthesis(4);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static ArrayList<String> generateParenthesis(int n){
        ArrayList<String> combinations = new ArrayList<String>();
        char[] arr = new char[n*2];
        generateParenthesis(arr, 0, combinations);
        return  combinations;
    }

    static void generateParenthesis( char[] arr, int current, List<String> result){

        if(current == arr.length){
            // check if this is valid combination
            if(isValidParenthesis(arr))
                result.add(new String(arr));
        }else{
            arr[current] = '(';
            generateParenthesis(arr, current +1, result);
            arr[current] = ')';
            generateParenthesis(arr, current +1, result);
        }

    }

    static  boolean isValidParenthesis(char[] arr){
        int balance = 0;
        for (char ch: arr) {
            if(ch == '(')
                balance ++;
            else
                balance --;

            if(balance <0)
                return  false;
        }
        return  balance == 0;
    }

}