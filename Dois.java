import java.util.Scanner;
public class Dois
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		double[] vetor = new double[10];
		
		for (int i = 0; i < 10; i++) {
		    System.out.println("Digite o número " + (i + 1) + ": ");
		    vetor[i] = ler.nextDouble();
		}
		
		System.out.println("Os números digitados na ordem inversa são:");
		for (int i = 9; i >= 0; i--) {
		    System.out.println(vetor[i]);
		} 
	}
		
}
