import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lista_de_tarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //criar uma lista sem definir o tamanho
       List<String> tarefas = new ArrayList<>();

       for (int i = 0; !tarefas.contains("fim");  i++){
           System.out.println("Adicione a " + (i + 1) + "° tarefa a lista de tarefas (digite fim para finalizar)");

           String nova_tarefa = sc.nextLine();
           tarefas.add(nova_tarefa);
       }
tarefas.remove("fim");
       System.out.println("as tarefas digitadas foram "+ tarefas);
    }
}
//Exercício 3 — Lista de tarefas
//     Crie um programa que:
//     permita cadastrar tarefas;
//     finalize quando o usuário digitar “fim”;
//     exiba todas as tarefas.