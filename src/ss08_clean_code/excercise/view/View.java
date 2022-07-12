package ss08_clean_code.excercise.view;

import ss08_clean_code.excercise.model.TennisGame;

public class View {
    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame();
     String  tennisGame = TennisGame.getScore(30,40);
        System.out.println(tennisGame);

    }
}
