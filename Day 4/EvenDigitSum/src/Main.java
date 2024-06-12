public class Main {
    public static void main(String[] args) {
        int number = 123456789;
        int result = getEvenDigitSum(number);
        System.out.println("Sum of even digits: " + result);

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number %10;
            if(digit%2==0){
               sum+=digit;
            }
            number /= 10;

        }
          return sum;
    }
}