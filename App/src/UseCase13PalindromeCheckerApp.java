public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        long startTime = System.nanoTime();

        boolean isPalindrome = true;

        String normalized = input.toLowerCase();

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        }

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}