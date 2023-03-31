import java.util.Scanner;

public class MatrixTranspose {
   public static void main(String args[]){
	    int a[][]= new int[3][3];
	    int t[][]= new int[3][3];	
	    		
	    		Scanner sc = new Scanner(System.in);
	  
	    
	    for (int i=0;i<a.length;i++){
	    	for (int j=0;j<a.length;j++){
	    	System.out.println("Enter no :"+(i+" "+j));
	      a[i][j]=sc.nextInt();
	    	}
	    	}
	    for (int i=0;i<t.length;i++){
	    	for (int j=0;j<t.length;j++){
	    	
	      t[j][i]=a[i][j];
	    	}
	    	}
	    
	    
	    System.out.println("Given Matrix");
	    for (int i=0;i<a.length;i++){
	    	for (int j=0;j<a.length;j++){
	    	System.out.print(a[i][j]+ " ");
	    	}
	    	
	    
	    	System.out.println();
}
	    System.out.println("Transpose of above Matrix is :");
	    for (int i=0;i<t.length;i++){
	    	for (int j=0;j<t.length;j++){
	    	System.out.print(t[j][i]+" ");
	    	}
	    	System.out.println();
	    	}

   
}}