public class subarray {

    public static void subarrays(int numbers[]){

        int maxsum=Integer.MIN_VALUE;
        


        for(int i=0;i<numbers.length;i++){
            // int start=numbers[i];
            
            for(int j=i;j<numbers.length;j++)
            {
                int currsum = 0;
                
                

                for(int k=i;k<=j;k++){
                    currsum += numbers[k];
                    System.out.print(numbers[k]);
                    
                }
                    System.out.println(" => " + currsum);

                    if(currsum>maxsum){
                        maxsum=currsum;
                    }

            }
            

           
                
            

        } System.out.println("maximum sum among all the subarrays sum is-"+maxsum);
    }

    public static void main(String[] args){

        // int numbers[]={1,2,3,4,5,6,7};
        int numbers[]={7,6,5,4,3,2,1};

        subarrays(numbers);
    }
    
}


