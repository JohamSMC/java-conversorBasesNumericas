package edu.uptc.calculate.model;

import javax.swing.JOptionPane;

import edu.uptc.calculate.view.ActionsViews;

public class Convert {
	public Convert() {
		// TODO Auto-generated constructor stub
	}

	public boolean cheackNumbers(String numbers, String BaseNumber) {
		char[] acceptedNumbers = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int limit = 0;
		switch (BaseNumber) {
		case ActionsViews.BASE_BINARY:
			limit = 2;

			break;
		case ActionsViews.BASE_DECIMAL:
			limit = 10;

			break;
		case ActionsViews.BASE_OCTAL:
			limit = 8;
			break;
		case ActionsViews.BASE_HEXADECIMAL:
			limit = acceptedNumbers.length;

			break;
		}

		for (int i = 0; i < numbers.length(); i++) {
			byte counter = 0;
			for (int j = 0; j < limit; j++) {
				if (numbers.charAt(i) != acceptedNumbers[j]) {
					counter++;
				}

			}
			if (counter != limit - 1) {
				return true;
			}

		}
		return false;

	}

	public String convert(String a, String baseNumber, String baseResult) {
		switch (baseNumber) {
		case ActionsViews.BASE_BINARY:
			try {
				a = String.valueOf(Integer.parseInt(a, 2));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "NUMERO DEMASIADO GRANDE");
			}

			break;
		case ActionsViews.BASE_OCTAL:
			try {
				a = String.valueOf(Integer.parseInt(a, 8));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "NUMERO DEMASIADO GRANDE");
			}

			break;

		case ActionsViews.BASE_HEXADECIMAL:
			try {
				a = String.valueOf(Integer.parseInt(a, 16));

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "NUMERO DEMASIADO GRANDE");
			}

			break;
		}

		switch (baseResult)

		{
		case ActionsViews.BASE_BINARY:
			try {
				a = Integer.toString(Integer.parseInt(a), 2);
			} catch (Exception e) {
			}

			return a;

		case ActionsViews.BASE_OCTAL:
			try {
				a = Integer.toString(Integer.parseInt(a), 8);
			} catch (Exception e) {
			}

			return a;

		case ActionsViews.BASE_HEXADECIMAL:
			try {
				a = Integer.toString(Integer.parseInt(a), 16);
			} catch (Exception e) {
			}
			return a;
		}

		return a;

	}

}
