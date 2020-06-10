package edu.uptc.calculate.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.uptc.calculate.control.ControlCalculate;

public class MainWindow extends JFrame implements ActionsViews {

	private MainMenu mainMenu;

	private JButton num1;
	private JButton num2;
	private JButton num3;
	private JButton num4;
	private JButton num5;
	private JButton num6;
	private JButton num7;
	private JButton num8;
	private JButton num9;
	private JButton num0;
	private JButton numA;
	private JButton numB;
	private JButton numC;
	private JButton numD;
	private JButton numE;
	private JButton numF;
	private JButton delete;
	private JButton deleteAll;
	private JButton convert;
	private JComboBox<String> baseNumber;
	private JComboBox<String> baseResult;
	private JTextField numberConverter;
	private JLabel resultConversion;

	public MainWindow() {

		setTitle("CALCULADORA");
		setSize(new Dimension(600, 350));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);

		setLayout(new BorderLayout());
		setIconImage(new ImageIcon("resource/images/logotipo.png").getImage());

		beginComponests();
		addComponets();
		close();
		begin();

	}

	private void beginComponests() {
		mainMenu = new MainMenu();

		convert = new JButton("CONVERTIR");
		convert.setActionCommand("convert");
		convert.setFont(new Font("Algerian", 3, 18));

		baseNumber = new JComboBox<String>();
		baseResult = new JComboBox<String>();

		numberConverter = new JTextField();

		resultConversion = new JLabel();

		delete = new JButton("Borrar");
		delete.setActionCommand("delete");
		delete.setFont(new Font("Serif", 0, 12));

		deleteAll = new JButton("Borrar Todo");
		deleteAll.setActionCommand("deleteAll");
		deleteAll.setFont(new Font("Serif", 0, 12));

		num0 = new JButton("0");
		num0.setActionCommand("0");
		num1 = new JButton("1");
		num1.setActionCommand("1");
		num2 = new JButton("2");
		num2.setActionCommand("2");
		num3 = new JButton("3");
		num3.setActionCommand("3");
		num4 = new JButton("4");
		num4.setActionCommand("4");
		num5 = new JButton("5");
		num5.setActionCommand("5");
		num6 = new JButton("6");
		num6.setActionCommand("6");
		num7 = new JButton("7");
		num7.setActionCommand("7");
		num8 = new JButton("8");
		num8.setActionCommand("8");
		num9 = new JButton("9");
		num9.setActionCommand("9");
		numA = new JButton("A");
		numA.setActionCommand("A");
		numB = new JButton("B");
		numB.setActionCommand("B");
		numC = new JButton("C");
		numC.setActionCommand("C");
		numD = new JButton("D");
		numD.setActionCommand("D");
		numE = new JButton("E");
		numE.setActionCommand("E");
		numF = new JButton("F");
		numF.setActionCommand("F");

		DisableBtn();

	}

	private void addComponets() {

		this.setJMenuBar(mainMenu);

		JPanel pnlButNumbers = new JPanel();

		JPanel pnlData = new JPanel();

		GridLayout ButNumbers = new GridLayout(4, 5);
		ButNumbers.setHgap(5);
		ButNumbers.setVgap(5);

		pnlButNumbers.setLayout(ButNumbers);
		pnlButNumbers.add(numA);
		pnlButNumbers.add(numB);
		pnlButNumbers.add(num7);
		pnlButNumbers.add(num8);
		pnlButNumbers.add(num9);
		pnlButNumbers.add(numC);
		pnlButNumbers.add(numD);
		pnlButNumbers.add(num4);
		pnlButNumbers.add(num5);
		pnlButNumbers.add(num6);
		pnlButNumbers.add(numE);
		pnlButNumbers.add(numF);
		pnlButNumbers.add(num1);
		pnlButNumbers.add(num2);
		pnlButNumbers.add(num3);
		pnlButNumbers.add(new JLabel(""));
		pnlButNumbers.add(new JLabel(""));
		pnlButNumbers.add(new JLabel(""));
		pnlButNumbers.add(num0);

		pnlData.setLayout(null);
		delete.setBounds(359, 150, 113, 22);
		deleteAll.setBounds(478, 150, 113, 22);
		convert.setBounds(220, 70, 140, 30);

		JLabel informacion = new JLabel("Seleccionar Base NUMERO:");
		informacion.setBounds(20, 20, 200, 20);
		JLabel number = new JLabel("NUMERO A CONVERTIR:");
		number.setFont(new Font("Verdana", Font.ITALIC, 12));
		number.setBounds(20, 80, 150, 20);

		numberConverter.setBounds(20, 100, 150, 30);

		JLabel informacion2 = new JLabel("Seleccionar Base A CONVETIR:");
		informacion2.setBounds(400, 20, 200, 20);
		JLabel result = new JLabel("RESULTADO:");
		result.setFont(new Font("Verdana", Font.ITALIC, 13));
		result.setBounds(400, 80, 150, 20);

		resultConversion.setBounds(400, 100, 150, 20);

		baseNumber.addItem("SELECCIONAR");
		baseNumber.addItem(ActionsViews.BASE_BINARY);
		baseNumber.addItem(ActionsViews.BASE_DECIMAL);
		baseNumber.addItem(ActionsViews.BASE_OCTAL);
		baseNumber.addItem(ActionsViews.BASE_HEXADECIMAL);
		baseNumber.setBounds(20, 40, 150, 20);

		baseResult.setBounds(400, 40, 150, 20);
		baseResult.addItem(ActionsViews.BASE_BINARY);
		baseResult.addItem(ActionsViews.BASE_DECIMAL);
		baseResult.addItem(ActionsViews.BASE_OCTAL);
		baseResult.addItem(ActionsViews.BASE_HEXADECIMAL);
		baseResult.setEnabled(false);

		pnlData.add(delete);
		pnlData.add(deleteAll);
		pnlData.add(number);
		pnlData.add(result);
		pnlData.add(informacion);
		pnlData.add(informacion2);
		pnlData.add(baseNumber);
		pnlData.add(baseResult);
		pnlData.add(numberConverter);
		pnlData.add(resultConversion);
		pnlData.add(convert);

		validateInput(numberConverter);

		add(pnlButNumbers, BorderLayout.SOUTH);
		add(pnlData, BorderLayout.CENTER);

	}

	public void close() {

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int valor;
				do {
					valor = JOptionPane.showConfirmDialog(null, "¿DESEA SALIR?", "ADVERTENCIA",
							JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
				} while (valor != JOptionPane.OK_OPTION && valor != JOptionPane.CANCEL_OPTION
						&& valor != JOptionPane.CLOSED_OPTION);

				if (valor == JOptionPane.OK_OPTION) {
					setVisible(false);

					JOptionPane.showMessageDialog(null, "GRACIAS POR USAR LA APLICACION");
					System.exit(0);
				}

			}
		});

	}

	public void binary() {
		ActivateBtn();
		num2.setEnabled(false);
		num3.setEnabled(false);
		num4.setEnabled(false);
		num5.setEnabled(false);
		num6.setEnabled(false);
		num7.setEnabled(false);
		num8.setEnabled(false);
		num9.setEnabled(false);
		numA.setEnabled(false);
		numB.setEnabled(false);
		numC.setEnabled(false);
		numD.setEnabled(false);
		numE.setEnabled(false);
		numF.setEnabled(false);

	}

	public void decimal() {
		ActivateBtn();
		numA.setEnabled(false);
		numB.setEnabled(false);
		numC.setEnabled(false);
		numD.setEnabled(false);
		numE.setEnabled(false);
		numF.setEnabled(false);

	}

	public void octal() {
		ActivateBtn();
		num8.setEnabled(false);
		num9.setEnabled(false);
		numA.setEnabled(false);
		numB.setEnabled(false);
		numC.setEnabled(false);
		numD.setEnabled(false);
		numE.setEnabled(false);
		numF.setEnabled(false);

	}

	public void HexaDecimal() {

		ActivateBtn();

	}

	public void ActivateBtn() {

		numberConverter.setEnabled(true);
		baseResult.setEnabled(true);
		convert.setEnabled(true);
		delete.setEnabled(true);
		deleteAll.setEnabled(true);
		num0.setEnabled(true);
		num1.setEnabled(true);
		num2.setEnabled(true);
		num3.setEnabled(true);
		num4.setEnabled(true);
		num5.setEnabled(true);
		num6.setEnabled(true);
		num7.setEnabled(true);
		num8.setEnabled(true);
		num9.setEnabled(true);
		numA.setEnabled(true);
		numB.setEnabled(true);
		numC.setEnabled(true);
		numD.setEnabled(true);
		numE.setEnabled(true);
		numF.setEnabled(true);

	}

	public void DisableBtn() {
		numberConverter.setEnabled(false);
		baseResult.setEnabled(false);
		convert.setEnabled(false);
		delete.setEnabled(false);
		deleteAll.setEnabled(false);
		num0.setEnabled(false);
		num1.setEnabled(false);
		num2.setEnabled(false);
		num3.setEnabled(false);
		num4.setEnabled(false);
		num5.setEnabled(false);
		num6.setEnabled(false);
		num7.setEnabled(false);
		num8.setEnabled(false);
		num9.setEnabled(false);
		numA.setEnabled(false);
		numB.setEnabled(false);
		numC.setEnabled(false);
		numD.setEnabled(false);
		numE.setEnabled(false);
		numF.setEnabled(false);

	}

	public void validateInput(JTextField textField) {
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char Input = e.getKeyChar();

				if (Input < '0' || Input > '9' && Input < 'a' || Input > 'f') {
					getToolkit().beep();
					e.consume();

				}
			}

		});
	}

	@Override
	public Object[] readDates() {
		Object[] objects = new Object[] { numberConverter.getText().toString(), baseNumber.getSelectedItem().toString(),
				baseResult.getSelectedItem().toString() };
		return objects;
	}

	@Override
	public void setControl(ControlCalculate control) {
		convert.addActionListener(control);
		baseNumber.addItemListener(control);
		delete.addActionListener(control);
		deleteAll.addActionListener(control);

		num0.addActionListener(control);
		num1.addActionListener(control);
		num2.addActionListener(control);
		num3.addActionListener(control);
		num4.addActionListener(control);
		num5.addActionListener(control);
		num6.addActionListener(control);
		num7.addActionListener(control);
		num8.addActionListener(control);
		num9.addActionListener(control);
		numA.addActionListener(control);
		numB.addActionListener(control);
		numC.addActionListener(control);
		numD.addActionListener(control);
		numE.addActionListener(control);
		numF.addActionListener(control);

		mainMenu.setControl(control);

	}

	public void writeNumbers(String number) {
		numberConverter.setText(numberConverter.getText() + number);
	}

	public void clearNumbers() {
		numberConverter.setText("");
	}

	@Override
	public void writeResult(String result) {
		resultConversion.setText(result.toUpperCase());

	}

	@Override
	public void begin() {
		this.setVisible(true);
	}
}
