package Sorting;

public class shortp {

    

    public static float getshortpath(String path){

        int x=0 ,y=0;

        for(int i=0;i<path.length();i++){

            char dir=path.charAt(i);

            if(dir=='S'){

               y--;
            }
           else if(dir=='N'){

            y++;
           }
           else if(dir=='W'){
            x--;

           }
           else{
            x++;


           }
          
           
        } int X2=x*x;
           int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);

    }

    public static String subsString(String path,int si, int ei){

        String Substr="";
        for(int i=si;i<ei;i++){

           

             Substr+=path.charAt(i);
        }
        return Substr;
        
    }
    public static void main(String[] args){

       // String path="WNENESENNN";

        //System.out.println(getshortpath(path));
        String path="Hello World";
       // System.out.println(subsString(path, 0, 4));

       System.out.println(path.substring(0,5));

    }

    
}
