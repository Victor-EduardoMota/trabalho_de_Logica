import java.util.Scanner;
public class listas_de_convidados {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String[] convidados = new String[5];
        System.out.println("---Escreva os nomes dos convidados---");

        for(int i = 0; i < convidados.length; i++){
            System.out.println("nome do " + (i + 1) + "° convidado");
            convidados[i] = sc.nextLine();
        }
        for (int a = 0; a < convidados.length; a ++){
            System.out.print("o " + (a + 1) + "° convidado: ");
            System.out.println(convidados[a]);
        }
        System.out.println("A quantidde de convidados foi de " + convidados.length );
    }
}
//Exercício 1 — Lista de convidados
//Crie um programa que:
//     Cadastre 5 convidados;
//     Exiba todos os convidados;
//     Informe quantos convidados existem.