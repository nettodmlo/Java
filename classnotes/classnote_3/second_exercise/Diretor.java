public class Diretor extends Funcionario {
    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    private int acoes;
    public void infosDiretor() {
        System.out.println("\n");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Ações: " + acoes);
        System.out.println("Cadastrado com sucesso!!!");
    }
}
