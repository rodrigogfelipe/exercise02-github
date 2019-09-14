
/*Fazer um programa para ler as medidas da base e altura de um retangulo. Em seguida, mostrar o valor da área, périmetro e diagonal 
 * deste retangulo, com quatro casa decimais, conforme exemplo..
 * */
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tcl = new Scanner(System.in);
		double base, altura, area, perimetro, diagonal;
		
		base= tcl.nextDouble();
		altura= tcl.nextDouble();
		
		area= base * altura;
		perimetro= 2.0 * (base + altura);
		diagonal= Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		tcl.close();

	}

}
