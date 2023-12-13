package Chapter_03;

// 객체 지향 프로그램
// 캡슐화: 속성(멤버 변수)와 기능을 하나로 묶어서 메서드를 통해 외부에 제공하는 것
// 값 변경 시 클래스 안의 메서드 값만 바꿔주면 됨

public class MusicPlayerMain4 { // 필요한 모든 데이터와 기능은 클래스인 MusicPlayer에 있다!
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 음악 플레이어 켜기
        player.on(); // 메서드(기능) 불러서 사용하면 됨
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 음악 플레이어 상태
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();
    }
}
