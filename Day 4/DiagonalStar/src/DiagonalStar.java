public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);

    }
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid value");
        }else{
            int rowCount;
            int columnCount;
            int currentRow;
            rowCount = columnCount = number;
            for (int row = 0; row < rowCount; row++) {
                for (int column = 0; column < columnCount; column++) {
                    if (row == 0 || column == 0 ||
                            row == rowCount - 1 ||
                            column == columnCount - 1 ||
                            column == row ||
                            column == (rowCount - row - 1)) {
                        System.out.print("* ");

                    }
                    else
                    {
                        System.out.println(" ");
                    }
                }
                System.out.println();
            }
        }



    }
}