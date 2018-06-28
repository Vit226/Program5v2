 package org.itstep;

import org.itstep.Controller;



public class AppRunner {

	public static void main(String[] args) {
		String word = "Vitalii";   // ��� ��������
		float number = 5.0f ;	// �������� �� ���������(�� ������ ��������)
		Model model = new Model(); 
		model.setWord(word);
		model.setNumber(number);
		View view = new View();
		Controller controller = new Controller(view, model);
		
		controller.enteringSentence();
	}

}
