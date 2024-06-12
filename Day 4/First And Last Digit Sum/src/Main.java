public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(506));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int mod = number % 10;
        //int mod1 = number % 10;
       // int mod = mod1- mod2;

        while (number > 9) {
            number /= 10;
        }
        return mod + number;
    }
}