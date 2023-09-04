public class CalcImc {

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    private double peso;
        private double altura;
        private double imc;

        //Calculo do IMC
    public double calcImc(double peso, double altura) {
        this.imc = peso / (altura*altura);
        return imc;
        }
    public double mostrarIMC(){
        return imc;
    }
}
