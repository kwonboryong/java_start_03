package Chapter_03;

// 객체 지향 프로그램 (데이터 + 기능)

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add(); // 클래스 ValueData의 메서드 add 사용
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }
}
