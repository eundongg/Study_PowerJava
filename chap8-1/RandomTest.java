import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i=0;i<10;i++) {
			System.out.print(random.nextInt(100)+", ");	//0~99까지의 랜덤 수 출력
		}

	}

}
