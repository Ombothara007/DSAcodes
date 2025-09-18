import java.util.*;

public class Binary{

    public static int BinaryS(int numbers[],int key){

        int start=0;
        int end=numbers.length-1;
        while(start<=end){

            int mid=(start+end)/2;
            if(numbers[mid]==key){

                return mid;

            
            }
            if(numbers[mid]>key){
                end=mid-1;
                
            }
            else{
                start=mid+1;
            
            
            }
             
           
        
        }return -1;


        
    }

    public static void main(String[] args)
    {
        int numbers[]={11,34,53,64,78,98,102};

        int key=34;
        System.out.println(BinaryS(numbers, key));
    }
}