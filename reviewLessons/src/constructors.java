public class constructors {

    public static void main(String[] args){

        Student student1 = new Student("Mauro Icardi", 31 , 3.5);
        Student student2 = new Student("Leroy Sane", 28, 3.2);
        Student student3 = new Student("Victor Osimhen", 26, 3.4);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();

    }
}
