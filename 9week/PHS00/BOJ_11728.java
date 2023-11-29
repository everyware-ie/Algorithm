package PHS00;

import java.util.*;

// 배열합치기
public class BOJ_11728 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N+M];
        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < M; i++){
            arr[N+i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
