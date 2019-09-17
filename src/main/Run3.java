package main;

public class Run3 {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();

		Card card = deck.draw();
		System.out.println(card.getNumber() + card.getMark());
		Card card2 = deck.draw();
		System.out.println(card2.getNumber() + card2.getMark());

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