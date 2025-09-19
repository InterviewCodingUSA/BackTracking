//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int[] arr = {1,1,5,3,2,4};
         generateAllSequenceSumEqualToK(arr, 5);
    }

    static  void generateAllSequenceSumEqualToK(int[] arr, int k){
        if(arr.length == 0 )
            return;

        int[] result = new int[arr.length];

        generateAllSequenceSumEqualToK(arr, result, 0, k);

    }

    static  void generateAllSequenceSumEqualToK(int[] arr, int[] result, int current, int k){

        if(current == result.length){
            // print and retuyrnl
            printSumEqualToK(arr, result, k);
            return;
        }

        for(int i = 0 ; i < 2; i ++){
            result[current] = i;
            generateAllSequenceSumEqualToK(arr, result, current +1, k);
        }
    }

    static  void printSumEqualToK(int[] arr, int[] result, int k){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        int sum = 0;
        for(int i = 0 ; i < result.length; i ++){
            if(result[i] == 1){
                sum += arr[i];
                sb.append(arr[i]).append(",");
            }
        }
        // remove trailing comma.
        if(sb.toString().length() != 1){
            sb.deleteCharAt(sb.toString().length() -1);
        }
        sb.append("}");
        if(sum == k)
            System.out.println(sb.toString());

    }
}