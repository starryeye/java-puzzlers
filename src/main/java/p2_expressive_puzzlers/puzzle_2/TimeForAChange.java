package p2_expressive_puzzlers.puzzle_2;

import java.math.BigDecimal;

public class TimeForAChange {

    public static void main(String[] args) {

        /**
         * problem..
         * 아래 연산의 예상 결과는 0.90 인데 출력값은 0.8999999999999999 이다..
         *
         * 이유..
         * Java에서 double은 이진 부동소수점 표현을 사용
         * 1.1은 2진수로 정확히 표현 불가 → 가장 근접한 근사값으로 저장됨
         * 2.0에서 이 근사값을 빼면 정확히 0.9가 아니라 근사값이 나옴
         */
        System.out.println(2.00 - 1.10);

        // solve 1..
        // 겉보기엔 맞지만 여전히 내부 계산은 double 기반 → 본질적인 문제 해결 아님
        System.out.printf("%.2f%n", 2.00 - 1.10); // "0.90" 출력됨

        // solve 2..
        // 정수형을 사용해버린다.
        System.out.println((200 - 110) + " cents"); // 90 cents

        // solve 3..
        // BigDecimal 을 사용한다.
        System.out.println(
                new BigDecimal("2.00")
                        .subtract(new BigDecimal("1.10"))
        ); // 0.90
    }
}
