package codingTest_0719;

public class array2bea {

    public static void main(String[] args){

    }

    //정수 배열 numbers 가 매개변수로 주어집니다.
    // numbers의 각 원소에 두배한 원소를 가진 배열을 return 하도록 solution 함수를 완성해주세요.

    // 제한사항
    // -10,000 <= numbers 의 원소 <= 10,000
    // 1 <= numbers 의 길이 <= 1000

    public static int[] solution(int[] numbers){
        int[] result = new int[numbers.length];
        for (int i=0;i<numbers.length;i++){
            result[i] = numbers[i] * 2;
        }
        return result;
    }
}
