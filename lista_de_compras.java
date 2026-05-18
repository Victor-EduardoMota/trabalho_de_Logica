import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class lista_de_compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> compras = new ArrayList<>();
        int acao = 0;
        String produto = "";
        System.out.println("--Lista de compras---");


        for( int i = 0; acao != 6; i++){
            System.out.println(" 1 - Adicionar a lista,\n 2 - Pesquisar item,\n 3 - Remover item,\n 4 - Alterar item, \n 5 - Listar produtos, \n 6 - Sair \n o que voce deseja executar?");
            acao = sc.nextInt();
            sc.nextLine();


            if(acao == 6){
                break;
            }
            else if(acao == 1){
                for (int a = 0; !compras.contains("sair"); a++){

                    System.out.println("digite os produtos a lista (digite sair para voltar a tela inicial)");
                    produto = sc.nextLine();
                    if(produto.equals("sair")){
                        break;
                    }
                    else {
                        compras.add(produto);
                    }

                }

            }

           else if(acao == 2){
               System.out.println("digite o item que voce deseja encontrar, exatamente com você escreveu quando aicionou ( digite sair para ir a tela inicial)");
               String pesquisa = sc.nextLine();

                if(compras.contains(pesquisa)){

                    System.out.println("produto encontrado");

                }
                else{
                    System.out.println("produto não encontrado");
                }


            }
           else if(acao == 3){
               System.out.println("digite o item que você quer remover");
               String remover = sc.nextLine();
               if(compras.contains(remover)){
                   compras.remove(remover);
                   System.out.println("produto removido");

               }
               else{
                   System.out.println("produto não encontrado");
               }

            }
           else if(acao == 4){
                System.out.println("digite o item que você quer alterar");
                String remove = sc.nextLine();

                if(compras.contains(remove)){
                    compras.remove(remove);

                    System.out.println("por qual produto?");
                    String alterar = sc.nextLine();
                    compras.add(alterar);

                    System.out.println("produto alterado com sucesso");
                }
                else {
                    System.out.println("produto não encontrado");
                }
            }

           else if(acao == 5){
               if(compras.isEmpty()){
                   System.out.println("Lista vazia");
               }
               else {
                   System.out.println("os produtos listados até então são: " + compras);
               }
            }
        }

System.out.println("programa encerrado com sucesso");
    }
}

//Exercício 5: Lista de compras
//     Exibir um menu de opções para esta lista de compras: 1 - Adicionar a lista, 2 - Pesquisar item, 3 - Remover item, 4 - Alterar item, 5 - Listar produtos, 6 - Sair
//     para a opção 1 solicitar ao usuário digitar produtos para compra até digitar a palavra "sair"
//     para a opção 2 solicitar um produto a ser pesquisado na lista. se encontrar o produto, exibir o mesmo senão exibir produto não encontrado;
//     para  a opção 3 solicitar o nome do produto a ser removido da lista. se encontrar, exibir na tela "produto encontrado" senão exibir "produto não encontrado";
//     para a opção 4 solicitar o nome do produto a ser alterado. se encontrar exibir na tela "produto alterado com sucesso" senão exibir "produto não encontrado"
//     para a opção 5 listar todos os produtos cadastrados. se não houver produtos cadastrados, exibir a mensagem "Lista vazia" senão exibir os produtos cadastrados.
//     para a opção 6 sair do programa e exibir na tela "Programa encerrado com sucesso!".