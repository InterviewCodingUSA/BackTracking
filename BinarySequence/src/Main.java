import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        generateBinarySequence(4);
    }

    public static void generateBinarySequence(int n){
        if(n <= 0)
            return;
        int[] result = new int[n];
        generateBinarySequence(result, 0);
    }

    private static void generateBinarySequence(int[] result, int curr){

        if(curr == result.length){
            // print and return
            printResult(result);
            return;
        }

        for(int i = 0; i < 2; i ++){
            result[curr] = i;
            generateBinarySequence(result, curr+ 1);
        }
    }

    private static  void printResult(int[] result){
        System.out.println(Arrays.toString(result));
//        for(int i = 0 ; i < result.length; i ++){
//            System.out.print(result[i] +  " ");
//        }
//        System.out.println();
    }

}