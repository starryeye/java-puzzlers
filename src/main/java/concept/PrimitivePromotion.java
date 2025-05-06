package concept;

public class PrimitivePromotion {

    /**
     * Java data type > primitive type
     * byte         8bits(1byte)    -2^7 ~ 2^7-1 (-128 ~ 127)
     * short       16bits(2byte)    -2^15 ~ 2^15-1 (-32768 ~ 32767)
     * int         32bits(4byte)    -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
     * long        64bits(8byte)    -2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
     * float       32bits(4byte)    0x0.000002P-126f ~ 0x1.fffffeP+127f
     * double      64bits(8byte)    0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023
     * char        16bits(2byte)    \u0000 ~ \uffff (0 ~ 2^15-1) * 자바에서 unsgined로 동작하는 자료형
     * boolean      1bit            true, false
     */

    public static void main(String[] args) {

        /**
         * Java 에서 primitive promotion(기본형 승격)은
         * 서로 다른 primitive 타입 간 연산이나 메서드 호출 시,
         * 더 큰 타입으로 자동 변환되는 과정을 말한다.
         * 자동 형변환(implicit type conversion) 또는 자동 타입 승격이라고도 불린다.
         *
         * byte, short, char는 산술 연산 시 무조건 int로 승격(promoted)된다.
         * 그 외에도 더 큰 타입이 있는 경우, 더 작은 타입은 자동으로 더 큰 타입으로 변환된다.
         *
         * boolean 은 승격 안됨.
         */


        // 1. byte, short, char는 int로 승격됨
        byte a = 10;
        byte b = 20;

//        byte c = a + b; // 컴파일 오류: a + b 는 int형이므로 byte에 저장 불가
        int c = a + b;      // OK


        // 2. 다른 타입끼리 연산 시 더 큰 타입으로 승격
        int i = 100;
        long l = 200L;
        long result = i + l; // int + long → long

        float f = 3.14f;
        double d = 2.0;
        double result2 = f + d; // float + double → double


        // 3. char 도 int로 승격됨
        char e = 'A'; // 유니코드 65
        int result3 = e + 1; // char + int → int
        System.out.println(result3); // 66

    }
}
