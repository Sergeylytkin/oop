package syntax;

public class Main2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Лыткин");
        student.setHeight(178);
        student.setWeight(78);
        System.out.println("Студент "+student.getName()+" весит "+student.getWeight());
        Student student1 = new Student();
        System.out.println("Студент "+student1.getName()+" весит "+student1.getWeight());
        student.setWeight(90);
        System.out.println("Студент "+student.getName()+" весит "+student.getWeight());
        setHomeWork(student);
        System.out.println("Студент "+student.getName()+" весит "+student.getWeight());
    }
    private static void setHomeWork(Student student) {
        System.out.println("ДЗ принес мне "+student.getName());
        student.setName("Сергей да не тот");
    }

}
