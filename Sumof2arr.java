import java.util.Scanner;

public class Sumof2arr {
 public static void main(String args[]){
	 
	 int a1[][]= new int[2][2];
	 int a2[][]= new int[2][2];
	 int a3[][]= new int[2][2];
	 Scanner sc = new Scanner(System.in);
	 
	  
	 for( int i=0;i<a1.length;i++){
		 for( int j=0;j<a1.length;j++){
			
			 
			 
			 System.out.println("Enter int numbers for 1st array :"+ i+" "+j); 
			 a1[i][j]=Integer.parseInt(sc.nextLine());
		
		
		 }
		 }
	 
	 for( int i=0;i<a2.length;i++){
		 for( int j=0;j<a2.length;j++){
			
			 
			 System.out.println("Enter int numbers for 2nd array :"+ i+" "+j); 
			 a2[i][j]=sc.nextInt();
			 

		 }
		 		 }
	 for( int i=0;i<a3.length;i++){
		 for( int j=0;j<a3.length;j++){
			 a3[i][j]=( a1[i][j] + a2[i][j]) ;
        
		 }
		 		 }
	 
	 System.out.println("1st matrix:");
	 	 for( int i=0;i<a1.length;i++){
		 for( int j=0;j<a1.length;j++){
			
		 	
			 System.out.print(a1[i][j]+ " "); 
		 }
		 System.out.println();
		 
	 }	 
	
	 System.out.println("2nd matrix:");
	
	 for( int i=0;i<a2.length;i++){
		 for( int j=0;j<a2.length;j++){
			
		 	
			 System.out.print(a2[i][j]+ " ");
		 }
		 System.out.println();
		 
		 }
	 System.out.println("sum of these matrix is:");
	 for( int i=0;i<a3.length;i++){
		 for( int j=0;j<a3.length;j++){
			
			 System.out.print(a3[i][j]+" ");
			 }
         System.out.println();
	 }
	}
 
}
