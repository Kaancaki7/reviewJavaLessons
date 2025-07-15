public class toStringMethod {

    public static void main(String[] args){

        Team team = new Team("🦁","Galatasaray", 1905, "Yellow-Red");
        Team team1 = new Team("😋", "Beşiktaş", 1903, "Black-White");

        System.out.println(team);  //normalde böyle yazınca adresini veriyordu fakat team sınıfında toString methodunu override ettik.
        System.out.println(team1);
    }
}
