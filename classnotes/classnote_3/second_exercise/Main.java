import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();
        System.out.println("Irei auxiliar você em seu cadastro!\n Caso seja Diretor, digite 1\n Caso seja Gerente, digite 2.");

        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Inicialmente, diga-me seu nome: ");
                diretor.nome = input.nextLine();
                System.out.println("Agora, diga-me seu salário: ");
                diretor.setSalario(sc.nextDouble());
                System.out.println("Qual seria a quantidade de ações que você possui? ");
                diretor.setAcoes(sc.nextInt());
                diretor.infosDiretor();
                break;

            case 2:
                System.out.println("Inicialmente, diga-me seu nome: ");
                gerente.nome = input.nextLine();
                System.out.println("Diga-me seu departamento: ");
                gerente.setDepartamento(input.nextLine());
                System.out.println("Agora, diga-me seu salário: ");
                gerente.setSalario(sc.nextDouble());
                gerente.infosGerente();
                break;

        }

    }
}