package Application;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros ira diigtar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int maiorVetor = 0;
		int posicaoVetor = 0;
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
			if(i >=1) {
				if(vect[i] > vect[i-1]) {
					maiorVetor = vect[i];
					posicaoVetor = i+1;
				}
			}
		}
		
		System.out.println("posicao maior num: "+posicaoVetor);
		System.out.println("maior: "+maiorVetor);
		
		for(int i = 0; i < n; i++) {
			
		}
	}

}
