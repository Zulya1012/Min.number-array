import java.util.Scanner;
public class addarray{
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		int [] a=new int[5];		
		for (int i=0; i<a.length; i++){
		System.out.println("Enter" + (i+1));
		a[i]=s.nextInt();
		}
		int min= a[0];
		for (int i=1; i<a.length; i++){
			if (min>a[i])
				min=a[i];
		}
		System.out.print("minimum numbers: " +min);
	}
}