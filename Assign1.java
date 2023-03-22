import java.util.Arrays;
import java.util.Scanner;

public class Assign1 {
	public static void main(String args[]){
		String a1[]= new String[5];
		int a2[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string array: ");
	for(int i=0;i<a1.length;i++){
		System.out.print((i+1)+" ");
		a1[i]=sc.nextLine();
	}
	System.out.println("Enter integer array :");
	for(int i=0;i<a2.length;i++){
		System.out.print((i+1)+" ");
		a2[i]=sc.nextInt();
	}
	
	
	System.out.println("given string array before sorting :");
	for(int i=0;i<a1.length;i++){
		System.out.print(a1[i]+" ");
	}
	System.out.println();
	Arrays.sort(a1);
	System.out.println("given string array after sorting :");
	for(int i=0;i<a1.length;i++){
		System.out.print(a1[i]+" ");
	}
	
	
	System.out.println();
	System.out.println("given integer array before sorting :");
	for(int i=0;i<a2.length;i++){
		System.out.print(a2[i]+" ");
	}
	System.out.println();
	Arrays.sort(a2);
	System.out.println("given integer array after sorting :");
	for(int i=0;i<a2.length;i++){
		System.out.print(a2[i]+" ");
	}
	
}
}