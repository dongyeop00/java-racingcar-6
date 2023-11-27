package racingcar.Model;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Service.Exception1;
import racingcar.Service.SplitCarName;
import racingcar.View.GameView;

public class Game {
    Exception1 exception = new Exception1();
    static GameView gameView = new GameView();

    public void Initialize(){
        String CarName = InputCarName();
        exception.CarIsNull(CarName);
        int Attempt = InputAttempts();
        exception.ValidateAttempts(Attempt);
        new RacingCars(SplitCarName.CreateCar(CarName),Attempt);
    }

    public static String InputCarName(){
        gameView.ShowGameStart();
        return Console.readLine();
    }

    public static int InputAttempts(){
        gameView.ShowTryNumber();
        return Integer.parseInt(Console.readLine());
    }

    // public List<Car> SplitCarName(String InputCarName)
}
