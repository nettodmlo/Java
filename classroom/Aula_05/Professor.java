public class Professor extends Pessoa {

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private String especializacao;
    private double salario;

    public void infosProfessor(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Especialização: " + especializacao);
        System.out.println("Salário: " + salario + "R$");
        System.out.println("Cadastrado com sucesso!!!");
    }

}
