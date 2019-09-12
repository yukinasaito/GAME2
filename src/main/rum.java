package main;

public class rum {

	private static final Card Number = null;
	private static final String Syatem = null;

	public static void main(String[] args) {

		Card card = new Card("ハート", 11);
		System.out.println(card.getMark());
		System.out.println(card.getNumber());

		deck deck = new deck();
		main.deck.shuffle();

		Card card2 = deck.draw();
		System.out.println(card2.getNumber());
		System.out.println(card.getMark());
	}
}