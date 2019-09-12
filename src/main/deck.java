package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deck {
	private static ArrayList<Card> cards;
	private static Card card;

	public List<Card> Cards() {
		List<Card> marks = new ArrayList<Card>();
		{
			for(int number = 1; number <= 13; number++) {
				marks.add(new Card("クラブ", 5));
			}
			for(int number = 1; number <= 13; number++) {
				marks.add(new Card("ハート", 4));
			}
			for(int number = 1; number <= 13; number++) {
				marks.add(new Card("スペード", 3));
			}
			for(int number = 1; number <= 13; number++) {
				marks.add(new Card("ダイヤ", 2));
			}
		}
		return cards;

	}

	public static void shuffle() {

		Collections.shuffle(cards);

	}

	public static Card draw() {
		if(((List<Card>) card).size() > 0) {
			int index = cards.size() - 1;
			card = cards.get(index);
			cards.remove(index);
		}
		return card;
	}

	public void put(Card card) {

	}
}
