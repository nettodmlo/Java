import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Carro carro = new Carro();
        Moto moto = new Moto();

        System.out.println("Qual tipo de veículo você deseja?\n Digite 1 para Carro \n Digite 2 para Moto ");

        int option = sc.nextInt();
        switch (option) {
            case 1 -> {
                System.out.println("Qual a marca do carro que você deseja? ");
                carro.marca = input.nextLine();
                System.out.println("Qual o modelo que você deseja? ");
                carro.modelo = input.nextLine();
                System.out.println("Quantas portas você deseja? ");
                carro.setNumPortas(sc.nextInt());
                System.out.println("Qual o ano do modelo que você deseja? ");
                carro.anoFabricacao = sc.nextInt();
                carro.imprimirDetalhes();
            }
            case 2 -> {
                System.out.println("Qual a marca da moto que você deseja? ");
                moto.marca = input.nextLine();
                System.out.println("Qual o modelo que você deseja? ");
                moto.modelo = input.nextLine();
                System.out.println("Qual o ano do modelo que você deseja? ");
                moto.anoFabricacao = sc.nextInt();
                System.out.println("Quantas cilindradas você quer que seu modelo tenha? ");
                moto.setCilindradadas(sc.nextInt());
                moto.imprimirDetalhes();
            }
        }

    }
}
