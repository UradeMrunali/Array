import java.util.Arrays;
import java.util.Scanner;

public class Assign7 {
 public static void main(String a[]){
	 int a1[]={1,2,3,5,6,8,9,7,22,44};
	 int a2[]={11,22,33,56,6,2,4,64,55,11};
	
	 System.out.println("Array 1: "+Arrays.toString(a1));
	 System.out.println("Array 2: "+Arrays.toString(a2));
	System.out.println("common elements are: ");
	 for(int i=0;i<a1.length;i++){
		 for(int j=0;j<a2.length;j++){
			 if(a1[i]==a2[j]){
				 System.out.print(a2[j]+" ");
			 }
		 }
	 }
	 
	 
	 	
	 
	 
 }
}
