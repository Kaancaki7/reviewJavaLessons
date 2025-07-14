public class staticLesson {

    public static void main(String[] args){

        Friend friend1 = new Friend("kadan");
        Friend friend2 = new Friend("faki");
        Friend friend3 = new Friend("emu");
        Friend friend4 = new Friend("yusuf");
        Friend friend5 = new Friend("levo");

        System.out.println(friend1.name);

        System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }
}
