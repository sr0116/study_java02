package card;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        play();
    }

    static void play() {
        List<Player> players = new ArrayList<>();
        Deck deck = new Deck();
        deck.shuffle();

        // 플레이어 이름 리스트 생성
        players.add(new Player("새똥이"));
        players.add(new Player("개똥이"));
        players.add(new Player("소똥이"));
        players.add(new Player("말똥이"));

        // 카드 분배
        for (int i = 0; i < players.size(); i++) {
            for (int j = 0; j < 5; j++) {
                players.get(i).cards.add(deck.pick());
            }
        }

        // 결과 출력
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }

        System.out.println("deck의 남은 카드 갯수 : " + deck.cards.size());
    }
}


//package card;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//	public static void main(String[] args) {
//		play();
//		String s = String.valueOf(1);
//		String s2 = 1+"";// 둘다 같아서 필요헚음
//		"1234".contains("23");//참으로 나옴
//	}
//
//	static void play() {
//		List<Player> players = new  ArrayList<Player>();
//		Deck deck = new Deck();
//		deck.shuffle();
//		players.add(new Player("새똥이"));
//		players.add(new Player("개똥이"));
//		players.add(new Player("소똥이"));
//		players.add(new Player("말똥이"));
//		
//		for(int i = 0; i<players.size(); i++) {
//			for(int j = 0; j<5;j++) {
//				players.get(i).cards.add(deck.pick());
//		}		
//			}
//		
//		for(Player p: players) {
//			System.out.println(p);
//		}		
//		System.out.println("남은 카드의 갯수 :" + deck.cards.size());
//	}
//}
