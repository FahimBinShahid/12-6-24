public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 202;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " not a palindrome");
        }

    }

    public static boolean isPalindrome(int number) {

        int orginalnumber = number;
        int reverse = 0;
            while (number != 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number /= 10;
            }
            return orginalnumber == reverse;


        }
    }
