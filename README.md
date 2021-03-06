# 숫자 야구 게임
## 기능 요구사항
* 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임을 구현한다.
* 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 전혀 없으면 낫싱이란 힌트를 출력한다.
* 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
* 플레이어는 3개의 숫자를 입력하고, 컴퓨터는 플레이어가 입력한 숫자에 대한 결과를 출력한다.
* 이 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임은 종료된다.
* 게임을 종료한 후, 게임을 다시 시작하거나 완전히 종료할 수 있다.
* 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException 을 발생시킨 후, 종료된다.

## 프로그래밍 요구사항
1. 자바 코드 컨벤션을 지킨다.
2. indent(들여쓰기)는 1까지만 허용한다.
3. stream api 를 사용하지 않고 구현해야 한다. (단, 람다식은 사용가능)
4. else 예약어를 쓰지 않는다.
5. 함수의 길이가 10라인을 넘지 않는다.
6. 도메인 로직에 단위 테스트를 구현한다.
7. JUnit5 기반 단위 테스트를 구현한다.

## 기능 목록
* 3개의 숫자를 입력받는다.
* 사용자로부터 입력받는 3개의 숫자 예외처리
	* 1~9 사이 숫자인가?
	* 중복값이 있는가?
	* 3자리인가?
* 1~9의 숫자 중 랜덤으로 3개의 숫자를 구한다.
* 위치와 숫자 값이 같을 경우 : 스트라이크
* 위치는 다른데 숫자 값이 같을 경우 : 볼
* 위치와 숫자 값이 모두 다를 경우 : 낫싱
* 사용자가 입력한 값에 대한 실행 결과를 구한다.

