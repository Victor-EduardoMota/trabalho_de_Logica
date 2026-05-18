import java.util.Scanner;
public class ControleDePrecos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] precos = new float[5];
        float maior = Float.MIN_VALUE;
        float menor = Float.MAX_VALUE;
        System.out.println("---Controle de preços---");

        for(int i = 0; i < precos.length; i++){
            System.out.println("digite o " + (i + 1) + "° valor");
            precos[i] = sc.nextFloat();

            if(precos[i] > maior ){
                maior = precos[i];
            }
            if(precos[i] < menor ) {
                menor = precos[i];
            }
        }

        System.out.println("o maior preco foi de R$" + maior);
        System.out.println("o menor preco foi de R$" + menor);
    }
}
//Exercício 2 — Controle de preços
//     Solicite 5 preços e:
//     armazene em uma lista;
//     exiba o maior preço;
//     exiba o menor preço