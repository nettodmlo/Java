public class Gerente extends Funcionario {

    private String departamento;
    private double calcularBonus;
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getCalcularBonus() {
        return calcularBonus;
    }

    public void setCalcularBonus(double calcularBonus) {
        this.calcularBonus = calcularBonus;
    }

    public double salarioBonus() {
        double bonus = salario * 0.10;
        calcularBonus = salario + bonus;
        return calcularBonus;
    }
    public void infosGerente() {
        System.out.println("\n");
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: R$" + salario);
        System.out.println("Bônus: 10%");
        System.out.println("Salário + Bônus adicional: R$" + salarioBonus());
        System.out.println("Cadastrado com sucesso!!!");
    }
}
