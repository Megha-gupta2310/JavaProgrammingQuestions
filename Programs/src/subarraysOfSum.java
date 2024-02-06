public class subarraysOfSum {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
	
		/*
		 * write a program takes array input{1,0,2,3} and num =3.and provides output
		 * {1,2}{0,3}{2,1}{3,0} sum equals the num.
		 */

int count=3;

int a[]={1,2,3,4,5};
int len=(a.length)-1;
System.out.println("length"+len);
for(int i=0;i<=len;i++)

{
for(int j=len;j>=0;--j )
{
if (count==( a[i]+ a[j]))
{
System.out.println("Test"+a[i]+"," +a[j] );
}

}

}
}

}