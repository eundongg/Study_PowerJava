// 익명 클래스 이용한 타이머 이벤트 처리
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CallBackTest2 {

	public static void main(String[] args) {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("beep");
			}
		};
		Timer t = new Timer(1000,listener);
		t.start();
		for(int i=0;i<1000;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
		}
	}

}
