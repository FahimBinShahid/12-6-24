public class GreatestCommonDivisor{
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(15,25));
        System.out.println(getGreatestCommonDivisor(13,91));
        System.out.println(getGreatestCommonDivisor(56,67));
        System.out.println(getGreatestCommonDivisor(5,6));
        System.out.println(getGreatestCommonDivisor(15, 4));
        System.out.println(getGreatestCommonDivisor(5,98));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first< 10 || second < 10){
            return -1;
        }
        while(first != second){
            if(first> second){
                first -=second;
            }else{
                second -= first;
            }
        }
        return first;
    }
}