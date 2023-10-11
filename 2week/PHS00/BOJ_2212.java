package PHS00;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 센서
public class BOJ_2212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if(K >= N){
            System.out.println(0);
        }else{
            List<Integer> position = new ArrayList<>();
            for(int i = 0; i < N; i++){
                position.add(scanner.nextInt());
            }
            Collections.sort(position);

            List<Integer> dis = new ArrayList<>();
            for(int i = 1; i < position.size(); i++){
                dis.add(position.get(i) - position.get(i-1));
            }
            Collections.sort(dis);
            for(int i = 0; i < K-1; i++){
                dis.remove(dis.size()-1);
            }
            int sum = 0;
            for(int i = 0; i < dis.size(); i++){
                sum += dis.get(i);
            }
            System.out.println(sum);
        }
    }
}
