package codingTest_0719;

public class median {

    public static void main(String[] args) {
        int[] array = {11,2,7,10,1};
        System.out.println(solution(array));
    }

    // 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    // 예를 들어 1,2,7,10의 중앙값은 7입니다.
    // 정수 배열 array 가 매개변수로 주어질 떄, 중앙값을 return 하도록 solution 함수를 완성해주세요.

    /* 제한 사항
       array의 길이는 홀수입니다.
       0 < array의 길이 < 100
       -1,000 < array의 원소 < 1,000
    */
    public static int solution(int array[]){
        int median = 0;
        int length = array.length;

        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        median = array[length/2];
        return median;
    }

}
