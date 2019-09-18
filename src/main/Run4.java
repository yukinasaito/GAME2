package main;

public class Run4 {

	public static void main(String[] args) {

		Card card = new Card("ハート", 8);
		System.out.println(card.getNumber() + card.getMark());
		Card card2 = new Card("スペード", 8);
		System.out.println(card2.getNumber() + card2.getMark());

		Deck deck = new Deck();
		deck.shuffle();

		int compare = card.compareTo(card2);
		if(compare < 0) {
			System.out.println("強い");
		} else if(compare > 0) {
			System.out.println("弱い");
		} else {
			System.out.println("同じ");
		}
	}

}