public class PessoaJuridica extends Pessoa {

    private int cnpj;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
    return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Tipo: Pessoa Jurídica" + cnpj;
    }
}
