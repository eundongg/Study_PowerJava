
public class Cards {

	public static void main(String[] args) {
		String[] card = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] card2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for(int k =0;k<5;k++) {
			int i = (int) (Math.random()*4);
			int j = (int) (Math.random()*13);
			
			System.out.println(card[i]+"의 "+ card2[j]);
			
		}

	}

}
