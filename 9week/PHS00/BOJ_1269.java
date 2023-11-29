package PHS00;

import java.util.*;

// 대칭 차집합
public class BOJ_1269 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<Integer> A = new HashSet<>();

        for(int i = 0; i < n; i++){
            A.add(scanner.nextInt());
        }
        int count = 0;
        for(int i = 0; i < m; i++){
            Integer temp = scanner.nextInt();
            if(A.contains(temp)){
                count++;
            }
        }

        System.out.println(n + m - 2*count);
    }

}
