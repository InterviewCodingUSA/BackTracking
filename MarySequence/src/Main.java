import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        generateMarySequence(4, 5);
    }

    public static void generateMarySequence(int size, int m ){

        if(size <= 0 || m <=0 )
            return;
        int[] result = new int[size];
        generateMarySequence(result, 0, m);

    }

    private static void generateMarySequence(int[] result, int curr, int m){

        if(curr == result.length){
            // print and return
            printResult(result);
            return;
        }

        for(int i = 0; i < m; i ++){
            result[curr] = i;
            generateMarySequence(result, curr+ 1, m );
        }
    }

    private static void printResult(int[] result){
        System.out.println(Arrays.toString(result));
    }

}