import java.util.*;
public class prefix {

    public static void prefixS(int numbers[]){

        int prefix[]=new int[numbers.length];
        int currsum=0;
        int maxsum=0;
        prefix[0]=numbers[0];

        for(int i=1;i<numbers.length;i++){

            prefix[i]=prefix[i-1]+numbers[i];
            // above code for making prefix array 


        }
        for(int i=0;i<numbers.length;i++){
            int start=i;

            for (int j=i;j<numbers.length;j++){
                int end=j;
                currsum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(maxsum<currsum){
                    maxsum=currsum;

                    
                }
            }

        
        }System.out.println(maxsum);

    
    }

    public static void kadane(int numbers[]){

        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;

            }
            ms=Math.max(ms, cs);

        
        }System.out.println("OUR max sum is="+ms);
    }
    public static void main(String[] args){

        int numbers[]={1,-2,6,-1,3};
        kadane(numbers);
    }    
}
