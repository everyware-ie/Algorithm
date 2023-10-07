package phs00;

import java.util.*;

class Main {

    // 일곱난쟁이
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> heights = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            heights.add(scanner.nextInt());
        }

        while (true) {
            List<Integer> tempList = new ArrayList<>();
            for (Integer height : heights) {
                tempList.add(height);
            }
            int sum = 0;
            answer.clear();
            for (int i = 0; i < 7; i++) {
                Random random = new Random();
                int index = (int) (random.nextDouble() * tempList.size());
                Integer temp = tempList.get(index);
                answer.add(temp);
                tempList.remove(temp);
                sum += temp;
            }
            Collections.sort(answer);
            if (sum == 100) {
                for (Integer height : answer) {
                    System.out.println(height);
                }
                break;
            }
        }
    }


}
