//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Combinations("abcdef", 3);
    }

    public static void Combinations(String str, int size){
        if(str.isEmpty() || size <=0)
            return;

        int[] result = new int[size];
        Combinations(str, result, 0, size);
    }

    public static void Combinations(String str, int[] result,  int current, int size){

        if(current == size){
            printCombinations(str, result);
            // print and return
            return;
        }

        for(int i = 0 ; i < str.length(); i ++){
            result[current] = i;
            Combinations(str, result, current +1, size);
        }

    }

    static void printCombinations(String str, int[] result){
        char[] arr = str.toCharArray();
        for (int j : result) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}