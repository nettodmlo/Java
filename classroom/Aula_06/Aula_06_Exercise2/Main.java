public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 49.99, "Camisa Polo Azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça Jeans Preta");

        System.out.println("\n");
        System.out.println("Olá, estas foram suas compras na Mainstreet Corp!");
        System.out.println("====================================");
        System.out.println("Produto: " + produto1.getProduto());
        System.out.println("Preço: " + produto1.getPrice());
        System.out.println("Características: " + produto1.getTipoProduto());
        System.out.println("====================================\n");
        System.out.println("====================================");
        System.out.println("Produto: " + produto2.getProduto());
        System.out.println("Preço: " + produto2.getPrice());
        System.out.println("Características: " + produto2.getTipoProduto());
        System.out.println("====================================");

    }
}
