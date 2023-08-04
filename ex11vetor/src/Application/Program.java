package Application;
import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] altura = new double[n];
		String[] genero = new String[n];
		
		
		double maiorAltura = altura[0];
		double menorAltura = altura[0];
		int quantidadeHomens = 0;
		double sumMulheres = 0;
		int quantidadeMulheres = 0;
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite os dados da %d pessoa", i+1);
			altura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.printf("Digite o genero da %d pessoa", i+1);
			genero[i] = sc.nextLine();
			
			if(i >= 1) {
				if(altura[i] > maiorAltura) {
					maiorAltura = altura[i];
					
				}
				else if(altura[i] < menorAltura){
					menorAltura = altura[i];
				}
			}
			if(genero[i].equals("m")) {
				quantidadeHomens +=1;
			}
			else if(genero[i].equals("f")) {
				sumMulheres += altura[i];
				quantidadeMulheres += 1;
			}
			
		}
		
		double mediaAlturaMulheres = sumMulheres/quantidadeMulheres;
		System.out.println("Maior altura: "+maiorAltura);
		System.out.println("Menor altura: "+menorAltura);
		System.out.printf("Media altura mulheres: %.2f%n",mediaAlturaMulheres);
		System.out.println("Quantidade de homens: "+quantidadeHomens);
	}

}
