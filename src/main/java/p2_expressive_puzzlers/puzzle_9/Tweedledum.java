package p2_expressive_puzzlers.puzzle_9;

public class Tweedledum {

    public static void main(String[] args) {
        short x = 0;
        int i = 123456;

        /**
         * 컴파일 됨: 내부적으로 (short)(x + i)로 자동 강제 캐스팅
         *
         * 과정
         * 1. x 는 short 지만, i가 int 이므로, x는 자동으로 int 로 promotion 된다.
         * 2. x + i 는 int + int 이므로 최종 타입은 int
         * 3. x += i 는 내부적으로 (short)(x + i) 로 강제 캐스팅을 시킴 (명시적 narrowing)
         */
        x += i;

        /**
         * 컴파일 에러: int를 short에 직접 대입할 수 없음
         *
         * 과정
         * 1. x 는 short 지만, i가 int 이므로, x는 자동으로 int 로 promotion 된다.
         * 2. x + i 는 int + int 이므로 최종 타입은 int
         * 3. 최종 타입인 int 를 short 타입인 x 에 대입하려하여 컴파일 에러 (narrowing conversion 없으므로 컴파일 오류)
         */
//        x = x + i;
    }
}
