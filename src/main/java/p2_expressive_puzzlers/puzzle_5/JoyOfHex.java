package p2_expressive_puzzlers.puzzle_5;

public class JoyOfHex {

    public static void main(String[] args) {

        /**
         * problem..
         * 3번에 따르면, 두개의 피연산자 중 하나에 L 을 붙였으므로 전체 계산 타입은 long 이므로..
         * 출력 값은 1cafebabe 로 나올 것으로 예상 했지만, cafebabe 이 출력된다..
         *
         * 이유..
         * 0xcafebabe 는 기본적으로 int 리터럴이며, 이 값은 32비트에서 최상위 비트가 1인 음수값
         * Java는 해당 값을 int → long으로 변환할 때 sign extension을 수행하여
         * 0xffffffffcafebabeL이 됨
         *
         * 따라서, 0x100000000L + 0xffffffffcafebabeL = 0x00000000cafebabeL
         * 로.. 상위 비트가 상쇄되어 결과는 오히려 cafebabe 만 남음
         */
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe)); // cafebabe


        /**
         * solve..
         * 16진수 리터럴도 int 타입이 기본
         * 0xCAFEBABE처럼 상위 비트가 1인 경우 → int로 해석되면 음수
         * 산술 연산 전에 타입 변환 발생 시, "sign extension" 이 적용되어 예상치 못한 오버플로우 발생
         * 리터럴에는 타입 명시 (L) 를 철저히 붙이자
         *
         * 참고..
         * 덧셈 계산이 long 으로 진행되는 건 맞다
         * 하지만 덧셈 전에 0xcafebabe 는 int 임..
         * 즉, (long) 0xcafebabe → 0xffffffffcafebabeL 로 읽히는 것
         */
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
