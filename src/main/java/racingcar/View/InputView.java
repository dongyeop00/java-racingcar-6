package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
import racingcar.View.GameView;

public class InputView {
    static GameView gameView = new GameView();

    public static String InputName(){
        gameView.ShowGameStart();
        return Console.readLine();
    }

    public static int InputAttempts(){
        gameView.ShowTryNumber();
        return Integer.parseInt(Console.readLine());
    }

}
