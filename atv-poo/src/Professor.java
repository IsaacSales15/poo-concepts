public class Professor extends Aluno {
    private int yearTraining;

    public Professor(String name, String birthDate, int registration, int yearTraining) {
        super(name, birthDate, registration);
        this.yearTraining = yearTraining;
    }
    public String hello() {
        String superMessage = super.hello();
        return superMessage + " e eu me formei em " + this.yearTraining;
    }
}
