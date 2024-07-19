package codingTest_0719;

import java.util.Arrays;

public class NoEven {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(10)));
    }

    // 정수 n이 매개변수로 주어질 때,
    // n 이하의 홀수가 호르차순으로 담긴 배열을 return 하도록 solution 함수를 완성해주세요.

    // 제한사항
    // 1 <= n <= 100

    public static int[] solution(int n){
        int[] result = new int[(n+1)/2];
        for (int i=0;i<result.length;i++){
            result[i] = i*2+1;
        }
        return result;
    }
}
