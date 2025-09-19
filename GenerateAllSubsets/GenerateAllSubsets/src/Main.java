//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        generateAllSubsets("abc");
    }
    static void generateAllSubsets(String str){
        if(str.isEmpty()){
            return;
        }

        int[] result = new int[str.length()];
        generateAllSubsets(str, result, 0);

    }

    static void generateAllSubsets(String str, int[] result, int current){

        if(current == result.length){
            // print and return;
            printSubsets(str, result);
            return;
        }

        for(int i = 0; i < 2; i ++){
            result[current] = i;
            generateAllSubsets(str, result, current +1);
        }
    }
    static  void printSubsets(String str, int[] result){
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int i = 0 ; i < result.length; i ++){
            if(result[i] == 1){
                sb.append(arr[i]).append(",");
            }
        }
        // delete trailing comma
        if(sb.toString().length() != 1){
            sb.deleteCharAt(sb.toString().length() -1);
        }
        sb.append("}");
        System.out.println(sb.toString());

    }
}