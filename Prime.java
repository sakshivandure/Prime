
package prime;


public class Prime {

    public static void main(String[] args) {
    
      for(int i=1; i<=10; i++)
      {
          if(check(i))
          {
              System.out.print(i+ " ");
          }
          System.out.println();
      }
      
    }
    public static boolean check(int n)
      {
         if(n<=1)
             return false;
         for(int i=2; i< n/2; i++)
         {
             if((n % 2) == 0)
             {
                return false; 
             }
         }
        return true;
      }
        
    
    
}
