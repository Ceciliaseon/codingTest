package codingTest_0715;

import java.util.Arrays;

public class median {

    public static void main(String[] args) {
        int[] array = {11,2,7,10,1};
        System.out.println(solution(array, 3));
    }

    // 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    // 예를 들어 1,2,7,10의 중앙값은 7입니다.
    // 정수 배열 array 가 매개변수로 주어질 떄, 중앙값을 return 하도록 solution 함수를 완성해주세요.

    /* 제한 사항
       array의 길이는 홀수입니다.
       0 < array의 길이 < 100
       -1,000 < array의 원소 < 1,000
    */
    public static int solution(int array[], int array_len){
//
//        int answer = 0;
//        Arrays.sort(array);
//        return array[array.length/2];

            int answer = 0;
            int i,j,temp=0;
            for(i=0;i<array_len;i++){
                for(j=0;(j<array_len-1);j++){
                    if(array[j]>array[j+1]){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
            return answer=array[array_len/2];
    }

}
