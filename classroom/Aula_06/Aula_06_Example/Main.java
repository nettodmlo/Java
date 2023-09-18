public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Netto", 19, 5101);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matricula: " + aluno.getMatricula());

    }
}
