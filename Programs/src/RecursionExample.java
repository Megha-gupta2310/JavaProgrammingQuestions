public class RecursionExample {  
static void p(int n){  
System.out.println("hello");  
p(n++);  
}  
  
public static void main(String[] args) {  
p(0);  
}  
}