import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();

        String[] arrA = br.readLine().split(" ");
        String[] arrB = br.readLine().split(" ");

        HashSet<Integer> listA = new HashSet<>();
        HashSet<Integer> listB = new HashSet<>();

        for (int i = 0; i < arrA.length; i++) {
            listA.add(Integer.parseInt(arrA[i]));
        }

        int count = 0;

        for (int i = 0; i < arrB.length; i++) {
            int target = Integer.parseInt(arrB[i]);
            listB.add(target);
            if (listA.contains(target)) {
                count++;
            }
        }

        System.out.println(listB.size() + listA.size() - 2 * count);
    }
}
