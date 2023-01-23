
public class Television2 {
	
	int channel;
	int volume;
	boolean onOff;
	
	Television2(int c, int v, boolean o){	//생성자 정의
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("나의 텔레비전의 채널은 "+ channel +"이고 볼륨은 "+volume+"입니다.");
	}

	public static void main(String[] args) {
		Television2 myTv = new Television2(7,10, true);
		myTv.print();
		
		Television2 yourTv = new Television2(11,20,true);
		yourTv.print();

	}

}
