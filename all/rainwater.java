
import java.util.*;
public class rainwater {

    public static int traprainwater(int height[]){

        int n=height.length;


        int leftboundary[]=new int[n];
        leftboundary[0]=height[0];
        for(int i=1;i<n;i++){

            leftboundary[i]=Math.max(leftboundary[i-1],height[i]);}


             int rightboundary[]=new int[n];

             rightboundary[n-1]=height[n-1];
             for(int i=n-2;i>=0;i--){

                rightboundary[i]=Math.max(rightboundary[i+1],height[i]);
             }

             int trappedwater=0;
             
             for(int i=0;i<n;i++){
                
                 int waterlevel=Math.min(leftboundary[i], rightboundary[i]);


                trappedwater+=waterlevel-height[i];
             }
             return trappedwater;

        }

        public static void main(String[] args){

            int bar[]={4,2,0,6,3,2,5};
            System.out.println(traprainwater(bar));





    }

    
}
