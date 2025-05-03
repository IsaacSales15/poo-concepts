//import java.time.LocalTime;

public class Student extends Person{
    //Atributos
    private int mtr;
    private String curso;

    public Student(String name, String birthDate, int mtr) {
        super(name, birthDate);
        this.mtr = mtr;
    }

    public int getMtr(){
        return mtr;
    }
    public String getCurso(){
        return curso;
    }
    public String hello() {
        String superMessage = super.hello();
        return superMessage + "minha matricula é " + getMtr();
    }
}

