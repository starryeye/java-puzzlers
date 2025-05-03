package p2_expressive_puzzlers.puzzle_1;

public class Oddity {

    public static boolean isOdd(int i) {
        /**
         * problem..
         * 홀수를 판별하는 메서드로 의도하였지만..
         * mod 연산자는 왼쪽 피연산자의 부호를 따르기 때문 음수 홀수에 대해 동작하지 않는 메서드이다.
         */
        return i % 2 == 1;
    }

    public static boolean isOdd_fixed_mod(int i) {
        return i % 2 != 0;
    }

    public static void main(String[] args) {

        int[] testCases = { -3, -2, -1, 0, 1, 2, 3 };

        System.out.println("== Original isOdd(i % 2 == 1) ==");
        for (int i : testCases) {
            System.out.printf("isOdd(%d) = %b\n", i, isOdd(i));
        }

        System.out.println("\n== Fixed Version: isOdd_fixed_mod(i %% 2 != 0) ==");
        for (int i : testCases) {
            System.out.printf("isOdd_fixed_mod(%d) = %b\n", i, isOdd_fixed_mod(i));
        }
    }
}

