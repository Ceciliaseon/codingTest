package codingTest_0715;

public class EvenSum {
    public static void main(String[] args) {
        System.out.println(solution(14));
    }

    // 정수 n 이 주어질 때,
    // n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 완성해주세요.

    // 제한사항 >>  0 < n <= 1,000

    public static int solution (int n){
        int result = 0;
        for (int i = 0 ; i<=n;i++){
            if (i%2==0){
                result += i;
            }
        }
        return result;
    }
}
