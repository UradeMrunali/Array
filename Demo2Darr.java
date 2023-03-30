import java.util.Scanner;

public class Demo2Darr {
	public static void main( String args[]){
		 int a[][]=new int [2][2];
		 int sum=0;
		 Scanner sc = new Scanner(System.in);
		 
		 
		 for (int i=0;i<a.length;i++){
			 for (int j=0;j<a.length;j++){
				 System.out.println("Enter no."+(i+" "+j));
			 a[i][j]=Integer.parseInt(sc.nextLine());
		 
		 sum+=a[i][j];
		// sum+=a.length;
		 }
		 }
		 
	    for (int i=0;i<a.length;i++){
	    	for(int j=0;j<a.length;j++){
	    
	    	 System.out.print(a[i][j]+" ");
	    	}
	    	 System.out.println();
	    	 
	    	
	    }
	    
	    System.out.println("sum of no.s :"+sum);
	 }
	 
	 
	
}
