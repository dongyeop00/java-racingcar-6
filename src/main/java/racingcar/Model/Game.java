package racingcar.Model;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Service.Exception1;
import racingcar.View.GameView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    Exception1 exception = new Exception1();
    GameView gameView = new GameView();

    private List<Car> cars;
    private int Attempt;

    public Game(){

    }

    public Game(List<Car> cars, int Attempt){
        this.cars = cars;
        this.Attempt = Attempt;
    }

    public void Initialize(){
        String CarName = InputCarName();
        exception.CarIsNull(CarName);
        this.Attempt = InputAttempts();
        exception.ValidateAttempts(Attempt);
    }

    public static String InputCarName(){
        return Console.readLine();
    }

    public static int InputAttempts(){
        return Integer.parseInt(Console.readLine());
    }

}
