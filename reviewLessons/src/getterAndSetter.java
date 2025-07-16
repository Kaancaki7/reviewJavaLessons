public class getterAndSetter {

    public static void main(String[] args){

        Shoes shoes = new Shoes("nike","black",1500);

        //shoes sınıfında değişkenlerimizi private yaptığımız için sonradan özellik değiştirilemez oluyor.
        //shoes.model = "adidas";  mesela bunu yapmamıza izin vermez.
        //System.out.println(shoes.model + shoes.color + shoes.price);  --> bu şekilde de bastıramayız çünkü private değişkenlerimiz.

        //GETTERS -->   READABLE
        //SETTERS -->   WRITABLE

        //set metodu yazdık shoes'e. Değiştirmek istediğimiz özellikleri set metodu yaptık modeli değiştirmek istemediğimiz için yazmadık.
        shoes.setColor("white");
        shoes.setPrice(2500);

        //get metodu ile getirdik
        System.out.println(shoes.getModel());
        System.out.println(shoes.getColor());
        System.out.println(shoes.getPrice());
    }
}
