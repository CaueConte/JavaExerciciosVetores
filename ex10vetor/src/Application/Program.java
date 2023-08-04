package Application;
import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] notaA = new double[n];
		double[] notaB = new double[n];
		
		double sum = 0;
		double[] media = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite os dados do %d aluno: ", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			notaA[i] = sc.nextDouble();
			notaB[i] = sc.nextDouble();
			
			sum = notaA[i] + notaB[i];
			media[i] = sum/2;
			
		}
		
		System.out.println("Aprovados: ");
		for(int i = 0; i < n; i++) {
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
	}

}
