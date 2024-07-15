package codingTest_0715;

public class division {

    // 정수 num1과 num2가 매개변수로 주어질 때,
    // num1을 num2로 나눈 값에 1,000을 곱한 후
    // 정수 부분을 return 하도록 solution 함수를 완성해주세요.

    /* 제한사항
    *  0 < num 1 <= 100
    *  0 < num 2 <= 100
    * */

    public static void main(String[] args) {
        System.out.println(solution(7, 3));
    }

    public static int solution(double num1, double num2) {
        double answer = (num1 / num2)*1000;
        return (int) answer;
    }
}
