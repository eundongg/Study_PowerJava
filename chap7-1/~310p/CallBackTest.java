// 타이머 이벤트 처리
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


class MyClass implements ActionListener{	// Actionlistener 인터페이스를 구현한 객체 생성
	public void actionPerformed(ActionEvent event) {	// Timer에 의하여 1초에 한 번씩 호출
		System.out.println("beep");
	}
}
public class CallBackTest {

	public static void main(String[] args) {
		ActionListener listener = new MyClass();
		Timer t = new Timer(1000, listener);	// actionPerformed()를 호출해달라고 Timer에 등록
		t.start();
		for(int i=0;i<1000;i++) {
			try {							// 1초 동안 잤다가, 깨어나는 동작을 1000번 되풀이 
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}

}
