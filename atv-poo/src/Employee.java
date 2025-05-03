public class Employee extends Person {
    private int mtr;
    private String function;
    private Double wage;

    public Employee(String name, String birthDate, String function, Double wage, int mtr) {
        super(name, birthDate);
        this.function = function;
        this.wage = wage;
        this.mtr = mtr;
    }

    public int getMtr() {
        return mtr;
    }

    public String getFunction() {
        return function;
    }

    public double getWage() {
        return wage;
    }
    @Override
    public String hello() {
        String superMessage = super.hello();
        return superMessage + " Minha matrícula é: " + this.mtr + ", meu cargo é " + this.function + " e o meu salário é de " + this.wage;
    }
}


