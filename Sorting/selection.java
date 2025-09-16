package Sorting;

import java.util.Arrays;
import java.util.Collections;
public class selection {



    public static void selections(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;

                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        



        
        }}

        public static void insertion(int arr[]){

            for(int i=1;i<arr.length-1;i++){

                int curr=arr[i];
                int prev=i-1;

                while(prev>=0 && arr[prev]>curr){

                    arr[prev+1]=arr[prev];
                    prev--;

                
                }
                arr[prev+1]=curr;
            }
        }

         public static void printarray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }System.out.println();}
        

        public static void main(String[] args){

            int arr[]={4,2,3,7,4,9};
            Arrays.sort(arr,Collections.reverseOrder());
            printarray(arr);


        }
    }
        
       