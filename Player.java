//паттерн Static Fabric Method
public class Player {

    String name;
    int age;
    String game;

    private Player(int age, String name, String game) {
        this.age = age;
        this.name = name;
        this.game = game;
    }

    public static Player getCricketPlayer(int age, String playerName) {
        return new Player(age, playerName, "cricket");
    }

    public static Player getFootballPlayer(int age, String playerName) {
        return new Player(age, playerName, "football");
    }

}
