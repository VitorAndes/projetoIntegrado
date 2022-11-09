package projetoIntegrado;
import java.util.Scanner;

public class ProjetoAtv4 {
// entrada de dados	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String nome;
		
		System.out.println("Digite uma palavra");
		nome = sc.next();
		
		System.out.println("Você digitou: " + nome);
		sc.close();
			
	}
}
