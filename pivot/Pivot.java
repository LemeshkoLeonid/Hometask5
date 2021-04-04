package pivot;

public class Pivot {
    public static void main(String[] args) {
        int n = 3;
        int [][] arr = new int[n][n];
        int [][] r_result = new int[n][n];

        for(int i = 0; i < arr.length; i++){
            System.out.println();
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = i+1;
                System.out.print(arr[i][j] + " ");
            }

        }
        System.out.println();
        System.out.println("----------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                r_result[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < r_result.length; i++) {
            System.out.println();
            for (int j = 0; j < r_result[0].length; j++){
                System.out.print(r_result[i][j] + " ");
            }
        }


    }
}

