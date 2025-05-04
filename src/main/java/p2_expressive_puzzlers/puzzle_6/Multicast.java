package p2_expressive_puzzlers.puzzle_6;

public class Multicast {

    public static void main(String[] args) {

        /**
         * problem..
         * -1 → byte → char → int 로 -1 이 출력될 것으로 예상되나.. 65535 이 출력됨..
         *
         * -1 → byte (명시적 narrowing)
         *      int는 32비트, byte는 8비트
         *      -1은 2의 보수로 0xFFFFFFFF (32비트에서 모든 비트가 1)
         *      하위 8비트만 남기면 0xFF → -1 (여전히 byte에서 -1 유지)
         * byte → char
         *      핵심! byte는 signed, char는 unsigned
         *      byte -1 → int -1 → char 65535
         *      이건 widening + narrowing conversion이고, sign extension 없이 0xFF 그대로 이동
         *      char의 16비트 값 0xFFFF → 65535
         * char → int
         *      char는 unsigned이므로 zero-extension
         *      char 65535 → int 65535
         */
        System.out.println((int) (char) (byte) -1); // 출력: 65535

        /**
         * 참고.. Java data type > primitive type
         * byte         8bits(1byte)    -2^7 ~ 2^7-1 (-128 ~ 127)
         * short       16bits(2byte)    -2^15 ~ 2^15-1 (-32768 ~ 32767)
         * int         32bits(4byte)    -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
         * long        64bits(8byte)    -2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
         * float       32bits(4byte)    0x0.000002P-126f ~ 0x1.fffffeP+127f
         * double      64bits(8byte)    0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023
         * char        16bits(2byte)    \u0000 ~ \uffff (0 ~ 2^15-1) * 자바에서 unsgined로 동작하는 자료형
         * boolean      1bit            true, false
         */
    }
}
