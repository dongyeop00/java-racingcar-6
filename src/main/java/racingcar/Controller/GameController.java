package racingcar.Controller;

import racingcar.Model.Game;
import racingcar.View.GameView;

public class GameController {
    private final GameView View = new GameView();
    private final Game game = new Game();

    public GameController(){
        View.ShowGameStart();
    }

    public void ShowGameStart(){

    }

    public void Start(){
        game.Initialize(); //자동차 값 받기

    }
}
