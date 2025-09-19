//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Combinations("abc");
    }

    public static void Combinations(String str){
        if(str.isEmpty())
            return;

        int[] result = new int[str.length()];
        Combinations(str, result, 0);
    }

    public static void Combinations(String str, int[] result,  int current){

        if(current == str.length()){
            printCombinations(str, result);
            // print and return
            return;
        }

        for(int i = 0 ; i < str.length(); i ++){
            result[current] = i;
            Combinations(str, result, current +1);
        }

    }

    static void printCombinations(String str, int[] result){
        char[] arr = str.toCharArray();
        for(int i = 0 ; i < result.length ; i ++){
            System.out.print(arr[result[i]] + " ");
        }
        System.out.println();
    }


}