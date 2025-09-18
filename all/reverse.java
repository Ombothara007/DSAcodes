import java.util.*;
public class reverse {

    public static void reverseA(int numbers[]){
        

        for(int i=0;i<numbers.length;i++){
            int first=0;
        int last=numbers.length-1;

        int temp=numbers[first];
        numbers[first]=numbers[last];
        numbers[last]=temp;

        first++;
        last--;
        

            
        }

    }
    public static void main(String[] args){

        int numbers[]={1,2,3,4,5,6,7};


        reverseA(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }

    }

    
}