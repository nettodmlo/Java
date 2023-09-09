import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Olá, me chamo Techno, sou seu atendente virtual da LifePet!\n Para marcar uma tosa, digite: 1;\n Para marcar um banho, digite: 2;\n Para falar com atendente físico, digite: 3");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("A opção número um foi escolhida. Já iremos agendar sua tosa! ");
                    break;
                case 2:
                    System.out.println("A opção número dois foi escolhida. Já iremos marcar o banho do seu pet!");
                    break;
                case 3:
                    System.out.println("A opção número três foi escolhida. Redirecionaremos você para um atendente físico!");
                    break;
                default:
                    System.out.println("Inválido. Redirecionando ao menu principal!");
                    break;
            }
        } while (option <1 || option > 3);

    }
}
