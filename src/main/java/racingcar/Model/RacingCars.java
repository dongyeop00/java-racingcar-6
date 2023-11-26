package racingcar.Model;

import java.util.List;

public class RacingCars {
    private List<Car> cars;
    private int attempts;

    public RacingCars(List<Car> cars, int attempts){
        this.cars = cars;
        this.attempts = attempts;
    }
}
