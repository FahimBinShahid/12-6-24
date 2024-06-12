public class Main {
    public static void main(String[] args)
    {
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(48));
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(284));
        System.out.println(isPerfect(496));

    }
    public static boolean isPerfect(int number){
    if(number<1){
        return false;
    }
    int perfect =0;
    for(int i = 1; i< number ; i++){
        if(number % i == 0){
            perfect += i;
        }
        if(perfect == number){
            return true;
        }
    }return false;
    }
}