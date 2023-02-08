/*행맨(hangman)을 제작해보자.
 * 빈 칸으로 구성된 문자열이 주어지고, 사용자는 문자열에 들어갈 글자들을 하나씩 추측해서 맞히는 게임
 * 사용자가 문자열에 들어 있는 글자를 말했으면 화면에 그 글자를 출력한다.
 * 일정한 횟수만 시도할 수 있도록 하자.
 * 문제에 사용되는 문자열들은 String 배열에 저장되어 있고 매번 랜덤하게 선택된다.
 */


import java.util.Random;
import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		final int life = 10;
		int cnt = 0;
		String solution;
		Scanner sc = new Scanner(System.in);
		
		String[] words = {"java", "count", "school", "book", "student","programmer"};
		int index = (new Random()).nextInt(words.length);
		solution = words[index];
		StringBuffer answer = new StringBuffer(solution.length());
		//StringBuffer 사용방식 이해하기
		
		System.out.println("행맨 게임에 오신 것을 환영합니다. 총 기회는 10번입니다.");
		
		while(true) {
			System.out.print("현재의 상태: ");
			System.out.print(answer);
			
			for(int i=0;i<solution.length() - answer.length();i++) {
				System.out.print("_");
			}
			
			if(answer.length() == solution.length()) {
				System.out.println("\n\n혹시 당신은 천재? 맞았습니다!");
				break;
			}
			
			System.out.println("\n남은 기회 : "+(life - cnt));
			System.out.print("문자를 입력하세요 : " );
			String alphabet = sc.next();
			
			int i = answer.length();
			if(alphabet.equals(String.valueOf(solution.charAt(i)))) {
				//valueOf() 는 괄호 안의 내용을 String 객체로 변환시키는 역할을 함
				answer.insert(i, alphabet);
				
			}cnt++;
			
			if(life-cnt == 0) {
				System.out.println("모든 기회를 사용하였습니다. 종료합니다.");
				break;
			}			
			
		}
		
	}

}
