package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2) {
        int res = op1 + op2;
        return res;
    }

    public static int multiply(int op1, int op2) {
        int res = op1 * op2;
        return res;
    }

    public static int divide(int op1, int op2) {
        int res = op1 / op2;
        return res;
    }

    public static int subtract(int op1, int op2) {
        int res = op1 - op2;
        return res;
    }

    public static int sumOfDigits(int number) {
        int res = 0;
        if (number < 0) {
            number = -number;
        }
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            res += digit;
        }
        return res;
    }

    public static int maxDigit(int number) {
        int max = 0;
        if (number < 0) {
            number = -number;
        }
        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }
        return max;
    }

    public static boolean isDividedOn(int number, int dividor) {
        if (dividor == 0) {
            return false;
        }
        if (number % dividor == 0) {
            return true;
        } else {
            return false;
        }
    }
}