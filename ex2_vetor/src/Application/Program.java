package Application;
import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf(" %f", vect[i]);
		}
		
		double sum = 0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum/vect.length;
		System.out.println("Soma: "+sum);
		System.out.println("Media: "+avg);
	}

}
