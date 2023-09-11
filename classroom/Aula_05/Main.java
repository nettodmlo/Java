import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        System.out.println("Olá! Sou o FitBOT e irei auxiliar você! \n");
        System.out.println("Primeiro diga-me, qual cadastro deseja fazer?\nDigite 1 para professor;\nDigite 2 para aluno;");

        int option;
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Diga seu nome, por favor! ");
                professor.nome = input.nextLine();
                System.out.println("Ótimo! me diga sua idade agora!");
                professor.idade = sc.nextInt();
                System.out.println("Agora me conte sua especialização");
                professor.setEspecializacao(input.nextLine());
                System.out.println("Diga-me seu salário");
                professor.setSalario(sc.nextDouble());
                System.out.println("\n");
                professor.infosProfessor();
                break;

            case 2:
                System.out.println("Diga seu nome, por favor!");
                aluno.nome = input.nextLine();
                System.out.println("Sua idade agora");
                aluno.idade = sc.nextInt();
                System.out.println("Agora quero que você me diga sua PRIMEIRA nota");
                aluno.setNotaUm(sc.nextDouble());
                System.out.println("Agora, sua SEGUNDA nota, por favor!");
                aluno.setNotaDois(sc.nextDouble());
                System.out.println("\n");
                aluno.infosAluno();
                break;

        }
    }
}
