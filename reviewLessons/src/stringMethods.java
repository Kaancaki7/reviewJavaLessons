public class stringMethods {

    public static void main(String[] args){

        String name = "Mauro Icardi";

        int length = name.length();
        char letter = name.charAt(0);  //0 --> first character 1 --> second character...
        int index = name.indexOf("o");  //ilk çıkan o nun indeksini verir.
        int lastIndex = name.lastIndexOf("a");  //ilk çıkan a yi değil son çıkanın indeksini verir.

        name = name.toUpperCase();  //hepsini büyük harf yapıyor
        name = name.toLowerCase();  //hepsini küçük harf yapıyor
        name = name.trim();   //kelimenin sağında veya solunda boşluk varsa onları temizler.
        name = name.replace("o","a");  //ilk yazdığın karakteri 2. yazdığın karaktere dönüştürür.

        System.out.println(name);

        //boolean ifade döndürür dize boş mu dolu mu.
        if(name.isEmpty()){
            System.out.println("your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        //equalsIgnoreCase --> böyle yazarsan büğyük ve küçük harfe karşı duyarsız olur.

        if(name.equalsIgnoreCase("password")){
            System.out.println("your name can't be a password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
