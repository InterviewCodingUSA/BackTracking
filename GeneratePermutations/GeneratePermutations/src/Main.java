//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        permutations("ABC");
    }

    public static  void permutations(String str){
        if(str.isEmpty()){
            return;
        }

        int[] result = new int[str.length()];

        permutations(str, result, 0);


    }

    static  void permutations(String str, int[] result, int current){

        if(current == result.length){
            printCombinations(str, result);
            return;
        }

        for(int i = 0 ; i < str.length(); i ++){
            if(isValidPermutation(result, current, i)){
                result[current] = i;
                permutations(str, result, current +1);

            }

        }

    }

    static  boolean isValidPermutation(int[] result, int current, int num){

        for(int i = 0 ; i < current; i ++){
            if(result[i] == num )
                return  false;

        }
        return  true;

    }

    static void printCombinations(String str, int[] result){
        char[] arr = str.toCharArray();
        for(int i = 0 ; i < result.length ; i ++){
            System.out.print(arr[result[i]] + " ");
        }
        System.out.println();
    }

}