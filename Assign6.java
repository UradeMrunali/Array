import java.util.Arrays;
import java.util.Scanner;
//incomplete

public class Assign6 {
	public static void main(String args[]){
		int a[]=new int [5];
		int duplicate_num=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 5 numbers :");
	for (int i=0;i<a.length;i++){
		System.out.print((i+1)+"=");
          
		a[i]=sc.nextInt();
		
		
	}
	
	System.out.println("Given array = "+Arrays.toString(a));
	
	
	for (int i=0;i<a.length;i++){
		for (int j=0;j<a.length;j++){
		 if(duplicate_num==a[i]){
				
			
		System.out.println(duplicate_num);
		 }
	
		}	
	}	
			}
		}
	
	
	

