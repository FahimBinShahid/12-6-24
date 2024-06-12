public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSamaeLastDigit(12,252,192));
        System.out.println(hasSamaeLastDigit(31,424,399));
        System.out.println(hasSamaeLastDigit(55,285,295));
        System.out.println(hasSamaeLastDigit(47,928,899));
        System.out.println(hasSamaeLastDigit(40,120,990));
        System.out.println(hasSamaeLastDigit(41,122,990));
    }
    public static boolean hasSamaeLastDigit(int firstnumber, int secondnumber, int thirdnumber){
        if(isValid(firstnumber) && isValid(secondnumber) && isValid(thirdnumber)){
            int count =0;
            if(firstnumber % 10 == secondnumber % 10  ){
                count++;

            }
            if(secondnumber % 10 == thirdnumber % 10){
                count++;
            }
            if(thirdnumber % 10 == firstnumber % 10){
                count++;
            }
            if(count >=1){
                return true;
            }
            else{
                return false;
            }


        }


        return false;
    }
    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }else{
            return true;
        }
    }
}