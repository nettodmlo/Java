class Employee {
    private int id;
    private String name;
    private double grossSalary;

    public Employee(int id, String name, double grossSalary) {
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public void calculateAndDisplayPayroll() {
        double inssDeduction = grossSalary * 0.15;
        double netSalary = grossSalary - inssDeduction;

        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("INSS Deduction: $" + inssDeduction);
        System.out.println("Net Salary: $" + netSalary);
    }
}