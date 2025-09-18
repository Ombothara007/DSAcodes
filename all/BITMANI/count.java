package BITMANI;

public class count {

    public static int setcount(int n){
        int count=0;
        while(n>0){
            if ((n & 1)!=0){
                count++;

            }n=n>>1;
        }
        return count;
    }
public static void main (String[] agrs){
    System.err.println(setcount(20));
}

    
}
