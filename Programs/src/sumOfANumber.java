public class sumOfANumber{

     public static void main(String []args){
       int num= 1091;
      
        int n, sum = 0;
        
        while(num>0){
            n=num%10;
            sum = sum+n;
            num = num/10;
        }
        
        
        System.out.print(sum);
        
        
         
     }
         
         
         
         
     }