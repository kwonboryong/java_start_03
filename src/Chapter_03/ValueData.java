package Chapter_03;

// 객체 지향 프로그램 (데이터 + 기능)
// 클래스에 메서드 포함! (데이터 + 기능)

public class ValueData {
    int value;

    void add() { // 메서드 (static 사용 X)
        value++; // 위에 있는 자기 자신의 변수 value에 접근 -> ++증가 시킨다.
        System.out.println("숫자 증가 value = " + value);
    }
}
