import java.util.Scanner;

public class Demo1Darr {
 public static void main( String args[]){
	 int a[]=new int [2];
	 int sum=0;
	 Scanner sc = new Scanner(System.in);
	 
	 
	 for (int i=0;i<a.length;i++){
		 System.out.println("Enter no."+(i+1));
		 a[i]=Integer.parseInt(sc.nextLine());
		
	 sum+=a[i];
	// sum+=a.length;
	 }
	 
    for (int i=0;i<a.length;i++){
    	 System.out.println("a[" +i+"]="+ a[i]);
    	 
    	
    }
    
    System.out.println("sum of no.s :"+sum);
 }
 
 
}
