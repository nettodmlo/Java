public class Stock {
    private int scCodigo;
    private String scNome;
    private int scQuantidade;

    public double getScVenda() {
        return scVenda;
    }

    public void setScVenda(double scVenda) {
        this.scVenda = scVenda;
    }

    private double scVenda;

    public int getScCodigo() {
        return scCodigo;
    }

    public void setScCodigo(int scCodigo) {
        this.scCodigo = scCodigo;
    }

    public String getScNome() {
        return scNome;
    }

    public void setScNome(String scNome) {
        this.scNome = scNome;
    }

    public int getScQuantidade() {
        return scQuantidade;
    }

    public void setScQuantidade(int scQuantidade) {
        this.scQuantidade = scQuantidade;
    }

    // código responsável por exibir produto cadastrado e quantidade de itens em estoque
    public void scNome () {
        System.out.println("Parabéns! O produto " + scNome + " foi cadastrado com sucesso. \n");
    }

    public double scVenda() {
        return scQuantidade - scVenda;
    }

}