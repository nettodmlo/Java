import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Parte de cadastro dos produtos
        Scanner sc = new Scanner(System.in);
        Stock stock = new Stock();

        System.out.println("Olá! sou o Techbot, seu suporte virtual e irei lhe auxiliar a partir daqui\n");
        System.out.println("Vamos lá: digite um código para ser cadastrado.");
        stock.setScCodigo(sc.nextInt());
        sc.nextLine();
        System.out.println("Certo! Agora, me dê o nome do produto, por favor.");
        stock.setScNome(sc.nextLine());
        System.out.println("Ótimo! Última etapa, forneça a quantidade de itens!");
        stock.setScQuantidade(sc.nextInt());

        System.out.println("Produto sendo cadastrado...\n");
        stock.scNome();

        System.out.println("Deseja realizar alguma venda do produto cadastrado? \n Digite 1 = Sim\n Digite 0 = Não");

        //Switch de escolhas: sim ou não
        int option;
        do {
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("A opção número um foi escolhida! \n");
                    System.out.println("Quantos você deseja vender? ");
                    stock.setScVenda(sc.nextInt());
                    System.out.println("Venda realizada com sucesso! Itens dessa categoria restante em estoque: " + stock.scVenda());
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! apenas 1 ou 0 por favor.");
            }

        } while (option > 1);

    }
}