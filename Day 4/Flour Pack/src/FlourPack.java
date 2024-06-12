public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(45,10,85));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int sumOfkilos = 0;
        bigCount *= 5;
        smallCount *= 1;
        sumOfkilos = bigCount+smallCount;

        if(bigCount < 0 || smallCount < 0 || goal < 0 || sumOfkilos < 0){
            return false;
        }
        else if( sumOfkilos == goal){
            return true;
        }
        if(smallCount == 0){
            if(bigCount % goal == 0){
                return true;
            }
            else if(bigCount > goal && bigCount % goal != 0){
                return true;

            }

            }
        else{
            return false;
        }


        return false;
    }
}
