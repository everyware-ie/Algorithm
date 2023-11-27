import java.util.ArrayList;
import java.util.List;

public class Programmers_ {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();

        int value = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                list.add(arr[i]);
                value = arr[i];
            }
        }

        return list
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
