package edu.uptc.calculate.view;

import edu.uptc.calculate.control.ControlCalculate;

public interface ActionsViews {

	String BASE_BINARY = "BINARIA";
	String BASE_DECIMAL = "DECIMAL";
	String BASE_OCTAL = "OCTAL";
	String BASE_HEXADECIMAL = "HEXADECIMAL";

	public Object[] readDates();

	public void setControl(ControlCalculate controlCalculate);

	public void writeResult(String result);

	public void begin();

}
