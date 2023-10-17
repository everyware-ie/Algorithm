import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_42840 {
    public int[] solution(int[] answers) {
        int index1 = 1, index2 = 2, index3 = 3;

        int[] correct = new int [3];
        Arrays.fill(correct, 0);

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == index1) {
                correct[0]++;
            }
            if (answers[i] == index2) {
                correct[1]++;
            }
            if (answers[i] == index3) {
                correct[2]++;
            }


            // 1
            if (index1 == 5) {
                index1 = 1;
            } else index1++;

            // 2
            if (i % 2 == 1) {
                index2 = 2;
            } else {
                int div = i % 8;
                if (div == 0) index2 = 1;
                if (div == 2) index2 = 3;
                if (div == 4) index2 = 4;
                if (div == 6) index2 = 5;
            }

            // 3
            if (i % 2 == 1) {
                if (index3 == 3) index3 = 1;
                else if (index3 == 2) index3 = 4;
                else if (index3 == 5) index3 = 3;
                else index3++;
            }
            System.out.println("1 " + index1);
            System.out.println("2 " + index2);
            System.out.println("3 " + index3);
        }

        List<Integer> list = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(correct[i]);
            if (correct[i] > max) {
                list = new ArrayList<>();
                list.add(i + 1);
                max = correct[i];
            }
            else if (correct[i] == max) list.add(i + 1);
        }

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
