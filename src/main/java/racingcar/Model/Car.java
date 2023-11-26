package racingcar.Model;

import racingcar.Service.Exception1;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name){
        new Exception1().ValidateName(name); //5글자 이하인지 예외처리
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

}
