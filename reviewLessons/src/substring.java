import java.util.Scanner;

public class substring {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        String email = "icardi123@gmail.com";
        String userName = email.substring(0, 9);
        String domain = email.substring(10,19);
        String domain1 = email.substring(10); //başlagıcı verip sonu vermezsen sonuna kadar alır.
        String userName2 = email.substring(0, email.indexOf("@"));
        String domain3 = email.substring(email.indexOf("@") + 1);

        System.out.println(userName);
        System.out.println(domain);
        System.out.println(domain1);
        System.out.println(userName2);
        System.out.println(domain3);

        System.out.println("-------------------------------------------------------------------------------------");

        String adminEmail;
        String adminName;
        String adminDomain;

        System.out.print("enter your email : ");
        adminEmail = scanner.nextLine();

        if(adminEmail.contains("@")){
            adminName = adminEmail.substring(0, adminEmail.indexOf("@"));
            adminDomain = adminEmail.substring(adminEmail.indexOf("@") + 1);

            System.out.println(adminName);
            System.out.println(adminDomain);
        }
        else{
            System.out.println("Emails must contain @");
        }


        scanner.close();
    }
}
