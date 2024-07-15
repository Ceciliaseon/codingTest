package codingTest_0715;

public class age {

    // 선생님의 태어난 년도 확인
    // 2022년 기준 선생님의 나이 age 가 주어질 때,
    // 선생님의 출생 연도를 return 하는 solutuon 함수를 완성해주세요

    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}
