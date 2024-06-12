public class Main {
    public static void main(String[] args) {
        int number = 10;
        printFactor(number);
    }

    public static void printFactor(int number) {
        if (number < 1) {
            System.out.println("Invalid");
            return;
        }

        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}




