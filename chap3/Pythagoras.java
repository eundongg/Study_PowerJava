
public class Pythagoras {

	public static void main(String[] args) {
		for(int a=1;a<100;a++) {
			for(int b=1;b<100;b++) {
				for(int c=1;c<100;c++) {
					double result_a = Math.pow(a, 2);
					double result_b = Math.pow(b, 2);
					double result_c = Math.pow(c, 2);
					if(result_a+result_b ==result_c) {
						System.out.println(a+" "+ b+" "+c);
					}
				}
			}
		}

	}

}
