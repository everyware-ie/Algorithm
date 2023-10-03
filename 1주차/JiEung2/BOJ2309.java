import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2309 {
    public static void main(String[]
                                    args) throws IOException {
        int n = 9;
        int[] arr = new int[n];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for(int i=0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(sum - arr[i] - arr[j] == 100){
                    for(int k = 0; k < arr.length; k++){
                        if(k != i && k != j) System.out.println(arr[k]);
                    }
                    System.exit(0);
                }
            }
        }

    }
}
