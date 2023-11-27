package racingcar.View;

public class GameView {
    private final static String GAME_START = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final static String TRY_NUMBER = "시도할 회수는 몇회인가요?";

    public void ShowGameStart(){
        System.out.println(GAME_START);
    }

    public void ShowTryNumber(){
        System.out.println(TRY_NUMBER);
    }
}
