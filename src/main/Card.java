package main;
public class Card {

	private String mark;
	private int number;

	public Card(String mark, int number) {
		this.mark = mark;
		this.number = number;
	}

	public String getMark() {
		//String[] name = { "スペード", "ハート", "クラブ", "ダイヤ" };
		return mark;
	}

	public int getNumber() {
		return number;
	}

}
