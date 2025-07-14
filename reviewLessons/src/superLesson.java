public class superLesson {

    public static void main(String[] args){

        Person person = new Person("mauro","icardi");
        Employee employee = new Employee("victor","osimhen",250000);

        person.showName();

        employee.showName();
        System.out.println(employee.salary);

        employee.showSalary();
    }
}
