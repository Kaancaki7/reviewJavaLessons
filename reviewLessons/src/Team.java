public class Team {

    String amblem;
    String teamName;
    int foundingYear;
    String teamColor;

    Team(String amblem, String teamName, int foundingYear, String teamColor){
        this.amblem = amblem;
        this.teamName = teamName;
        this.foundingYear = foundingYear;
        this.teamColor = teamColor;
    }

    @Override
    public String toString(){
        return this.amblem + " " + this.teamName + " " + this.foundingYear + " " + this.teamColor;
    }
}
