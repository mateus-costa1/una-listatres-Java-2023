import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double salarioFixo = 0;
		double totalVendas = 0;
		double percentualVenda = 0;
		double comissao = 0;
		
		System.out.print("Informe o salário fixo: R$");
		salarioFixo = scan.nextDouble();
		System.out.print("Informe o total de vendas do mês: ");
		totalVendas = scan.nextDouble();
		System.out.print("Informe o percentual por venda: ");
		percentualVenda = scan.nextDouble();	
		
		comissao = ((salarioFixo * (percentualVenda / 100)) * totalVendas) + salarioFixo;
		System.out.printf("O salario com o percentual da venda é R$" +  comissao);
		scan.close();
	}
	

}
