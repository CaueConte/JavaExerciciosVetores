package Application;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		
		int sum = 0;
		int[] vect2 = new int[n];
		int quantidadePares = 0;
		for(int i = 0; i < n; i++) {
			if(vect[i] %2 == 0) {
				sum+= vect[i];
				quantidadePares += 1;
			}
		}
		
		
		//double media = sum/quantidadePares;
		//System.out.println("media: "+media);
		
		if(quantidadePares > 1) {
			double media = sum/quantidadePares;
			System.out.println("Media: "+media);
		}
		else {
			System.out.println("no par");
		}
		
		
		
		
	}

}
