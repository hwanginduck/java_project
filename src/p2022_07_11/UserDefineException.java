package p2022_07_11;

public class UserDefineException extends Exception {
			//사용자 정의 예외 처리 클래스
    // 기본 생성자
    public UserDefineException() {
    }

    // 인수를 하나 받아들이는 생성자
    public UserDefineException( String information ) {
		// Exception 클래스의 생성자 호출
		super( information );
    }
}