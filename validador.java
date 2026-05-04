import java.util.Scanner;
public class validador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeiro_dig = 0;
        int segundo_dig = 0;
        System.out.println("digite seu CPF (apenas com numeros, ex: 12345678901)");
        String cpf = sc.nextLine();
        int soma = 0;
        int soma2 = 0;
        int situacao = 1;
      float soma_cpf = 0;

        if (cpf.length() != 11) {
            situacao = 0;
        }
        if (situacao == 1) {
            for (int x = 0; x <= 9; x++) {
                soma_cpf += cpf.charAt(x) - '0';
            }
        }
        if (soma_cpf / 10 == cpf.charAt(0) - '0'){
            situacao = 0;
        }

        if (situacao == 1) {
            for (int i = 0; i <= 8; i++) {

                int cpf_num = cpf.charAt(i) - '0';
                cpf_num *= (10 - i);
                soma += cpf_num;

            }

            int resto = soma % 11;
            if (resto < 2) {
                primeiro_dig = 0;
            } else {
                primeiro_dig = 11 - resto;
            }


            int primeiro = cpf.charAt(9) - '0';

            if (primeiro_dig == primeiro) {
                for (int a = 0; a <= 9; a++) {

                    int cpf_num2 = cpf.charAt(a) - '0';
                    cpf_num2 *= (11 - a);
                    soma2 += cpf_num2;

                }
                int resto2 = soma2 % 11;

                if (resto2 < 2) {
                    segundo_dig = 0;
                } else {
                    segundo_dig = 11 - resto2;
                }

                int segundo = cpf.charAt(10) - '0';

                if (segundo == segundo_dig) {
                    System.out.println("cpf valido");

                } else {
                    System.out.println("cpf invalido");
                }


            } else {
                System.out.println("cpf invalido");

            }
            sc.close();
        }
        else{
            System.out.println("cpf invalido");
        }
    }
}
