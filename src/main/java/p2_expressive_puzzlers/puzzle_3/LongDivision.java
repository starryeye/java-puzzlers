package p2_expressive_puzzlers.puzzle_3;

public class LongDivision {

    public static void main(String[] args) {

        /**
         * problem..
         * 예상 결과 값 : 1000
         *
         * 모든 피연산자가 int 리터럴이므로,
         * 24 * 60 * 60 * 1000 * 1000 계산이 int로 먼저 수행된 뒤 long으로 변환됨
         * 이 계산 도중 int 최대값 2,147,483,647을 초과 → overflow 발생
         * 결과적으로 MICROS_PER_DAY는 잘못된 값이 되고, / 연산 결과도 잘못됨
         */
        final long MICROS_PER_DAY_1 = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY_1 = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY_1 / MILLIS_PER_DAY_1); // 5

        // solve..
        // 리터럴 중 하나에 L을 붙이면 전체 계산이 long 타입으로 수행됨
        // -> 오버플로우 없이 정확한 결과 계산 가능
        final long MICROS_PER_DAY_2 = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY_2 = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY_2 / MILLIS_PER_DAY_2); // 1000
    }
}
