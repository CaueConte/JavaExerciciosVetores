package Application;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros ira digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i =0; i < n; i++) {
			if(vet[i]%2 == 0) {
				System.out.printf("%d ", vet[i]);
				sum +=1;
			}
		}
		System.out.println("Total de pares: "+sum);
		
	}

}
