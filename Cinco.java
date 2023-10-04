import java.util.Scanner;
public class Cinco {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        int[] numeros = new int[20];

        int[] par = new int[20];

        int[] impar = new int[20];


        int contadorPar = 0;

        int contadorImpar = 0;


        System.out.println("Por favor digite 20 números inteiros:");


        for (int i = 0; i < 20; i++) {

            System.out.print("Número " + (i + 1) + ": ");

            numeros[i] = ler.nextInt();


            if (numeros[i] % 2 == 0) {

                par[contadorPar] = numeros[i];

                contadorPar++;

            } else {

                impar[contadorImpar] = numeros[i];

                contadorImpar++;

            }

        }


        System.out.println("Os núnmeros digitados foram:");

        for (int num : numeros) {

            System.out.print(num + " ");

        }


        System.out.println("Sendo pares:");

        for (int i = 0; i < contadorPar; i++) {

            System.out.print(par[i] + " ");

        }


        System.out.println("E ímpares:");

        for (int i = 0; i < contadorImpar; i++) {

            System.out.print(impar[i] + " ");
        }

    }

}
