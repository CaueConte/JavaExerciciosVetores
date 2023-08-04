package Application;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] idade = new int[n];
		String[] nome = new String[n];
		
		//String nomeMaiorIdade = "";
		String[] nomeMaiorIdade = new String[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %d pessoa", i);
			sc.nextLine();
			System.out.printf("%nNome:");
			nome[i] = sc.nextLine();
			System.out.printf("Idade: ");
			idade[i] = sc.nextInt();
			if(i >= 1) {
				if(idade[i] > idade[i-1]) {
					nomeMaiorIdade[i-1] = nome[i];
					
				}
			}
			
		}
		for(int i = 0; i < n; i++) {
			if(nome.length == n) {
				System.out.println("mais velho(s) "+nomeMaiorIdade[i]);
			}
		}
	}

}
