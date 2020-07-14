
package prime;

import java.util.Scanner;


public class checkprime {
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scanner.nextInt();
        if(check(num)){
            System.out.println("number is prime");
           
            
        }
        else
             System.out.println("number is not prime");
    }
   public static boolean check(int n)
   {
       if(n<=1)
           return false;
       for(int i=2; i<n/2; i++)
       {
           if(n%2 == 0)
               return false;
       }
       return true;
   }
}
    
    

