package codingTest_0719;

import java.util.Arrays;

public class mode {

    public static void main(String[] args){
        System.out.println(solution(new int[]{1,1,2,2}));
    }

    // 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    // 정수 배열 array 가 매개변수로 주어질 때,
    // 최빈값을 return 하도록 solution 함수를 완성해주세요.
    // 최빈값이 여러개면 -1을 return 합니다.

    // 제한사항
    // 0 < array 의 길이 < 100
    // 0 <= array 의 원소 < 1000

    public static int solution(int[] array){
        int[] count = new int[1000];
        for (int i=0;i<array.length;i++){
            count[array[i]]++;
        }

        int max = 0;
        int maxIndex = 0;
        for (int i=0;i<count.length;i++){
            if (count[i]>max){
                max = count[i];
                maxIndex = i;
            }
        }

        int cnt = 0;
        for (int i=0;i<count.length;i++){
            if (count[i]==max){
                cnt++;
            }
        }

        if (cnt>1){
            return -1;
        } else {
            return maxIndex;
        }
    }
}
