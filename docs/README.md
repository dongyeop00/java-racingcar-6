# 🚀 기능 요구 사항
## 게임 방법
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9사이의 무작위 값을 구한 뒤 무작위 값이 4 이상일 경우이다.
- 자동차 경주 게임을 온료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수도 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

## 입출력 방법
- 입력
    - 경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)
  ```agsl
    pobi,woni,jun
    ```

    - 시도할 회수
  ```agsl
    5
    ```
  
- 출력
    - 각 차수별 실행 결과
  ```agsl
  pobi : ---
  woni : ----
  jun : ---
    ```
  
    - 단독 우승자 안내 문구
  ```agsl
   최종 우승자 : pobi
    ```
  
    - 공동 우수자 안내 문구
    ```
  최종 우승자 : pobi, jun
  ```
  
    - 실행 결과 예시
  ```agsl
    경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
    pobi,woni,jun
    시도할 회수는 몇회인가요?
    5

    실행 결과
    pobi : -
    woni :
    jun : -

    pobi : --
    woni : -
    jun : --

    pobi : ---
    woni : --
    jun : ---

    pobi : ----
    woni : ---
    jun : ----

    pobi : -----
    woni : ----
    jun : -----

    최종 우승자 : pobi, jun
    ```

# 🎯 프로그래밍 요구 사항
- JDK 버전 : 17
- 프로그램 실행의 시작 지점 : Application의 main()
- build.gradle 파일 변경 금지, 외부 라이브러리 사용 불가
- 프로그램 종료 시 System.exit() 호출 금지

# 구현 함수 목록

## Controller
- GameStart

## Model
- Car
  - List<Car>를 사용하여 여러개의 Car 객체를 List에 저장

- RacingCars
  - initialize : 자동차 이름 지정해주기
    - splitCarName : , 마다 분류해주기
    - setCarName : 여러 객체에 이름 지정해주기
  - PlayGame : attempts만큼 게임 진행
    - PlayRound : 랜덤값을 받아 4이상이면 움직이기
  - announceWinners : 우승자 가리기
    - getMaxPosition : 가장 큰 위치값 찾기
    - getWinners : 최종 우수자, 공동 우수자 반환


## Service
- Exception1 : 예외 처리 기능

## View
- GameView : 게임 시작 문구
- InputView : 