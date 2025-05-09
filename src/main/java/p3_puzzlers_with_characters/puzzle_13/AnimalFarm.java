package p3_puzzlers_with_characters.puzzle_13;

public class AnimalFarm {

    public static void main(String[] args) {

        /**
         * problem..
         * 아래 출력이 "Animals are equal: true" 라고 생각할 수 있지만..
         * "Animals are equal: " 문자열은 출력도 안되고.. "false" 로 출력된다.
         *
         * 이유
         * Java 에서 "+"는 "=="보다 높은 연산자 우선순위를 가진다.
         * 따라서, System.out.println(("Animals are equal: " + pig) == dog); 로 해석된다.
         *
         * 참고
         * pig == dog 연산의 결과도 false 인데..
         * pig 의 경우에는..
         *      리터럴 "length: 10"은 컴파일 타임 상수이므로 상수 풀(String constant pool)에 들어간다.
         * dog 의 경우에는..
         *      "length: "는 상수이지만 pig.length()는 런타임에 평가된다. (이 전체 식은 컴파일 타임에 평가될 수 없음)
         *      따라서 "length: 10"이라는 새로운 String 객체가 런타임에 생성됨
         * 그래서, 문자열 값 비교는 상수 풀인 것 같더라도 항상 equals() 를 사용하자..
         */
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println("Animals are equal: " + pig == dog); // 출력 : false

        // solve..
        System.out.println("Animals are equal: " + pig.equals(dog)); // 출력 : Animals are equal: true
    }
}
