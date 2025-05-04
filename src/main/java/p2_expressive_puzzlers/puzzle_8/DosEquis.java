package p2_expressive_puzzlers.puzzle_8;

public class DosEquis {

    public static void main(String[] args) {

        /**
         * problem..
         * 두개의 출력 모두 x 변수를 출력하므로 X 가 출력 될 것으로 예상.. 실제로는 마지막 출력은 88 출력..
         *
         * 이유..
         * Java 의 3항 연산자 "?:" 는 조건식의 두 피연산자의 타입에 따라 결과 타입이 달라짐
         * char 와 int 혼합 사용 시 컴파일러의 타입 결정 규칙이 작동
         *
         * true ? x : 0
         *      x: char, 0: int 상수
         *      0 은 char 로 표현 가능한 컴파일 타임 상수이므로, 결과 타입은 char
         *      출력: 'X' (유니코드 문자)
         *
         * false ? i : x
         *      i: int 변수, x: char
         *      i 는 변수이므로 상수 취급 안됨 → binary numeric promotion 발생
         *      결과 타입은 int, char x 가 int 로 자동 변환 → 'X'의 코드값 88 출력됨
         *
         * 참고. (컴파일러의 3항 연산자 타입 결정 규칙, JLS 15.25)
         * 1. 두 피연산자의 타입이 같으면 → 그 타입
         * 2. 한쪽이 byte, short, char이고, 다른 한쪽이 int 상수이며 값이 표현 가능하면 → 좁은 쪽 타입 사용
         * 3. 그 외 → binary numeric promotion 적용
         * → 이 문제에서 2번 규칙이 첫 줄에는 적용되지만, 두 번째 줄에는 적용되지 않음
         * → 결과적으로 첫 줄은 char, 두 번째 줄은 int
         */
        char x = 'X';
        int i = 0;
        System.out.println(true ? x : 0); // X
        System.out.println(false ? i : x); // 88

        /**
         * solve..
         * 두 조건문의 피연산자를 명확히 같은 타입으로 맞추자
         */
        System.out.println(true ? x : (char) 0); // X
        System.out.println(false ? (char) i : x); // X
    }
}
