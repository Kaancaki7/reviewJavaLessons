public class arrays2d {

    public static void main(String[] args){

        String[] fruits = {"apple","orange","banana"};
        String[] vegetables = {"potato","onion","carrot"};
        String[] meats = {"chicken","beef","fish"};

        String[][] groceries = {fruits, vegetables, meats};

        //değiştiririz mesela bu şekilde.
        groceries[0][0] = "pineapple";
        groceries[1][2] = "celery";
        groceries[2][2] = "turkey";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.println(food);
            }
            System.out.println();
        }
    }
}
