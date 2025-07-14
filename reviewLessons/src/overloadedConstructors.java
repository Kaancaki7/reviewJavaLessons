public class overloadedConstructors {

    public static void main(String[] args){

        User user1 = new User("Sanchez");
        User user2 = new User("Sara", "sara1905@gmail.com");
        User user3 = new User("Lemina", "lemina1905@gmail.com", 28);
        User user4 = new User();

        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.userName);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.userName);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.userName);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
