public class Shark implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("the shark is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("the shark is hunting");
    }
}
