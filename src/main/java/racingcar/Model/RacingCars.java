package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.Service.Exception1;
import racingcar.View.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {
    public List<Car> cars = new ArrayList<>();
    public int attempts;

    InputView inputView = new InputView();
    Exception1 exception = new Exception1();

    public void initialize(){ //Cars 객체 생성
        String CarName = inputView.InputName();
        attempts = inputView.InputAttempts();

        exception.allException(CarName,attempts);

        setCarName(splitCarName(CarName));
        ShowCar();
    }

    //1. Cars 이름 나누기
    private String[] splitCarName(String CarName){
        String[] split = CarName.split(",");
        return split;
    }

    private void setCarName(String[] split){
        for(String name : split){
            cars.add(new Car(name));
        }
    }

    //2. 회수 만큼 Play
    public void PlayGame(){
        System.out.println("\n실행결과");
        for(int i=0; i < attempts; i++){
            PlayRound();
        }
        ShowCar();
    }

    public void PlayRound(){
        for( Car car : cars){
            int randomNumber = Randoms.pickNumberInRange(0,9); //랜덤값 받기
            car.ToMove(randomNumber); //움직이기
            System.out.println(car.ShowRound());
        }
        System.out.println();
    }

    //3. 우승자 가리기
    public void announceWinners() {
        int maxPosition = getMaxPosition(); //가장 큰 위치값 찾기
        String winners = getWinners(maxPosition);
        System.out.println("최종 우승자 : " + winners);
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            int currentPosition = car.getPosition(); //객체마다 위치 받고
            if (currentPosition > maxPosition) { //가장 큰 위치 찾기
                maxPosition = currentPosition;
            }
        }
        return maxPosition;
    }

    private String getWinners(int maxPosition) {
        String winners = "";
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) { //객체마다 현재 위치가 큰 위치값이 같다면
                if (!winners.isEmpty()) { //비어 있지 않으면!!
                    winners += ", "; //,로 공동 우수자 찾기~
                }
                winners += car.getName(); //안녕 우수자?
            }
        }
        return winners; //우수자 내놓기
    }

    public void ShowCar(){
        for (Car car : cars) {
            System.out.println("Car name: " + car.getName() + ", Position: " + car.getPosition());
        }
    }
}
