import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
				
		System.out.println("Calculo de media aritmética. harmônica e geométrica");
		System.out.print("Informe o primeiro valor: ");
		num1 = scan.nextDouble();
		
		System.out.print("Informe o segundo valor: ");
		num2 = scan.nextDouble();
		
		System.out.print("Informe o terceiro valor: ");
		num3 = scan.nextDouble();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		double mediaAritmetica = (num1 + num2 + num3) / 3;
		System.out.println("A media aritmética é: " + mediaAritmetica);
		
		double mediaHarmonica = 3 / ((1/num1) + (1/num2) + (1/num3));
		System.out.println("A media harmônica é: " + mediaHarmonica);

		double mediaGeometrica = Math.cbrt(num1 * num2 * num3);
		System.out.println("A media geométrica é: " + mediaGeometrica);

		scan.close();
		
	}

}
