public class abstraction {

    public static void main(String[] args){

        //Shape shape = new Shape();   abstract olduğu için bir nesne yapamazsın diyo soyut.
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3,4);
        Rectangle rectangle = new Rectangle(5,8);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
