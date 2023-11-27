package racingcar.Service;

import racingcar.Model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitCarName {
    public static List<Car> CreateCar(String input){
        return Arrays.stream(input.split(",")) // input을 ","로 분리하고 각 부분을 스트림으로 변환
                .map(Car::new) //Car 클래스를 선언하여 Car 생성자에 참조
                .collect(Collectors.toList()); //최종적으로 List로 변환
    }
}
