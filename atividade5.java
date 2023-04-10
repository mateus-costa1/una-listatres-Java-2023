import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numeroHoras = 0;
		double valorHora = 0;
		double salarioFamilia = 56.47;
		int numeroFilhos;
		double salario = 0;
		
		System.out.print("Informe a hora trabalhada no mês: ");
		numeroHoras = scan.nextInt();
		System.out.print("Informe o valor recebido por hora: R$");
		valorHora = scan.nextDouble();
		
		salario = numeroHoras * valorHora;
		
		if (salario > 1655.98) {
			System.out.printf("Valor salario bruto: R$ %.2f", salario);
		}else {
			System.out.print("Quantidade de filhos até 14 anos: ");
			numeroFilhos = scan.nextInt();
			salario = salario + (numeroFilhos * salarioFamilia);
			
			System.out.printf("Valor salario bruto: R$ %.2f", salario);
		}

		
		scan.close();
}
}