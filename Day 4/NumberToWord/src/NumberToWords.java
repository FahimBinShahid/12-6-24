public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(47));
        System.out.println(getDigitCount(8));
        System.out.println(getDigitCount(97));
        System.out.println(getDigitCount(66));

        System.out.println(reverse(47));
        System.out.println(reverse(125));
        System.out.println(reverse(48));
        System.out.println(reverse(96));

        System.out.println(numberToWords(5));
        System.out.println(numberToWords(14));
        System.out.println(numberToWords(0));
        System.out.println(numberToWords(12));




    }

        public static int numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }else{
            int rev = reverse(number);
            int count = getDigitCount(number);
            while(count>0) {
                int lastDigit = rev % 10;
                rev = rev / 10;
                count--;

                switch (lastDigit) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println(" Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    default -> System.out.println();
                }
            }
        }
            return number;
        }
    public static int reverse(int number){
        int rev = 0;
        if(number < 1){
            number = -1 * number;
            while(number >0){
                int lastDigit = number % 10;
                rev = lastDigit + rev*10;
                number /= 10;
            }
            return -rev;
        }
        while(number>0){
            int lastDigit = number % 10;
            rev = lastDigit + rev * 10;
            number /= 10;
        }
        return rev;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        else if(number == 0){
            return 1;
        }
        int count = 0;
        while(number > 0){
            count++;
            number/= 10;
        }
        return count;
    }
}