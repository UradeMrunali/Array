import java.util.Scanner;

public class Assign4 {
 public static void main(String args[]){
	 //incomplete
	 int a1[]=new int[4];
	 int a2[]=new int [4];
	 int b;
	 int c=0;
	 
	 
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter 4 numbers:");
	 for(int i=0;i<a1.length;i++){
		 
		 a1[i]=sc.nextInt();
	 }
	 System.out.println("Given array :");
	 for(int i=0;i<a1.length;i++){
		 System.out.println("a1["+i+"]=:"+a1[i]);
	 }
	 System.out.println("Enter array position you want to update");
	 
	b=sc.nextInt();
	 
    System.out.println("Enter number you want to insert");
 
	
		
		 a1[c]=sc.nextInt();
		 System.out.println("updated array a1["+b+"]="+a1[c]); 
		 
		 
		 
 }
}
