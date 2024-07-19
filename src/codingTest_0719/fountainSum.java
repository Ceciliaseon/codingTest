package codingTest_0719;

import java.util.Arrays;

public class fountainSum {
    public static void main(String[] args) {
        fountainSum fountainSum = new fountainSum();
        System.out.println(Arrays.toString(fountainSum.solution (2,3,3,4)));
    }

    // 첫 번째 분수의 분자와 분모를 뜻하는 num1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 num2, denom2가 매개변수로 주어짐
    // 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해주세요.

    // 제한사항
    // 0 < num1, denom1, num2, denom2 < 1,000

    public int[] solution (int numer1, int denom1, int numer2, int denom2) {
        int numerator  = (numer1*denom2)+(numer2*denom1); //분자
        int denominator  = denom1*denom2; //분모

        for (int i= numerator-1;i>1;i--){
            if (numerator%i==0 && denominator%i==0){
                numerator/=i;
                denominator/=i;
            }
        }

        int [] answer = {numerator, denominator};
        return answer;
    }

}

