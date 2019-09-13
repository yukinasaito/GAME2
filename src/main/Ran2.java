package main;

public class Ran2 {

	public static void main(String[] args) {
		Deck deck = new Deck();
		//deck.shuffle();

		for(int number = 0; number < 54; number++) {
			Card card = deck.draw();
			System.out.println(card.getNumber() + card.getMark());
		}
	}
}