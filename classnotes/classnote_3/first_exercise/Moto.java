public class Moto extends Veiculo{
    public int getCilindradadas() {
        return cilindradadas;
    }

    public void setCilindradadas(int cilindradadas) {
        this.cilindradadas = cilindradadas;
    }

    private int cilindradadas;
    public void imprimirDetalhes() {
        System.out.println("\n");
        System.out.println("Tipo de veículo: Moto");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Cilindradas: " + cilindradadas + "cc");
        System.out.println("Veículo adquirido com sucesso! Parabéns pela conquista.");
    }
}
