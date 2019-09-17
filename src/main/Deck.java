package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = Cards();
	}

	public List<Card> Cards() {
		List<Card> marks = new ArrayList<Card>();
		{
			for(int number = 1; number <= 13; number++) {
				marks.add(new Card("クラブ", number));
			}
			for(int number = 1; number <= 13; number++) {
				marks.add(new Card("ハート", number));
			}
			for(int number = 1; number <= 13; number++) {
				marks.add(new Card("スペード", number));
			}
			for(int number = 1; number <= 13; number++) {
				marks.add(new Card("ダイヤ", number));
			}

			int jorkars = 2;
			for(int number = 1; number <= jorkars; number++) {
				marks.add(new Card("ジョーカー", 14));
			}
		}
		return marks;

	}

	public void shuffle() {

		Collections.shuffle(cards);

	}

	public Card draw() {
		Card card = null;
		if(cards.size() > 0) {
			int index = cards.size() - 1;
			card = cards.get(index);
			cards.remove(index);
		}

		return card;
	}

	public void put(Card card) {
		cards.add(card);
	}
}