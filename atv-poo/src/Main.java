public class Main {
    public static void main(String[] args) {

        Person person = new Person("José", "2007-02-27");
        person.surname = "Zé bigode";
        System.out.println(person.hello());

        Student student = new Student("Pedro", "2014-06-05", 1234);
        student.surname = "Pedrin do Java";
        student.hello();

        Teacher teacher = new Teacher("Humberto", "1967-05-23", 12344, 2004 );
        teacher.surname = "bebeto";
        teacher.hello();

        Employee func = new Employee("Serjo","1978-12-25", "Porteiro", 2.4000, 1234 );
        func.surname = "Serjão foguetes";
        func.hello();
    }
}
