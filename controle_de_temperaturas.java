import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class controle_de_temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float media_celsius = 0;
        float media_fahreheit = 0;

        List<String> temperaturas_celsius = new ArrayList<>();
        List<Float> temperaturas_fahrenheit = new ArrayList<>();


        for(int i = 0; !temperaturas_celsius.contains("sair"); i++){
            System.out.println("digite a temperatura em graus celsius e converta para graus fahrenheit(digite sair parar ver a media)");
            String temperatura = sc.nextLine();

            if(temperatura.equals("sair")){
                break;
            }
            else {
                float temeperatura_celsius = Float.parseFloat(temperatura);
                temperaturas_celsius.add(temperatura);
                media_celsius += temeperatura_celsius;

                float temeperatura_fahrenheit = 1.8f * temeperatura_celsius + 32;
                temperaturas_fahrenheit.add(temeperatura_fahrenheit);
                media_fahreheit += temeperatura_fahrenheit;

            }
        }

        media_celsius /= temperaturas_celsius.toArray().length;
        media_fahreheit /= temperaturas_fahrenheit.toArray().length;
        System.out.println("a media das temperaturas em celsius: " + media_celsius);
        System.out.println("a media das temperaturas em fahrenheit: " + media_fahreheit);
    }
    }
    //Exercício 4 - Controle de temperaturas
//     Solicite temperaturas em graus Celsius até o usuário digitar "sair";
//     Converta as temperaturas da lista em graus Celsius para uma nova lista de temperaturas em graus Fahrenheit;
//     Calcule e exiba as médias de ambas as temperaturas.