public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Fernanda", 25, 5000);
        Aluno aluno = new Aluno("Netto", 19, 510113);

        System.out.println("\n");
        System.out.println("Professor");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Salário: R$" + professor.getSalario());
        System.out.println("\n");
        System.out.println("Aluno ");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}
