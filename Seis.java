import java.util.Scanner;
public class Seis
{
	public static void main(String[] args) {
	    
	   Scanner ler = new Scanner(System.in);
	   int numeroAlunos = 10;
       double[] medias = new double[numeroAlunos];
       int alunosAprovados = 0;

       for (int i = 0; i < numeroAlunos; i++) {
           System.out.println("Aluno " + (i + 1));
           double somaNotas = 0;

           for (int j = 1; j <= 4; j++) {
               System.out.print("Digite a nota " + j + ": ");
               double nota = ler.nextDouble();
               somaNotas += nota;
           }

           double media = somaNotas / 4;
           medias[i] = media;

           if (media >= 7.0) {
               alunosAprovados++;
           }
       }

       System.out.println("Número de alunos com média maior ou igual a 7.0 é de: " + alunosAprovados);

   }
}

