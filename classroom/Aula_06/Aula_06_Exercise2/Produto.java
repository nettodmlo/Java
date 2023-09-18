public class Produto {

    private String produto;
    private double price;
    private String tipoProduto;

    public Produto(String produto, double price, String tipoProduto){
        this.produto = produto;
        this.price = price;
        this.tipoProduto = tipoProduto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}
