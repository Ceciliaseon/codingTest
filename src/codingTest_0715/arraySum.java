package codingTest_0715;

public class arraySum{

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(solution(numbers , numbers.length));
    }

    // 정수형 배열 numbers가 매개변수로 주어질 때,
    // numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

    /* 제한사항
    *  0 <= numbers의 원소 <= 1,000
    *  1 <= numbers의 길이 <= 100
    *  정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
    * */

    public static double solution(int numbers[], int numbers_len) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < numbers_len; i++) {
            sum += numbers[i];
        }
        answer = sum / numbers_len;
        return answer;
    }

}
