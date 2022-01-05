import java.util.ArrayList;
import java.util.Scanner;

public class PoketMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 포켓몬 수는 정확히 알 수 없어서, 
		// 도감에 몇 마리가 들어가야 하는지 알수 없다.
		
		// 포켓몬 다섯 마리 만들기
		ArrayList<Poketmon> poketList = new ArrayList<Poketmon>();
		Poketmon pika = new Poketmon("피카츄", "번개", 80, 60, 70);
		Poketmon piri = new Poketmon("파이리", "불", 90, 40, 50);
		Poketmon ccobugi = new Poketmon("꼬부기", "물", 85, 45, 45);
		Poketmon isanghe = new Poketmon("이상해씨", "풀", 80, 50, 40);
		Poketmon muz = new Poketmon("뮤츠", "초능력", 100, 100, 100);
		
		// 포켓몬 도감에 추가
		poketList.add(pika);
		poketList.add(piri);
		poketList.add(ccobugi);
		poketList.add(isanghe);
		poketList.add(muz);
		
		for(int i = 0; i<poketList.size(); i++) {
			Poketmon list = poketList.get(i);
		}
		System.out.println(poketList.addAll(poketList));
		System.out.print("첫번째 포켓몬 번호 입력:");
		int num1 = sc.nextInt();
		System.out.print("두번째 포켓몬 번호 입력:");
		int num2 = sc.nextInt();
		
	}
}
