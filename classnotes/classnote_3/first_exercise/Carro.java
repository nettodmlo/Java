public class Carro extends Veiculo{
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    private int numPortas;

    public void imprimirDetalhes() {
        System.out.println("\n");
        System.out.println("Tipo de veículo: Carro");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Portas: " + numPortas);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Veículo adquirido com sucesso! Parabéns pela conquista.");
    }
}
