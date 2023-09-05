import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock stock = new Stock();
        System.out.println("Olá! sou o Techbot, seu suporte virtual e irei lhe auxiliar a partir daqui");
        System.out.println("Vamos lá: digite um código para ser cadastrado. ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.println("Certo! Agora, me dê o nome do produto, por favor. ");
        String nome = sc.nextLine();
        System.out.println("Ótimo! Última etapa, forneça a quantidade de itens! ");
        int quanti = sc.nextInt();

    }
}
