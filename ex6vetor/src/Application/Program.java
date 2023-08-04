package Application;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros tera cada vetor?");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		for(int i = 0; i < n; i++) {
			vectA[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			vectB[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
	}

}
