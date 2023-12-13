package Chapter_03;

// 클래스 = 데이터인 멤버 변수 뿐만 아니라 기능 역할을 하는 메서드도 포함할 수 있다.
// 멤버 변수만 존재하는 클래스

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자 = " + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }


}
