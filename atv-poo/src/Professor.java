public class Professor extends Aluno {
    private int yearTraining;

    public Professor(String name, String birthDate, int mtr, int yearTraining) {
        super(name, birthDate, mtr);
        this.yearTraining = yearTraining;
    }
    public String hello() {
        String superMessage = super.hello();
        return superMessage + " e eu me formei em " + this.yearTraining;
    }
}
