package practice_homework2;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;
    GameSettings(int someMaxPlayers, String someGameName){
        maxPlayers = someMaxPlayers;
        this.gameName = someGameName;
    }
    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }
    void addPlayers(){
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }
    public void printGameStatus(){
        System.out.println("Название игры - " + gameName + ", текущее число игроков: " + currentPlayers + ", максимальное число игроков: " + maxPlayers);
    }

}
