package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        boolean result = areFibNumbers(0, 1, 1, 2, 3, 5, 8);
        System.out.println(result);
    }

    private static boolean areFibNumbers(int ...numbers) {
        if (numbers.length <= 3) {
            return false;
        }
        for (int i = 2; i < numbers.length; i++) {
            if (!(numbers[i] == numbers[i-1] + numbers[i-2])) {
                return false;
            }
        }

        return true;
    }
}
