import java.util.Scanner;

public class Assign2 {

	public static void main(String args[]){
		int a[]=new int[3];
		int sum;
		sum=0;
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<a.length;i++){
			System.out.println("Enter 3 numbers :"+( i+1 ));
			a[i]=sc.nextInt();
			
			sum=sum+a[i];
		}
		System.out.print("[");
		for(int i=0;i<a.length;i++){
			
			System.out.print(a[i]+" " );
			
		}
		System.out.println( "]");
		System.out.println();
		System.out.println("sum of above array is :"+sum);
	}
	
	
}
