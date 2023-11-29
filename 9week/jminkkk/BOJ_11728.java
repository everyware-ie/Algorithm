import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String size = br.readLine();

        String[] arrA = br.readLine().split(" ");
        String[] arrB = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrA.length; i++) {
            list.add(Integer.parseInt(arrA[i]));
        }

        for (int i = 0; i < arrB.length; i++) {
            list.add(Integer.parseInt(arrB[i]));
        }

        Collections.sort(list);
        for (int num : list) {
            bw.write(num + " ");
        }
        bw.flush();
        bw.close();
    }
}
