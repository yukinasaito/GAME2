package main;
public class Card {

	private String mark;
	private int number;
	private boolean card;

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

	public String getNumber1() {
		String str;
		switch (number) {
		case 1:
			str = "エース";
			break;
		case 11:
			str = "ジャック";
			break;
		case 12:
			str = "クイーン";
			break;
		case 13:
			str = "キング";
			break;
		default:
			str = Integer.toString(number);
			break;
		}
		return str;
	}

	int compareTo(Card anotherCard) {
		if(this.number < anotherCard.number) {
			return 1;
		}
		if(this.number > anotherCard.number) {
			return -1;
		}
		return 0;
	}
}
