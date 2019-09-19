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

	public int compareTo(Card anotherCard) {
		if(this.number < anotherCard.number) {
			return -1;
		} else if(this.number > anotherCard.number) {
			return +1;
		} else if(this.number == anotherCard.number) {
			return 0;
		}
		return number;

	}

	public int compareTo2(Card anotherCard) {
		if(this.mark == "スペード") {
			if(anotherCard.mark == "スペード") {
				return 0;
			} else if(anotherCard.mark == "ハート") {
				return -1;
			} else if(anotherCard.mark == "ダイヤ") {
				return -1;
			} else if(anotherCard.mark == "クラブ") {
				return -1;
			}
		} else if(this.mark == "ハート") {
			if(anotherCard.mark == "スペード") {
				return +1;
			} else if(anotherCard.mark == "ハート") {
				return 0;
			} else if(anotherCard.mark == "ダイヤ") {
				return -1;
			} else if(anotherCard.mark == "クラブ") {
				return -1;
			}
		} else if(this.mark == "ダイヤ") {
			if(anotherCard.mark == "スペード") {
				return +1;
			} else if(anotherCard.mark == "ハート") {
				return +1;
			} else if(anotherCard.mark == "ダイヤ") {
				return 0;
			} else if(anotherCard.mark == "クラブ") {
				return -1;
			}
		} else if(this.mark == "クラブ") {
			if(anotherCard.mark == "スペード") {
				return +1;
			} else if(anotherCard.mark == "ハート") {
				return +1;
			} else if(anotherCard.mark == "ダイヤ") {
				return +1;
			} else if(anotherCard.mark == "クラブ") {
				return 0;
			}
		}
		return 0;
	}

	public int compareTo3(Card anotherCard) {
		if(this.number < anotherCard.number) {
			return -1;
		} else if(this.number > anotherCard.number) {
			return 1;
		} else if(this.number == anotherCard.number) {
			if(this.mark == "スペード") {
				if(anotherCard.mark == "スペード") {
					return 0;
				} else if(anotherCard.mark == "ハート") {
					return -1;
				} else if(anotherCard.mark == "ダイヤ") {
					return -1;
				} else if(anotherCard.mark == "クラブ") {
					return -1;
				}
			} else if(this.mark == "ハート") {
				if(anotherCard.mark == "スペード") {
					return +1;
				} else if(anotherCard.mark == "ハート") {
					return 0;
				} else if(anotherCard.mark == "ダイヤ") {
					return -1;
				} else if(anotherCard.mark == "クラブ") {
					return -1;
				}
			} else if(this.mark == "ダイヤ") {
				if(anotherCard.mark == "スペード") {
					return +1;
				} else if(anotherCard.mark == "ハート") {
					return +1;
				} else if(anotherCard.mark == "ダイヤ") {
					return 0;
				} else if(anotherCard.mark == "クラブ") {
					return -1;
				}
			} else if(this.mark == "クラブ") {
				if(anotherCard.mark == "スペード") {
					return +1;
				} else if(anotherCard.mark == "ハート") {
					return +1;
				} else if(anotherCard.mark == "ダイヤ") {
					return +1;
				} else if(anotherCard.mark == "クラブ") {
					return 0;
				}
			}
		}
		return 0;
	}

	public int compareTo4(Card anotherCard) {
		// 数字で比較
		int compare = this.compareTo(anotherCard);

		// 数字が同じの場合マークで比較
		if(compare == 0) {
			compare = this.compareTo2(anotherCard);
		}

		return compare;
	}
}