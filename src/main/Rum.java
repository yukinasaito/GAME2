package main;

public class Rum {

	private static final Card Number = null;
	private static final String Syatem = null;

	public static void main(String[] args) {

		Card card = new Card("ハート", 11);
		System.out.println(card.getMark());
		System.out.println(card.getNumber());

		Deck deck = new Deck();
		//deck.shuffle();

		Card card2 = deck.draw();
		System.out.println(card2.getMark());
		System.out.println(card.getNumber());

	}
}