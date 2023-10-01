import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota:");
        int primeiraNota = s.nextInt();
        System.out.println("Digite o valor da segunda nota:");
        int segundaNota = s.nextInt();
        System.out.println("Digite o valor da terceira nota:");
        int terceiraNota = s.nextInt();
        System.out.println("Digite o valor da quarta nota:");
        int quartaNota = s.nextInt();

        int resultado = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if(resultado >= 7){
          System.out.println("Aprovado");
        }

        if(resultado < 7 && resultado >=5){
          System.out.println("Recuperação");
        }

        if(resultado < 5 ){
          System.out.println("Reprovado");
        }
    }
}
