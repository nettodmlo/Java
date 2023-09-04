import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite seu peso e sua altura: ");
        Scanner sc = new Scanner(System.in);
        CalcImc imc = new CalcImc();

        double scPeso = sc.nextDouble();
        double scAltura = sc.nextDouble();

        imc.calcImc(scPeso, scAltura);
        System.out.printf("O seu Índice de Massa Corporal é: %.2f ", imc.mostrarIMC());
    }
}