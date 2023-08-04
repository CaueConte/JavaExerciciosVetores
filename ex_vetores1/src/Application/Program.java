package Application;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		for(i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
			//System.out.println(vect[i]);
			
			
		}
		
		
	}

}
