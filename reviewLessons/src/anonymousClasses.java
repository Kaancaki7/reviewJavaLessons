public class anonymousClasses {

    public static void main(String[] args) {


        //Anonymous class = A class that doesn't have a name. cannot be reused.
        //                  Add custom behavior without having to create new class.
        //                  often used for one times uses (TimerTask, Runnable, callbacks)

        Human human1 = new Human();
        Human human2 = new Human(){
            @Override
            void speak(){
                System.out.println("the human says hi");
            }
        };

        human1.speak();
        human2.speak();

    }
}
