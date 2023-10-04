import java.util.Scanner;
public class Um
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		int[] vetor = new int[5];
		for (int i = 0; i < 5; i++) {
		    System.out.print("Digite o número " + (i + 1) + ": ");
		    vetor[i] = ler.nextInt();
		    
		}
		   System.out.println("Os números digitados foram:");
		    for (int i = 0; i < 5; i++) {
		        System.out.println(vetor[i]);
		    }
		
	}
		
}
