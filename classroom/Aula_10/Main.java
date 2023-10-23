import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        PessoaFisica pF = new PessoaFisica();
        PessoaJuridica pJ = new PessoaJuridica();
        CadastroPessoas cp = new CadastroPessoas();

        System.out.println("Digite um número: 1 para PF, 2 para PJ.");
        int option = sc.nextInt();

        int x;

        do {


            switch (option) {

                case 1:
                    System.out.println("Digite o nome da pessoa a ser cadastrada:");
                    pF.setNome(scanner.nextLine());
                    System.out.println("Digite a idade da pessoa a ser cadastrada:");
                    pF.setIdade(sc.nextInt());

                    cp.cadastrarPessoa(pF);
                    break;

                case 2:
                    System.out.println("Digite o nome da pessoa a ser cadastrada:");
                    pJ.setNome(scanner.nextLine());
                    System.out.println("Digite a idade da pessoa a ser cadastrada:");
                    pJ.setIdade(sc.nextInt());
                    System.out.println("Digite o CNPJ: ");
                    pJ.setCnpj(sc.nextInt());

                    cp.cadastrarPessoa(pJ);
                    pJ.toString();
                    break;
            }
            System.out.println("Digite zero para prosseguir com o programa e qualquer outra tecla para encerrar.");
            x = sc.nextInt();
        } while (x == 0);

        cp.listar();
    }
}