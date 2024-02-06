
public class containsDuplicate {

	public static void main(String args[]) {
		int a[] = {1,2,3,4};
		
		boolean flag = false;
		for (int i=0;i<a.length;i++){
            for(int j=i+1;j<=a.length-1;j++)
            if(a[i] == a[j]) 
                System.out.println("true");
           
          
            
            
        }
        
	}
}
