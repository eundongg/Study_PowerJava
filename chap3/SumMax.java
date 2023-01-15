
public class SumMax {

	public static void main(String[] args) {
		
		double[] arr = {1.0, 2.0, 3.0, 4.0};
		double sum=0, max=arr[0];
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");

			sum += arr[i];
			if(max<arr[i]) max = arr[i];			
		}
		System.out.println();
		System.out.println("Sum is "+ sum);
		System.out.println("Max is "+ max);

	}

}
