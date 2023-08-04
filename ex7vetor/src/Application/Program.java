package Application;
import java.util.Scanner;
import java.util.Locale;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double media = sum/n;
		
		System.out.println("media "+media);
		for(int i = 0; i < n; i++) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
	}

}
