public class interfaceLesson {

    public static void main(String[] args){

        //interface sayesinde abstract kıyasla birden fazla sınıftan miras alabiliyor
        //shark hem av hemde avcı sınıfından metot miras alabildi interface ile.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Shark shark = new Shark();

        rabbit.flee();
        hawk.hunt();
        shark.flee();
        shark.hunt();
    }
}
