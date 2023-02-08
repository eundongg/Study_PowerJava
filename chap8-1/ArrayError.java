
public class ArrayError {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int i=0;
		
		try {
			for(i=0;i<=array.length;i++) {
				System.out.print(array[i]+" ");
			}
		}catch(ArrayIndexOutOfBoundsException e) {	//인덱스가 배열의 크기를 벗어나는 경우에 발생되는 예외 처리
			System.out.println("인덱스"+ i+ "는 사용할 수 없습니다.");
		}
	}

}
