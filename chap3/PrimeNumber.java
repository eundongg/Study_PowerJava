
public class PrimeNumber {

	public static void main(String[] args) {
	
		System.out.print("2~100 사이의 모든 소수 : ");
		for(int i=2;i<=100;i++) {
			int cnt =0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {	//소수는 1과 자기자신으로만 나눠짐
					cnt++;
				}
			}
			if(cnt==1) {
				System.out.print(i+ " ");
			}
		}
		
	}

}
