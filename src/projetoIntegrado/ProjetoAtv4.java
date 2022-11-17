package projetoIntegrado;
import java.util.Scanner;

public class ProjetoAtv4 {
// entrada de dados	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String nome;
		System.out.println("Digite seu nome");
		nome = sc.next();
//		--------------------------------------
		Scanner id = new Scanner (System.in);
		String idade;
		System.out.println("Digite sua idade");
		idade = id.next();
//		--------------------------------------
		Scanner en = new Scanner (System.in);
		String endereco;
		System.out.println("Digite seu Endereço");
		endereco = en.next();
//		--------------------------------------
		Scanner tl = new Scanner (System.in);
		String telefone;
		System.out.println("Digite seu telefone");
		telefone = tl.next();
//		--------------------------------------
		System.out.println("Seu Nome é: " + nome);
		sc.close();
//		--------------------------------------
		System.out.println("Sua Idade é: " + idade);
		id.close();
//		--------------------------------------
		System.out.println("Seu Endereço é: " + endereco);
		en.close();
//		--------------------------------------
		System.out.println("Seu Telefone é: " + telefone);
		tl.close();
			
	}
}
