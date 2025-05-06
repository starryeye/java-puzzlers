package p3_puzzlers_with_characters.puzzle_11;

public class LastLaugh {

    public static void main(String[] args) {

        /**
         * problem..
         * 아래 두 출력결과를 같다고 생각할 수 있지만, 실제는 서로 다르다.
         *
         * 이유
         * char + char 는 문자열 연결이 아니다.
         */

        // 문자열 리터럴끼리의 "+" 연산 → 문자열 연결
        System.out.println("H" + "a"); // Ha

        // 문자 리터럴끼리의 "+" 연산 → 숫자 덧셈 (char → int 변환)
        // 'H' == 72, 'a' == 97 → 72 + 97 == 169
        System.out.println('H' + 'a'); // 169
    }
}
