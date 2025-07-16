import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);

        ArrayList<Double> list2 = new ArrayList<>();

        list2.add(3.14);
        list2.add(1.11);
        list2.add(2.21);

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("icardi");
        list3.add("sanchez");
        list3.add("osimhen");

        //list3.remove(1);  //1. sırdaki değeri siler
        //list3.set(2,"sane"); //2.indekteki değeri değiştirir.
        //System.out.println(list3.get(0)); //0. indeksteki değeri getirir
        //System.out.println(list3.size()); //liste boyutunu verir

        Collections.sort(list3); //alfabetik sıraya göre sıraladı.

        System.out.println(list3);

        for(String footballer : list3){
            System.out.println(footballer);
        }
    }
}
