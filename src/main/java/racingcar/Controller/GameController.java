package racingcar.Controller;

import racingcar.Model.RacingCars;

public class GameController {
    RacingCars racingCars = new RacingCars();

    public void Start(){
        racingCars.initialize();
        racingCars.PlayGame();
        racingCars.announceWinners();
    }
}
