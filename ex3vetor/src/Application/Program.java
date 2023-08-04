package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Person;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		//int n = sc.nextInt();
		//String[] name = new String[n];
		//int[] age = new int[n];
		//double[] height = new double[n];
		
		int n = sc.nextInt();
		//Person[] name = new Person[n];
		//Person[] age = new Person[n];
		//Person[] height = new Person[n];
		Person[] vect = new Person[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da "+i+"a Pessoa: ");
			System.out.println("nome: ");
			sc.nextLine();
			String name1 = sc.nextLine();
			//name[i] = sc.nextLine();
			System.out.println("Idade: ");
			int age1 = sc.nextInt();
			//age[i] = sc.nextInt();
			System.out.println("Altura: ");
			double height1 = sc.nextDouble();
			vect[i] = new Person(name1, age1, height1);
			
			
			//height[i] = sc.nextDouble();
		}
		
		double sumHeight = 0;
		for(int i = 0; i < n; i++) {
			sumHeight += vect[i].getHeight();
		}
		double avgHeight = sumHeight/n;
		System.out.println("Media de altura: "+avgHeight);
		
		
		int lessSixteen = 0;
		for(int i = 0; i < n; i++) {
			if(vect[i].getAge() < 16) {
				String namesLessSixteen = (vect[i].getName());
				System.out.println(vect[i].getName());
				lessSixteen += 1;		
			}
		}
		
		double percent = (100*lessSixteen)/n;
		System.out.println("porcentagem, mnenor de 16: "+percent+"%");
		
	}

}
