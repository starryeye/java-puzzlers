package p3_puzzlers_with_characters.puzzle_12;

public class Abc {

    public static void main(String[] args) {

        /**
         * problem..
         * 배열도 객체이니까.. 아래 출력을 ABC easy as 123 이라 생각할 수 있지만, 아니다..
         *
         * 이유
         * 문자열과 문자 배열을 "+" 연산하면..
         *      "ABC" + Object.toString(문자 배열) 로 해석됨
         *          char[]는 객체 타입 → Object.toString() 호출됨
         *          char[]는 Object의 toString()을 그대로 상속 → 출력 형식은 [C@해시코드
         */
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
        System.out.println(letters + " easy as " + numbers); // ABC easy as [C@7ad041f3

        // solve..1
        System.out.println(letters + " easy as " + String.valueOf(numbers)); // ABC easy as 123
        // solve..2
        System.out.println(letters + " easy as " + new String(numbers)); // ABC easy as 123
    }
}
