// Java program to find first and last occurrence of 
// an elements in given sorted array 
import java.io.*; 

public class firstLastOccurence 
{ 
	// Function for finding first and last occurrence 
	// of an elements 
	 public static void main(String []args){
	       int arr[] = {1,2,2,2,2,6,7,8};
	       int first =-1, last = -1;
	       int k =2;
	       for(int i=0;i<arr.length;i++){
	           if(k!=arr[i]){
	        	   
	               continue;
	           }
	           else if(first ==-1){
	               first = i;}
	           else{
	               last = i;
	               }
	           }
	           
	           if(first !=-1)
	           {
	           System.out.println(first);
	           System.out.println(last);
	               
	           }
	           else{
	               System.out.println("Element not found");
	           }
	       }
	}