package racingcar.Service;

public class Exception1 {

    public void CarIsNull(String input){
        if(input == null){
            throw new IllegalArgumentException("입력값이 없습니다.");
        }
    }

    public void ValidateName(String name){
        if(name.length() > 5){
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public void ValidateAttempts(int Attempts){
        if(Attempts < 1){
            throw new IllegalArgumentException("0회 미만 불가능");
        }
    }
}
