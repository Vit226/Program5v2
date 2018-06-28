package org.itstep;

public class Model {
	private String word; 
	private float  number;

	public float getNumber() {
		return number;
	}

	public void setNumber(float number) {
		this.number = number;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Model(String word, float number) {
		super();
		this.word = word;
		this.number = number;
	}
  
	public Model() {
		super();
	}

	public String inputWordByScaner1(String word) {
		if (word.equals("Vitalii")) { // Имя студента
			String correctWord = word;
			return correctWord;
		} else {
			return null;
		}
	}

	public float inputWordByScaner2(float number) {
		if (number == 5.0) {
			float correctNumber = number;
			return correctNumber;
		} else {
			return 0;
		}
	}

	public String writeSentence(String word1, float number) {
		return word1 + " Vitalii " + number;
	}
}


