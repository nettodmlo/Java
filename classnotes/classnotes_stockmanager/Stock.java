public class Stock {
    private int scCodigo;
    private String scNome;
    private int scQuantidade;

    public Stock() {
    }

    public Stock(int scCodigo, String scNome, int scQuantidade) {
        this.scCodigo = scCodigo;
        this.scNome = scNome;
        this.scQuantidade = scQuantidade;
    }

        //getters and setters
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
}
