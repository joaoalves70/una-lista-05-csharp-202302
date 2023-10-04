import java.util.Scanner;
public class Tres
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0, media;
		
		for (int i = 0; i < 4; i++) {
		    System.out.print("Digite a nota "+ (i + 1) +": ");
		    notas[i] = ler.nextDouble();
		} 
		
		System.out.println("As notas digitadas foram: ");
		for (int i = 0; i < 4; i++) {
		    System.out.println("Nota " + (i + 1) + ": "+ notas[i]);
		} 
		
		for (int i = 0; i < 4; i++) {
		    soma += notas[i];
		}
		
		media = soma / 4;
		
		System.out.println("A média das notas é: "+media);
		
 	} 
		
}
