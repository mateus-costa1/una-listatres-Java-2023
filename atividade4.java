import java.util.Scanner;
public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double capital = 0;
		double prazo = 0;
		double jurosMensal = 0;
		double montante = 0;
		
		System.out.print("Capital: R$");
		capital = scan.nextDouble();
		System.out.print("Prazo da aplicação em meses: ");
		prazo = scan.nextByte();
		System.out.print("Taxa de juros mensal: ");
		jurosMensal = scan.nextByte();
		
		montante = capital * (Math.pow((1 + (jurosMensal / 100)), prazo));

		System.out.printf("Montante a ser recebido: R$ %.2f", montante);
		
		scan.close();
}
}