import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import java.awt.Image;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class ProfitApp {

	private JFrame frmProfitCalculator;
	private JTextField initVal;
	private JTextField sellVal;
	private JTextField opVal;
	private JTextField guideVal;
	private JTextField Val1;
	private JTextField Val2;
	private JTextField Val3;
	private JTextField Val4;
	private JTextField Val5;
	private JTextField textField_7;
	private JLabel new_profit, op_profit, opOut, guideOut, M1, M2, M3, M4, M5, init48, sell48, op48, guide48, profit48, x148, x248, x348, x448, x548;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField multi;
	private JTextField initMulti;
	private JTextField sellMulti;
	private JTextField opMulti;
	private JTextField guideMulti;
	private JTextField profitMulti;
	private JTextField Multi1;
	private JTextField Multi2;
	private JTextField Multi3;
	private JTextField Multi4;
	private JTextField Multi5;
	private JTextField quantityVal;
	private JTextField txtDdmmyyyy;
	private JTextField textField_6;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField qty;
	private JTextField outlet1;
	private JTextField outlet2;
	private JTextField outlet3;
	private JTextField outlet4;
	private JTextField outlet5;
	private JTextField outletTotal;
	private JTextField outlet1sale;
	private JTextField outlet2sale;
	private JTextField outlet3sale;
	private JTextField outlet5sale;
	private JTextField outlet4sale;
	private JTextField outletTotalSale;
	private JTextField remainVal;
	private JTextField initSale;
	private JTextField sellSale;
	private JTextField opSale;
	private JTextField guideSale;
	private JTextField profitSale;
	private JTextField Sale1;
	private JTextField Sale2;
	private JTextField Sale4;
	private JTextField Sale3;
	private JTextField Sale5;
	private JTextField costRemain;
	private JLabel imageVal;
	private JTextField textField_5;
	
	private boolean modification = false;
	private String filePath = "";
	private String imagePath = "";
	private File file;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfitApp window = new ProfitApp();
					window.frmProfitCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProfitApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProfitCalculator = new JFrame();
		frmProfitCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(ProfitApp.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		frmProfitCalculator.setTitle("E.K.GRAND COMPANY LIMITED                                                                                                                                                                                                                PRODUCT LIST DETAIL");
		frmProfitCalculator.setBounds(0, 0, 1920, 1035);
		frmProfitCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProfitCalculator.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(662, 49, 0, 400);
		frmProfitCalculator.getContentPane().add(separator);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.BLACK);
		canvas.setBounds(949, 26, 10, 1015);
		frmProfitCalculator.getContentPane().add(canvas);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(12, 762, 931, 213);
		frmProfitCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPartnershipProfitSharing = new JLabel("Partnership Profit Sharing Calculating");
		lblPartnershipProfitSharing.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPartnershipProfitSharing.setBounds(12, 0, 472, 29);
		panel.add(lblPartnershipProfitSharing);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(32, 32, 254, 31);
		panel.add(textField);
		textField.setText("<company name>");
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		textField.setColumns(10);
		
		JLabel lblCts = new JLabel("1");
		lblCts.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCts.setBounds(12, 35, 28, 28);
		panel.add(lblCts);
		
		JLabel lblCtst = new JLabel("2");
		lblCtst.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCtst.setBounds(12, 64, 28, 28);
		panel.add(lblCtst);
		
		JLabel lblPlus = new JLabel("3");
		lblPlus.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPlus.setBounds(12, 93, 28, 27);
		panel.add(lblPlus);
		
		JLabel lblEkGrand = new JLabel("4");
		lblEkGrand.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblEkGrand.setBounds(12, 122, 28, 27);
		panel.add(lblEkGrand);
		
		JLabel lblCenteracc = new JLabel("5");
		lblCenteracc.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCenteracc.setBounds(12, 151, 28, 30);
		panel.add(lblCenteracc);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(33, 148, 253, 33);
		panel.add(textField_4);
		textField_4.setText("<company name>");
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(33, 119, 253, 30);
		panel.add(textField_3);
		textField_3.setText("<company name>");
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(33, 90, 253, 30);
		panel.add(textField_2);
		textField_2.setText("<company name>");
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(33, 61, 253, 31);
		panel.add(textField_1);
		textField_1.setText("<company name>");
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		textField_1.setColumns(10);
		
		Val1 = new JTextField();
		Val1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Val1.setBounds(312, 32, 47, 31);
		panel.add(Val1);
		Val1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		Val1.setText("0");
		Val1.setColumns(10);
		
		Val2 = new JTextField();
		Val2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Val2.setBounds(312, 61, 47, 31);
		panel.add(Val2);
		Val2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		Val2.setText("0");
		Val2.setColumns(10);
		
		Val3 = new JTextField();
		Val3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Val3.setBounds(312, 90, 47, 30);
		panel.add(Val3);
		Val3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		Val3.setText("0");
		Val3.setColumns(10);
		
		Val4 = new JTextField();
		Val4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Val4.setBounds(312, 119, 47, 30);
		panel.add(Val4);
		Val4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		Val4.setText("0");
		Val4.setColumns(10);
		
		Val5 = new JTextField();
		Val5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Val5.setBounds(312, 148, 47, 33);
		panel.add(Val5);
		Val5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		Val5.setText("0");
		Val5.setColumns(10);
		
		JLabel lblPerBox_10 = new JLabel("% = ");
		lblPerBox_10.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_10.setBounds(371, 151, 51, 30);
		panel.add(lblPerBox_10);
		
		JLabel lblPerBox_9 = new JLabel("% = ");
		lblPerBox_9.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_9.setBounds(371, 122, 51, 27);
		panel.add(lblPerBox_9);
		
		JLabel lblPerBox_8 = new JLabel("% = ");
		lblPerBox_8.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_8.setBounds(371, 93, 51, 27);
		panel.add(lblPerBox_8);
		
		JLabel lblPerBox_7 = new JLabel("% = ");
		lblPerBox_7.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_7.setBounds(371, 64, 51, 28);
		panel.add(lblPerBox_7);
		
		JLabel lblPerBox_6 = new JLabel("% = ");
		lblPerBox_6.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_6.setBounds(371, 35, 51, 28);
		panel.add(lblPerBox_6);
		
		M1 = new JLabel("0.0");
		M1.setFont(new Font("Dialog", Font.PLAIN, 21));
		M1.setBounds(426, 35, 76, 28);
		panel.add(M1);
		
		M2 = new JLabel("0.0");
		M2.setFont(new Font("Dialog", Font.PLAIN, 21));
		M2.setBounds(426, 64, 76, 28);
		panel.add(M2);
		
		M3 = new JLabel("0.0");
		M3.setFont(new Font("Dialog", Font.PLAIN, 21));
		M3.setBounds(426, 93, 76, 27);
		panel.add(M3);
		
		M4 = new JLabel("0.0");
		M4.setFont(new Font("Dialog", Font.PLAIN, 21));
		M4.setBounds(426, 122, 76, 27);
		panel.add(M4);
		
		M5 = new JLabel("0.0");
		M5.setFont(new Font("Dialog", Font.PLAIN, 21));
		M5.setBounds(426, 151, 76, 30);
		panel.add(M5);
		
		JLabel lblPerBoxbag_4 = new JLabel("\u0E3F per box/bag");
		lblPerBoxbag_4.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBoxbag_4.setBounds(504, 151, 148, 30);
		panel.add(lblPerBoxbag_4);
		
		JLabel lblPerBoxbag_3 = new JLabel("\u0E3F per box/bag");
		lblPerBoxbag_3.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBoxbag_3.setBounds(504, 122, 148, 27);
		panel.add(lblPerBoxbag_3);
		
		JLabel lblPerBoxbag_2 = new JLabel("\u0E3F per box/bag");
		lblPerBoxbag_2.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBoxbag_2.setBounds(504, 93, 148, 27);
		panel.add(lblPerBoxbag_2);
		
		JLabel lblPerBoxbag_1 = new JLabel("\u0E3F per box/bag");
		lblPerBoxbag_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBoxbag_1.setBounds(504, 64, 148, 28);
		panel.add(lblPerBoxbag_1);
		
		JLabel lblPerBoxbag = new JLabel("\u0E3F per box/bag");
		lblPerBoxbag.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBoxbag.setBounds(504, 35, 148, 28);
		panel.add(lblPerBoxbag);
		
		JLabel lblCarton_5 = new JLabel("=");
		lblCarton_5.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_5.setBounds(668, 35, 36, 28);
		panel.add(lblCarton_5);
		
		JLabel lblCarton_6 = new JLabel("=");
		lblCarton_6.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_6.setBounds(668, 64, 36, 28);
		panel.add(lblCarton_6);
		
		JLabel lblCarton_7 = new JLabel("=");
		lblCarton_7.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_7.setBounds(668, 93, 36, 27);
		panel.add(lblCarton_7);
		
		JLabel lblCarton_8 = new JLabel("=");
		lblCarton_8.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_8.setBounds(668, 122, 36, 27);
		panel.add(lblCarton_8);
		
		JLabel lblCarton_9 = new JLabel("=");
		lblCarton_9.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_9.setBounds(668, 151, 36, 30);
		panel.add(lblCarton_9);
		
		x548 = new JLabel("0.0");
		x548.setFont(new Font("Dialog", Font.PLAIN, 21));
		x548.setBounds(693, 151, 103, 30);
		panel.add(x548);
		
		x448 = new JLabel("0.0");
		x448.setFont(new Font("Dialog", Font.PLAIN, 21));
		x448.setBounds(693, 122, 103, 27);
		panel.add(x448);
		
		x348 = new JLabel("0.0");
		x348.setFont(new Font("Dialog", Font.PLAIN, 21));
		x348.setBounds(693, 93, 103, 27);
		panel.add(x348);
		
		x248 = new JLabel("0.0");
		x248.setFont(new Font("Dialog", Font.PLAIN, 21));
		x248.setBounds(693, 64, 103, 28);
		panel.add(x248);
		
		x148 = new JLabel("0.0");
		x148.setFont(new Font("Dialog", Font.PLAIN, 21));
		x148.setBounds(693, 35, 103, 28);
		panel.add(x148);
		
		JLabel lblPerCarton_5 = new JLabel("\u0E3F per carton");
		lblPerCarton_5.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_5.setBounds(804, 35, 115, 28);
		panel.add(lblPerCarton_5);
		
		JLabel lblPerCarton_6 = new JLabel("\u0E3F per carton");
		lblPerCarton_6.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_6.setBounds(804, 64, 115, 28);
		panel.add(lblPerCarton_6);
		
		JLabel lblPerCarton_7 = new JLabel("\u0E3F per carton");
		lblPerCarton_7.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_7.setBounds(804, 93, 115, 27);
		panel.add(lblPerCarton_7);
		
		JLabel lblPerCarton_8 = new JLabel("\u0E3F per carton");
		lblPerCarton_8.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_8.setBounds(804, 122, 115, 27);
		panel.add(lblPerCarton_8);
		
		JLabel lblPerCarton_9 = new JLabel("\u0E3F per carton");
		lblPerCarton_9.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_9.setBounds(804, 151, 115, 30);
		panel.add(lblPerCarton_9);
		
		JLabel lblMustBeTotal = new JLabel("Must be total 100%");
		lblMustBeTotal.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblMustBeTotal.setBounds(265, 184, 200, 29);
		panel.add(lblMustBeTotal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(12, 481, 920, 268);
		frmProfitCalculator.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCost.setBounds(12, 48, 56, 16);
		panel_1.add(lblCost);
		
		initVal = new JTextField();
		initVal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		initVal.setBounds(194, 41, 89, 30);
		panel_1.add(initVal);
		initVal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		initVal.setText("0");
		initVal.setColumns(10);
		
		sellVal = new JTextField();
		sellVal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sellVal.setBounds(194, 71, 89, 30);
		panel_1.add(sellVal);
		sellVal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		sellVal.setText("0");
		sellVal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Retail Price");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblNewLabel.setBounds(12, 78, 147, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblOp = new JLabel("O.P. Sharing");
		lblOp.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblOp.setBounds(12, 104, 173, 36);
		panel_1.add(lblOp);
		
		JLabel lblGuide = new JLabel("Guide Sharing");
		lblGuide.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblGuide.setBounds(12, 146, 193, 36);
		panel_1.add(lblGuide);
		
		JLabel lblGrossProfitAfter = new JLabel("Gross Profit After OP and Guide Sharing");
		lblGrossProfitAfter.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblGrossProfitAfter.setBounds(12, 185, 431, 28);
		panel_1.add(lblGrossProfitAfter);
		
		JLabel lblOpGuide = new JLabel("Gross Profit After OP and Guide Sharing");
		lblOpGuide.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblOpGuide.setBounds(12, 213, 431, 36);
		panel_1.add(lblOpGuide);
		
		guideVal = new JTextField();
		guideVal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		guideVal.setBounds(253, 150, 49, 28);
		panel_1.add(guideVal);
		guideVal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		guideVal.setText("0");
		guideVal.setColumns(10);
		
		opVal = new JTextField();
		opVal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		opVal.setBounds(253, 106, 49, 29);
		panel_1.add(opVal);
		opVal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		opVal.setText("0");
		opVal.setColumns(10);
		
		JLabel lblPerBox_2 = new JLabel("% per box/bag");
		lblPerBox_2.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_2.setBounds(307, 105, 136, 35);
		panel_1.add(lblPerBox_2);
		
		JLabel lblPerBox_3 = new JLabel("% per box/bag");
		lblPerBox_3.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_3.setBounds(307, 144, 154, 40);
		panel_1.add(lblPerBox_3);
		
		opOut = new JLabel("0.0");
		opOut.setFont(new Font("Dialog", Font.PLAIN, 21));
		opOut.setBounds(455, 109, 86, 26);
		panel_1.add(opOut);
		
		guideOut = new JLabel("0.0");
		guideOut.setFont(new Font("Dialog", Font.PLAIN, 21));
		guideOut.setBounds(455, 149, 87, 30);
		panel_1.add(guideOut);
		
		JLabel label_27 = new JLabel("\u0E3F");
		label_27.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_27.setBounds(553, 109, 56, 26);
		panel_1.add(label_27);
		
		JLabel label_28 = new JLabel("\u0E3F");
		label_28.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_28.setBounds(554, 151, 37, 27);
		panel_1.add(label_28);
		
		new_profit = new JLabel("0.0");
		new_profit.setFont(new Font("Dialog", Font.PLAIN, 21));
		new_profit.setBounds(399, 185, 93, 28);
		panel_1.add(new_profit);
		
		op_profit = new JLabel("0.0");
		op_profit.setFont(new Font("Dialog", Font.PLAIN, 21));
		op_profit.setBounds(399, 216, 93, 30);
		panel_1.add(op_profit);
		
		JLabel lblPerBox_5 = new JLabel("%");
		lblPerBox_5.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_5.setBounds(498, 226, 70, 16);
		panel_1.add(lblPerBox_5);
		
		JLabel lblPerBox_4 = new JLabel("\u0E3F per box");
		lblPerBox_4.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_4.setBounds(498, 185, 100, 28);
		panel_1.add(lblPerBox_4);
		
		JLabel lblCarton_4 = new JLabel("=");
		lblCarton_4.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_4.setBounds(598, 185, 62, 28);
		panel_1.add(lblCarton_4);
		
		JLabel lblCarton_3 = new JLabel("=");
		lblCarton_3.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_3.setBounds(602, 155, 70, 16);
		panel_1.add(lblCarton_3);
		
		JLabel lblCarton_2 = new JLabel("=");
		lblCarton_2.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_2.setBounds(602, 114, 70, 16);
		panel_1.add(lblCarton_2);
		
		op48 = new JLabel("0.0");
		op48.setFont(new Font("Dialog", Font.PLAIN, 21));
		op48.setBounds(654, 109, 136, 28);
		panel_1.add(op48);
		
		guide48 = new JLabel("0.0");
		guide48.setFont(new Font("Dialog", Font.PLAIN, 21));
		guide48.setBounds(654, 146, 136, 36);
		panel_1.add(guide48);
		
		profit48 = new JLabel("0.0");
		profit48.setFont(new Font("Dialog", Font.PLAIN, 21));
		profit48.setBounds(625, 185, 80, 28);
		panel_1.add(profit48);
		
		JLabel lblPerCarton_4 = new JLabel("\u0E3F per carton");
		lblPerCarton_4.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_4.setBounds(717, 185, 180, 28);
		panel_1.add(lblPerCarton_4);
		
		JLabel lblPerCarton_3 = new JLabel("\u0E3F per carton");
		lblPerCarton_3.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_3.setBounds(802, 150, 154, 28);
		panel_1.add(lblPerCarton_3);
		
		JLabel lblPerCarton_2 = new JLabel("\u0E3F per carton");
		lblPerCarton_2.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_2.setBounds(802, 108, 180, 28);
		panel_1.add(lblPerCarton_2);
		
		JLabel lblPerCarton_1 = new JLabel("\u0E3F per carton");
		lblPerCarton_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton_1.setBounds(599, 75, 125, 26);
		panel_1.add(lblPerCarton_1);
		
		JLabel lblPerCarton = new JLabel("\u0E3F per carton");
		lblPerCarton.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerCarton.setBounds(600, 43, 154, 26);
		panel_1.add(lblPerCarton);
		
		init48 = new JLabel("0.0");
		init48.setFont(new Font("Dialog", Font.PLAIN, 21));
		init48.setBounds(467, 41, 120, 30);
		panel_1.add(init48);
		
		sell48 = new JLabel("0.0");
		sell48.setFont(new Font("Dialog", Font.PLAIN, 21));
		sell48.setBounds(467, 71, 120, 30);
		panel_1.add(sell48);
		
		JLabel lblCarton_1 = new JLabel("=");
		lblCarton_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton_1.setBounds(441, 78, 70, 23);
		panel_1.add(lblCarton_1);
		
		JLabel lblCarton = new JLabel("=");
		lblCarton.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCarton.setBounds(441, 47, 70, 19);
		panel_1.add(lblCarton);
		
		JLabel lblPerBox = new JLabel("\u0E3F per box/bag");
		lblPerBox.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox.setBounds(295, 45, 137, 19);
		panel_1.add(lblPerBox);
		
		JLabel lblPerBox_1 = new JLabel("\u0E3F per box/bag");
		lblPerBox_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerBox_1.setBounds(295, 75, 137, 26);
		panel_1.add(lblPerBox_1);
		
		JLabel lblPrimaryCostCalculating = new JLabel("Primary Cost Calculating");
		lblPrimaryCostCalculating.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPrimaryCostCalculating.setBounds(12, 13, 292, 22);
		panel_1.add(lblPrimaryCostCalculating);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(965, 49, 450, 328);
		frmProfitCalculator.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSku = new JLabel("=");
		lblSku.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSku.setBounds(100, 90, 55, 22);
		panel_2.add(lblSku);
		
		JLabel lblCartons = new JLabel("cartons");
		lblCartons.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblCartons.setBounds(281, 87, 73, 28);
		panel_2.add(lblCartons);
		
		multi = new JTextField();
		multi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		multi.setBounds(167, 86, 89, 31);
		panel_2.add(multi);
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		multi.setText("0");
		multi.setColumns(10);
		
		JLabel lblCalculatingByQuantity = new JLabel("CALCULATING BY QUANTITY");
		lblCalculatingByQuantity.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCalculatingByQuantity.setBounds(12, 13, 292, 22);
		panel_2.add(lblCalculatingByQuantity);
		
		JLabel lblOutlet = new JLabel("OUTLET 1");
		lblOutlet.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblOutlet.setBounds(23, 132, 125, 28);
		panel_2.add(lblOutlet);
		
		JLabel lblOutlet_1 = new JLabel("OUTLET 2");
		lblOutlet_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblOutlet_1.setBounds(23, 162, 125, 28);
		panel_2.add(lblOutlet_1);
		
		JLabel lblOutlet_2 = new JLabel("OUTLET 3");
		lblOutlet_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblOutlet_2.setBounds(23, 193, 125, 28);
		panel_2.add(lblOutlet_2);
		
		JLabel lblOutlet_3 = new JLabel("OUTLET 4");
		lblOutlet_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblOutlet_3.setBounds(23, 222, 125, 28);
		panel_2.add(lblOutlet_3);
		
		JLabel lblOutlet_4 = new JLabel("OUTLET 5");
		lblOutlet_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblOutlet_4.setBounds(23, 251, 125, 28);
		panel_2.add(lblOutlet_4);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblTotal.setBounds(23, 287, 125, 28);
		panel_2.add(lblTotal);
		
		JLabel lblQuantity = new JLabel("QUANTITY =");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblQuantity.setBounds(23, 48, 156, 28);
		panel_2.add(lblQuantity);
		
		qty = new JTextField();
		qty.setText("0");
		qty.setFont(new Font("Tahoma", Font.PLAIN, 20));
		qty.setEditable(false);
		qty.setColumns(10);
		qty.setBounds(167, 48, 110, 28);
		panel_2.add(qty);
		
		outlet1 = new JTextField();
		outlet1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet1.setText("0");
		outlet1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet1.setColumns(10);
		outlet1.setBounds(160, 131, 89, 31);
		panel_2.add(outlet1);
		
		outlet2 = new JTextField();
		outlet2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet2.setText("0");
		outlet2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet2.setColumns(10);
		outlet2.setBounds(160, 161, 89, 30);
		panel_2.add(outlet2);
		
		outlet3 = new JTextField();
		outlet3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet3.setText("0");
		outlet3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet3.setColumns(10);
		outlet3.setBounds(160, 193, 89, 30);
		panel_2.add(outlet3);
		
		outlet4 = new JTextField();
		outlet4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet4.setText("0");
		outlet4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet4.setColumns(10);
		outlet4.setBounds(160, 221, 89, 31);
		panel_2.add(outlet4);
		
		outlet5 = new JTextField();
		outlet5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet5.setText("0");
		outlet5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet5.setColumns(10);
		outlet5.setBounds(160, 248, 89, 31);
		panel_2.add(outlet5);
		
		outletTotal = new JTextField();
		outletTotal.setText("0");
		outletTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outletTotal.setEditable(false);
		outletTotal.setColumns(10);
		outletTotal.setBounds(160, 287, 110, 28);
		panel_2.add(outletTotal);
		
		JLabel lblBoxesbags = new JLabel("boxes/bags");
		lblBoxesbags.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblBoxesbags.setBounds(301, 46, 132, 28);
		panel_2.add(lblBoxesbags);
		
		JLabel label = new JLabel("cartons");
		label.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label.setBounds(261, 128, 73, 28);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("cartons");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_1.setBounds(261, 162, 73, 28);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("cartons");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_2.setBounds(261, 193, 73, 28);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("cartons");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_3.setBounds(261, 222, 73, 28);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("cartons");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_4.setBounds(261, 251, 73, 28);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("cartons");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_5.setBounds(301, 287, 73, 28);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(965, 413, 450, 276);
		frmProfitCalculator.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCost_1 = new JLabel("Cost =");
		lblCost_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCost_1.setBounds(12, 50, 91, 22);
		panel_3.add(lblCost_1);
		
		initMulti = new JTextField();
		initMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		initMulti.setBounds(193, 47, 231, 25);
		panel_3.add(initMulti);
		initMulti.setText("0.0");
		initMulti.setEditable(false);
		initMulti.setColumns(10);
		
		sellMulti = new JTextField();
		sellMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sellMulti.setBounds(193, 77, 231, 25);
		panel_3.add(sellMulti);
		sellMulti.setText("0.0");
		sellMulti.setEditable(false);
		sellMulti.setColumns(10);
		
		JLabel label_50 = new JLabel("\u0E3F");
		label_50.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_50.setBounds(430, 53, 48, 22);
		panel_3.add(label_50);
		
		JLabel label_51 = new JLabel("\u0E3F");
		label_51.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_51.setBounds(430, 83, 48, 19);
		panel_3.add(label_51);
		
		JLabel lblRetail = new JLabel("Retail Price =");
		lblRetail.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblRetail.setBounds(12, 80, 140, 19);
		panel_3.add(lblRetail);
		
		JLabel lblFixSharingPer = new JLabel("FIX SHARING PER QUANTITY");
		lblFixSharingPer.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblFixSharingPer.setBounds(13, 112, 313, 33);
		panel_3.add(lblFixSharingPer);
		
		JLabel lblNewLabel_2 = new JLabel("O.P. Sharing =");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(12, 150, 226, 33);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblGuide_1 = new JLabel("Guide Sharing =");
		lblGuide_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblGuide_1.setBounds(12, 184, 226, 33);
		panel_3.add(lblGuide_1);
		
		JLabel lblPureProfit = new JLabel("Gross Profit Per Quantity =");
		lblPureProfit.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPureProfit.setBounds(12, 219, 256, 33);
		panel_3.add(lblPureProfit);
		
		profitMulti = new JTextField();
		profitMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		profitMulti.setBounds(280, 217, 144, 31);
		panel_3.add(profitMulti);
		profitMulti.setText("0.0");
		profitMulti.setEditable(false);
		profitMulti.setColumns(10);
		
		guideMulti = new JTextField();
		guideMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		guideMulti.setBounds(280, 184, 144, 33);
		panel_3.add(guideMulti);
		guideMulti.setText("0.0");
		guideMulti.setEditable(false);
		guideMulti.setColumns(10);
		
		opMulti = new JTextField();
		opMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		opMulti.setBounds(280, 150, 144, 33);
		panel_3.add(opMulti);
		opMulti.setText("0.0");
		opMulti.setEditable(false);
		opMulti.setColumns(10);
		
		JLabel label_52 = new JLabel("\u0E3F");
		label_52.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_52.setBounds(430, 150, 48, 33);
		panel_3.add(label_52);
		
		JLabel label_53 = new JLabel("\u0E3F");
		label_53.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_53.setBounds(430, 184, 48, 33);
		panel_3.add(label_53);
		
		JLabel label_54 = new JLabel("\u0E3F");
		label_54.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_54.setBounds(430, 223, 48, 25);
		panel_3.add(label_54);
		
		JLabel lblPrimaryCostCalculating_1 = new JLabel("Primary Cost Calculating Per Quantity");
		lblPrimaryCostCalculating_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPrimaryCostCalculating_1.setBounds(12, 13, 387, 24);
		panel_3.add(lblPrimaryCostCalculating_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(965, 702, 450, 218);
		frmProfitCalculator.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblPartnershipSharing = new JLabel("Partnership Sharings Per Quantity");
		lblPartnershipSharing.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPartnershipSharing.setBounds(12, 13, 368, 28);
		panel_4.add(lblPartnershipSharing);
		
		JLabel lblPartner = new JLabel("Partner 1 =");
		lblPartner.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPartner.setBounds(10, 54, 150, 16);
		panel_4.add(lblPartner);
		
		JLabel lblPartner_1 = new JLabel("Partner 2 =");
		lblPartner_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPartner_1.setBounds(10, 83, 150, 16);
		panel_4.add(lblPartner_1);
		
		JLabel lblPartner_2 = new JLabel("Partner 3 =");
		lblPartner_2.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPartner_2.setBounds(10, 112, 150, 16);
		panel_4.add(lblPartner_2);
		
		JLabel lblPartner_3 = new JLabel("Partner 4 =");
		lblPartner_3.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPartner_3.setBounds(10, 141, 150, 16);
		panel_4.add(lblPartner_3);
		
		JLabel lblPartner_4 = new JLabel("Partner 5 =");
		lblPartner_4.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPartner_4.setBounds(10, 170, 150, 16);
		panel_4.add(lblPartner_4);
		
		Multi5 = new JTextField();
		Multi5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Multi5.setBounds(162, 164, 246, 28);
		panel_4.add(Multi5);
		Multi5.setText("0.0");
		Multi5.setEditable(false);
		Multi5.setColumns(10);
		
		Multi4 = new JTextField();
		Multi4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Multi4.setBounds(162, 135, 246, 28);
		panel_4.add(Multi4);
		Multi4.setText("0.0");
		Multi4.setEditable(false);
		Multi4.setColumns(10);
		
		Multi3 = new JTextField();
		Multi3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Multi3.setBounds(162, 106, 246, 28);
		panel_4.add(Multi3);
		Multi3.setText("0.0");
		Multi3.setEditable(false);
		Multi3.setColumns(10);
		
		Multi2 = new JTextField();
		Multi2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Multi2.setBounds(162, 77, 246, 28);
		panel_4.add(Multi2);
		Multi2.setText("0.0");
		Multi2.setEditable(false);
		Multi2.setColumns(10);
		
		Multi1 = new JTextField();
		Multi1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Multi1.setBounds(162, 48, 246, 28);
		panel_4.add(Multi1);
		Multi1.setText("0.0");
		Multi1.setEditable(false);
		Multi1.setColumns(10);
		
		JLabel lblPerSku = new JLabel("\u0E3F");
		lblPerSku.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerSku.setBounds(420, 54, 74, 16);
		panel_4.add(lblPerSku);
		
		JLabel lblPerSku_1 = new JLabel("\u0E3F");
		lblPerSku_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerSku_1.setBounds(420, 83, 74, 16);
		panel_4.add(lblPerSku_1);
		
		JLabel lblPerSku_2 = new JLabel("\u0E3F");
		lblPerSku_2.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerSku_2.setBounds(420, 112, 74, 16);
		panel_4.add(lblPerSku_2);
		
		JLabel lblPerSku_3 = new JLabel("\u0E3F");
		lblPerSku_3.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerSku_3.setBounds(420, 141, 74, 16);
		panel_4.add(lblPerSku_3);
		
		JLabel lblPerSku_4 = new JLabel("\u0E3F");
		lblPerSku_4.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblPerSku_4.setBounds(420, 170, 74, 16);
		panel_4.add(lblPerSku_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(12, 48, 931, 149);
		frmProfitCalculator.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblProfitCalculatorOf = new JLabel("Profit Sharing Structure for");
		lblProfitCalculatorOf.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblProfitCalculatorOf.setBounds(12, 13, 289, 33);
		panel_5.add(lblProfitCalculatorOf);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setBounds(279, 13, 281, 33);
		panel_5.add(textField_7);
		textField_7.setText("<product name>");
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		textField_7.setColumns(10);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDdmmyyyy.setBounds(480, 90, 141, 39);
		panel_5.add(txtDdmmyyyy);
		txtDdmmyyyy.setText("DD/MM/YYYY");
		txtDdmmyyyy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		txtDdmmyyyy.setColumns(10);
		
		JLabel lblAsIs = new JLabel("Duration");
		lblAsIs.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblAsIs.setBounds(387, 101, 114, 16);
		panel_5.add(lblAsIs);
		
		JLabel lblSupplierName = new JLabel("Supplier");
		lblSupplierName.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblSupplierName.setBounds(339, 53, 177, 24);
		panel_5.add(lblSupplierName);
		
		JLabel lblConditionCode = new JLabel("Condition Code");
		lblConditionCode.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblConditionCode.setBounds(12, 46, 177, 33);
		panel_5.add(lblConditionCode);
		
		JLabel lblReportBy = new JLabel("Report By");
		lblReportBy.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblReportBy.setBounds(12, 90, 220, 33);
		panel_5.add(lblReportBy);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		textField_6.setBounds(448, 46, 413, 39);
		panel_5.add(textField_6);
		textField_6.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(174, 46, 114, 39);
		panel_5.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(121, 91, 231, 39);
		panel_5.add(textField_11);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblTo.setBounds(668, 101, 56, 16);
		panel_5.add(lblTo);
		
		textField_12 = new JTextField();
		textField_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		textField_12.setText("DD/MM/YYYY");
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(720, 90, 141, 39);
		panel_5.add(textField_12);
		
		textField_5 = new JTextField();
		textField_5.setText("<product code>");
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(572, 13, 281, 33);
		panel_5.add(textField_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 210, 409, 66);
		frmProfitCalculator.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(11, 19, 83, 29);
		panel_6.add(lblNewLabel_1);
		
		quantityVal = new JTextField();
		quantityVal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		quantityVal.setBounds(106, 15, 70, 37);
		panel_6.add(quantityVal);
		quantityVal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		quantityVal.setText("0");
		quantityVal.setColumns(10);
		
		JLabel lblBoxesPerCarton = new JLabel("Boxes/Bags per carton");
		lblBoxesPerCarton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblBoxesPerCarton.setBounds(188, 19, 330, 29);
		panel_6.add(lblBoxesPerCarton);
		
		JLabel lblPressAfterTyped = new JLabel("PRESS <ENTER> AFTER TYPED EACH TIMES TO CALCULATE");
		lblPressAfterTyped.setBounds(1184, 914, 772, 74);
		frmProfitCalculator.getContentPane().add(lblPressAfterTyped);
		lblPressAfterTyped.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(1429, 72, 431, 328);
		frmProfitCalculator.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblSaleActual = new JLabel("SALE ACTUAL");
		lblSaleActual.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblSaleActual.setBounds(12, 13, 292, 22);
		panel_7.add(lblSaleActual);
		
		JLabel label_6 = new JLabel("OUTLET 1");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_6.setBounds(12, 65, 125, 28);
		panel_7.add(label_6);
		
		outlet1sale = new JTextField();
		outlet1sale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		outlet1sale.setText("0");
		outlet1sale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet1sale.setColumns(10);
		outlet1sale.setBounds(149, 64, 89, 31);
		panel_7.add(outlet1sale);
		
		JLabel label_7 = new JLabel("cartons");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_7.setBounds(250, 61, 73, 28);
		panel_7.add(label_7);
		
		JLabel label_8 = new JLabel("cartons");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_8.setBounds(250, 95, 73, 28);
		panel_7.add(label_8);
		
		outlet2sale = new JTextField();
		outlet2sale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet2sale.setText("0");
		outlet2sale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet2sale.setColumns(10);
		outlet2sale.setBounds(149, 94, 89, 30);
		panel_7.add(outlet2sale);
		
		JLabel label_9 = new JLabel("OUTLET 2");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_9.setBounds(12, 95, 125, 28);
		panel_7.add(label_9);
		
		JLabel label_10 = new JLabel("OUTLET 3");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_10.setBounds(12, 126, 125, 28);
		panel_7.add(label_10);
		
		outlet3sale = new JTextField();
		outlet3sale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet3sale.setText("0");
		outlet3sale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet3sale.setColumns(10);
		outlet3sale.setBounds(149, 125, 89, 30);
		panel_7.add(outlet3sale);
		
		JLabel label_11 = new JLabel("cartons");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_11.setBounds(250, 126, 73, 28);
		panel_7.add(label_11);
		
		JLabel label_12 = new JLabel("cartons");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_12.setBounds(250, 155, 73, 28);
		panel_7.add(label_12);
		
		JLabel label_13 = new JLabel("cartons");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_13.setBounds(250, 184, 73, 28);
		panel_7.add(label_13);
		
		outlet5sale = new JTextField();
		outlet5sale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet5sale.setText("0");
		outlet5sale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet5sale.setColumns(10);
		outlet5sale.setBounds(149, 183, 89, 31);
		panel_7.add(outlet5sale);
		
		outlet4sale = new JTextField();
		outlet4sale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		outlet4sale.setText("0");
		outlet4sale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outlet4sale.setColumns(10);
		outlet4sale.setBounds(149, 154, 89, 31);
		panel_7.add(outlet4sale);
		
		JLabel label_14 = new JLabel("OUTLET 4");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_14.setBounds(12, 155, 125, 28);
		panel_7.add(label_14);
		
		JLabel label_15 = new JLabel("OUTLET 5");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_15.setBounds(12, 184, 125, 28);
		panel_7.add(label_15);
		
		JLabel lblSum = new JLabel("SUM");
		lblSum.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSum.setBounds(12, 225, 125, 28);
		panel_7.add(lblSum);
		
		outletTotalSale = new JTextField();
		outletTotalSale.setText("0");
		outletTotalSale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outletTotalSale.setEditable(false);
		outletTotalSale.setColumns(10);
		outletTotalSale.setBounds(149, 225, 110, 28);
		panel_7.add(outletTotalSale);
		
		JLabel label_17 = new JLabel("cartons");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_17.setBounds(290, 225, 73, 28);
		panel_7.add(label_17);
		
		JLabel lblRemain = new JLabel("REMAIN");
		lblRemain.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblRemain.setBounds(12, 252, 125, 28);
		panel_7.add(lblRemain);
		
		remainVal = new JTextField();
		remainVal.setText("0");
		remainVal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		remainVal.setEditable(false);
		remainVal.setColumns(10);
		remainVal.setBounds(149, 252, 110, 28);
		panel_7.add(remainVal);
		
		JLabel label_18 = new JLabel("cartons");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_18.setBounds(290, 252, 73, 28);
		panel_7.add(label_18);
		
		JLabel lblCostRemain = new JLabel("Cost Remain =");
		lblCostRemain.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblCostRemain.setBounds(12, 293, 139, 22);
		panel_7.add(lblCostRemain);
		
		costRemain = new JTextField();
		costRemain.setText("0.0");
		costRemain.setFont(new Font("Tahoma", Font.PLAIN, 20));
		costRemain.setEditable(false);
		costRemain.setColumns(10);
		costRemain.setBounds(159, 293, 204, 25);
		panel_7.add(costRemain);
		
		JLabel label_44 = new JLabel("\u0E3F");
		label_44.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_44.setBounds(383, 293, 36, 22);
		panel_7.add(label_44);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(1427, 413, 463, 276);
		frmProfitCalculator.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		JLabel label_16 = new JLabel("SALE ACTUAL");
		label_16.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_16.setBounds(12, 16, 292, 22);
		panel_8.add(label_16);
		
		JLabel label_20 = new JLabel("Cost =");
		label_20.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_20.setBounds(12, 51, 91, 22);
		panel_8.add(label_20);
		
		JLabel label_21 = new JLabel("Retail Price =");
		label_21.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_21.setBounds(12, 81, 140, 19);
		panel_8.add(label_21);
		
		initSale = new JTextField();
		initSale.setText("0.0");
		initSale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		initSale.setEditable(false);
		initSale.setColumns(10);
		initSale.setBounds(193, 48, 239, 25);
		panel_8.add(initSale);
		
		sellSale = new JTextField();
		sellSale.setText("0.0");
		sellSale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sellSale.setEditable(false);
		sellSale.setColumns(10);
		sellSale.setBounds(193, 78, 239, 25);
		panel_8.add(sellSale);
		
		JLabel label_22 = new JLabel("FIX SHARING PER QUANTITY");
		label_22.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_22.setBounds(13, 113, 313, 33);
		panel_8.add(label_22);
		
		JLabel label_23 = new JLabel("O.P. Sharing =");
		label_23.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_23.setBounds(12, 151, 226, 33);
		panel_8.add(label_23);
		
		JLabel label_24 = new JLabel("Guide Sharing =");
		label_24.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_24.setBounds(12, 185, 226, 33);
		panel_8.add(label_24);
		
		JLabel label_25 = new JLabel("Gross Profit Per Quantity =");
		label_25.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_25.setBounds(12, 220, 256, 33);
		panel_8.add(label_25);
		
		opSale = new JTextField();
		opSale.setText("0.0");
		opSale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		opSale.setEditable(false);
		opSale.setColumns(10);
		opSale.setBounds(280, 151, 152, 33);
		panel_8.add(opSale);
		
		JLabel label_26 = new JLabel("\u0E3F");
		label_26.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_26.setBounds(444, 148, 48, 33);
		panel_8.add(label_26);
		
		JLabel label_29 = new JLabel("\u0E3F");
		label_29.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_29.setBounds(444, 81, 48, 19);
		panel_8.add(label_29);
		
		JLabel label_30 = new JLabel("\u0E3F");
		label_30.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_30.setBounds(444, 51, 48, 22);
		panel_8.add(label_30);
		
		guideSale = new JTextField();
		guideSale.setText("0.0");
		guideSale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		guideSale.setEditable(false);
		guideSale.setColumns(10);
		guideSale.setBounds(280, 185, 152, 33);
		panel_8.add(guideSale);
		
		JLabel label_31 = new JLabel("\u0E3F");
		label_31.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_31.setBounds(444, 182, 48, 33);
		panel_8.add(label_31);
		
		JLabel label_32 = new JLabel("\u0E3F");
		label_32.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_32.setBounds(444, 221, 48, 25);
		panel_8.add(label_32);
		
		profitSale = new JTextField();
		profitSale.setText("0.0");
		profitSale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		profitSale.setEditable(false);
		profitSale.setColumns(10);
		profitSale.setBounds(280, 218, 152, 31);
		panel_8.add(profitSale);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBounds(1427, 702, 463, 218);
		frmProfitCalculator.getContentPane().add(panel_9);
		panel_9.setLayout(null);
		
		JLabel label_19 = new JLabel("SALE ACTUAL");
		label_19.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_19.setBounds(12, 19, 292, 22);
		panel_9.add(label_19);
		
		JLabel label_33 = new JLabel("Partner 1 =");
		label_33.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_33.setBounds(12, 54, 150, 16);
		panel_9.add(label_33);
		
		Sale1 = new JTextField();
		Sale1.setText("0.0");
		Sale1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Sale1.setEditable(false);
		Sale1.setColumns(10);
		Sale1.setBounds(164, 48, 246, 28);
		panel_9.add(Sale1);
		
		JLabel label_34 = new JLabel("\u0E3F");
		label_34.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_34.setBounds(422, 54, 74, 16);
		panel_9.add(label_34);
		
		JLabel label_35 = new JLabel("\u0E3F");
		label_35.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_35.setBounds(422, 83, 74, 16);
		panel_9.add(label_35);
		
		Sale2 = new JTextField();
		Sale2.setText("0.0");
		Sale2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Sale2.setEditable(false);
		Sale2.setColumns(10);
		Sale2.setBounds(164, 77, 246, 28);
		panel_9.add(Sale2);
		
		JLabel label_36 = new JLabel("Partner 2 =");
		label_36.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_36.setBounds(12, 83, 150, 16);
		panel_9.add(label_36);
		
		JLabel label_37 = new JLabel("Partner 3 =");
		label_37.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_37.setBounds(12, 112, 150, 16);
		panel_9.add(label_37);
		
		JLabel label_38 = new JLabel("Partner 5 =");
		label_38.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_38.setBounds(12, 170, 150, 16);
		panel_9.add(label_38);
		
		JLabel label_39 = new JLabel("Partner 4 =");
		label_39.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_39.setBounds(12, 141, 150, 16);
		panel_9.add(label_39);
		
		Sale4 = new JTextField();
		Sale4.setText("0.0");
		Sale4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Sale4.setEditable(false);
		Sale4.setColumns(10);
		Sale4.setBounds(164, 135, 246, 28);
		panel_9.add(Sale4);
		
		Sale3 = new JTextField();
		Sale3.setText("0.0");
		Sale3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Sale3.setEditable(false);
		Sale3.setColumns(10);
		Sale3.setBounds(164, 106, 246, 28);
		panel_9.add(Sale3);
		
		Sale5 = new JTextField();
		Sale5.setText("0.0");
		Sale5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Sale5.setEditable(false);
		Sale5.setColumns(10);
		Sale5.setBounds(164, 164, 246, 28);
		panel_9.add(Sale5);
		
		JLabel label_40 = new JLabel("\u0E3F");
		label_40.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_40.setBounds(422, 112, 74, 16);
		panel_9.add(label_40);
		
		JLabel label_41 = new JLabel("\u0E3F");
		label_41.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_41.setBounds(422, 141, 74, 16);
		panel_9.add(label_41);
		
		JLabel label_42 = new JLabel("\u0E3F");
		label_42.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_42.setBounds(422, 170, 74, 16);
		panel_9.add(label_42);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setBounds(427, 210, 464, 258);
		frmProfitCalculator.getContentPane().add(panel_10);
		panel_10.setLayout(null);
		
		imageVal = new JLabel("                      <IMAGE>");
		imageVal.setBounds(0, 0, 464, 258);
		panel_10.add(imageVal);
		imageVal.setBackground(UIManager.getColor("Button.highlight"));
		imageVal.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JLabel lblProductImage = new JLabel("Product Image :");
		lblProductImage.setBounds(230, 289, 168, 29);
		frmProfitCalculator.getContentPane().add(lblProductImage);
		lblProductImage.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		Button browse = new Button("Browse");
		browse.setBounds(230, 336, 136, 42);
		frmProfitCalculator.getContentPane().add(browse);
		browse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 loadImage();
			}
		});
		browse.setName("Browse");
		browse.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1902, 29);
		frmProfitCalculator.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newFile();
			}
		});
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					openFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					saveFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As");
		mntmSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					saveFileAs();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});
		mnFile.add(mntmExit);
		
		
	}
	
	public void calculate(){
		double init = Double.parseDouble(initVal.getText());
		double sell = Double.parseDouble(sellVal.getText());
		double op = Double.parseDouble(opVal.getText())/100;
		
		double opDo = op * sell;
		
		double guide = Double.parseDouble(guideVal.getText())/100;
		double guideDo = guide * sell;
		
		
		double profit = sell - init - opDo - guideDo;
		if(profit <= 0) {
			sellVal.setForeground(Color.RED);
		} else {
			sellVal.setForeground(Color.BLACK);
		}
		
		double profitOP = 100*profit/sell;
		
		
		double x1 = Double.parseDouble(Val1.getText());
		double x2 = Double.parseDouble(Val2.getText());
		double x3 = Double.parseDouble(Val3.getText());
		double x4 = Double.parseDouble(Val4.getText());
		double x5 = Double.parseDouble(Val5.getText());
		
		if(x1+x2+x3+x4+x5 != 100) {
			Val1.setForeground(Color.RED);
			Val2.setForeground(Color.RED);
			Val3.setForeground(Color.RED);
			Val4.setForeground(Color.RED);
			Val5.setForeground(Color.RED);
		} else {
			Val1.setForeground(Color.BLACK);
			Val2.setForeground(Color.BLACK);
			Val3.setForeground(Color.BLACK);
			Val4.setForeground(Color.BLACK);
			Val5.setForeground(Color.BLACK);
		}
		opOut.setText(String.format("%.2f", opDo));
		guideOut.setText(String.format("%.2f", guideDo));
		
		new_profit.setText(String.format("%.2f", profit));
		op_profit.setText(String.format("%.2f", profitOP));
		
		double x1Money = profit*x1/100;
		double x2Money = profit*x2/100;
		double x3Money = profit*x3/100;
		double x4Money = profit*x4/100;
		double x5Money = profit*x5/100;
		
		M1.setText(String.format("%.2f", x1Money));
		M2.setText(String.format("%.2f", x2Money));
		M3.setText(String.format("%.2f", x3Money));
		M4.setText(String.format("%.2f", x4Money));
		M5.setText(String.format("%.2f", x5Money));
		
		int quantity = Integer.parseInt(quantityVal.getText());
		
		double initSet = init*quantity;
		double sellSet = sell*quantity;
		double opSet = opDo*quantity;
		double guideSet = guideDo*quantity;
		double profitSet = profit*quantity;
		double x1Set = x1Money*quantity;
		double x2Set = x2Money*quantity;
		double x3Set = x3Money*quantity;
		double x4Set = x4Money*quantity;
		double x5Set = x5Money*quantity;
		init48.setText(String.format("%.2f", initSet));
		sell48.setText(String.format("%.2f", sellSet));
		op48.setText(String.format("%.2f", opSet));
		guide48.setText(String.format("%.2f", guideSet));
		profit48.setText(String.format("%.2f", profitSet));
		x148.setText(String.format("%.2f", x1Set));
		x248.setText(String.format("%.2f", x2Set));
		x348.setText(String.format("%.2f", x3Set));
		x448.setText(String.format("%.2f", x4Set));
		x548.setText(String.format("%.2f", x5Set));
		
		int n = Integer.parseInt(multi.getText());
		initMulti.setText(String.format("%.2f", initSet*n));
		sellMulti.setText(String.format("%.2f", sellSet*n));
		opMulti.setText(String.format("%.2f", opSet*n));
		guideMulti.setText(String.format("%.2f", guideSet*n));
		profitMulti.setText(String.format("%.2f", profitSet*n));
		Multi1.setText(String.format("%.2f", x1Set*n));
		Multi2.setText(String.format("%.2f", x2Set*n));
		Multi3.setText(String.format("%.2f", x3Set*n));
		Multi4.setText(String.format("%.2f", x4Set*n));
		Multi5.setText(String.format("%.2f", x5Set*n));
		
		int qtyV = quantity*n;
		qty.setText(String.format("%d", qtyV));
		
		int out1 = Integer.parseInt(outlet1.getText());
		int out2 = Integer.parseInt(outlet2.getText());
		int out3 = Integer.parseInt(outlet3.getText());
		int out4 = Integer.parseInt(outlet4.getText());
		int out5 = Integer.parseInt(outlet5.getText());
		int outTotal = out1+out2+out3+out4+out5;
		outletTotal.setText(String.format("%d", outTotal));
		
		if(outTotal != n) {
			outletTotal.setForeground(Color.RED);
		} else {
			outletTotal.setForeground(Color.BLACK);
		}
		
		int out1sale = Integer.parseInt(outlet1sale.getText()); 
		int out2sale = Integer.parseInt(outlet2sale.getText()); 
		int out3sale = Integer.parseInt(outlet3sale.getText()); 
		int out4sale = Integer.parseInt(outlet4sale.getText()); 
		int out5sale = Integer.parseInt(outlet5sale.getText()); 
		int outSaleTotal = out1sale+out2sale+out3sale+out4sale+out5sale;
		outletTotalSale.setText(String.format("%d", outSaleTotal));
		remainVal.setText(String.format("%d", outTotal - outSaleTotal));
		
		costRemain.setText(String.format("%.2f", initSet*(outTotal - outSaleTotal)));
		
		if(out1sale > out1) {
			outlet1sale.setForeground(Color.RED);
		} else {
			outlet1sale.setForeground(Color.BLACK);
		}
		if(out2sale > out2) {
			outlet2sale.setForeground(Color.RED);
		} else {
			outlet2sale.setForeground(Color.BLACK);
		}
		if(out3sale > out3) {
			outlet3sale.setForeground(Color.RED);
		} else {
			outlet3sale.setForeground(Color.BLACK);
		}
		if(out4sale > out4) {
			outlet4sale.setForeground(Color.RED);
		} else {
			outlet4sale.setForeground(Color.BLACK);
		}
		if(out5sale > out5) {
			outlet5sale.setForeground(Color.RED);
		} else {
			outlet5sale.setForeground(Color.BLACK);
		}
		if(outSaleTotal > outTotal) {
			outletTotalSale.setForeground(Color.RED);
			remainVal.setForeground(Color.RED);
		} else {
			outletTotalSale.setForeground(Color.BLACK);
			remainVal.setForeground(Color.BLACK);
		}
		
		initSale.setText(String.format("%.2f", initSet*outSaleTotal));
		sellSale.setText(String.format("%.2f", sellSet*outSaleTotal));
		opSale.setText(String.format("%.2f", opSet*outSaleTotal));
		guideSale.setText(String.format("%.2f", guideSet*outSaleTotal));
		profitSale.setText(String.format("%.2f", profitSet*outSaleTotal));
		Sale1.setText(String.format("%.2f", x1Set*outSaleTotal));
		Sale2.setText(String.format("%.2f", x2Set*outSaleTotal));
		Sale3.setText(String.format("%.2f", x3Set*outSaleTotal));
		Sale4.setText(String.format("%.2f", x4Set*outSaleTotal));
		Sale5.setText(String.format("%.2f", x5Set*outSaleTotal));
		
		modification = true;
	}
	
	void newFile() {
		//Ask user if really want to new file, once modification was made
		if(modification) {
			int confirmed = JOptionPane.showConfirmDialog(null, "New File?","New",JOptionPane.YES_NO_OPTION);
	        if(confirmed != JOptionPane.YES_OPTION)
	        {
	        	return;
	        }
		}
		
		//Reset everything, text field and image to default value
		textField_7.setText("<product name>");
		textField_5.setText("<product code>");
		textField_10.setText("");
		textField_6.setText("");
		textField_11.setText("");
		txtDdmmyyyy.setText("DD/MM/YYYY");
		textField_12.setText("DD/MM/YYYY");
		
		quantityVal.setText("0");
		
		initVal.setText("0");
		sellVal.setText("0");
		opVal.setText("0");
		guideVal.setText("0");
		
		Val1.setText("0");
		textField.setText("<company name>");
		Val2.setText("0");
		textField_1.setText("<company name>");
		Val3.setText("0");
		textField_2.setText("<company name>");
		Val4.setText("0");
		textField_3.setText("<company name>");
		Val5.setText("0");
		textField_4.setText("<company name>");
		
		multi.setText("0");
		
		outlet1.setText("0");
		outlet2.setText("0");
		outlet3.setText("0");
		outlet4.setText("0");
		outlet5.setText("0");
		
		outlet1sale.setText("0");
		outlet2sale.setText("0");
		outlet3sale.setText("0");
		outlet4sale.setText("0");
		outlet5sale.setText("0");
		
		imageVal.setIcon(null);
		
		//above is the modifiable values
		//below is the non-modifiable values
		qty.setText("0");
		outletTotal.setText("0");
		
		new_profit.setText("0.0");
		op_profit.setText("0.0");
		opOut.setText("0.0");
		guideOut.setText("0.0");
		M1.setText("0.0");
		M2.setText("0.0");
		M3.setText("0.0");
		M4.setText("0.0");
		M5.setText("0.0");
		init48.setText("0.0");
		sell48.setText("0.0");
		op48.setText("0.0");
		guide48.setText("0.0");
		profit48.setText("0.0");
		x148.setText("0.0");
		x248.setText("0.0");
		x348.setText("0.0");
		x448.setText("0.0");
		x548.setText("0.0");
		
		initSale.setText("0.0");
		sellSale.setText("0.0");
		opSale.setText("0.0");
		guideSale.setText("0.0");
		profitSale.setText("0.0");
		Sale1.setText("0.0");
		Sale2.setText("0.0");
		Sale3.setText("0.0");
		Sale4.setText("0.0");
		Sale5.setText("0.0");
		costRemain.setText("0.0");
		
		outletTotalSale.setText("0");
		remainVal.setText("0");
		
		Multi1.setText("0.0");
		Multi2.setText("0.0");
		Multi3.setText("0.0");
		Multi4.setText("0.0");
		Multi5.setText("0.0");
		
		initMulti.setText("0.0");
		sellMulti.setText("0.0");
		opMulti.setText("0.0");
		guideMulti.setText("0.0");
		profitMulti.setText("0.0");
		
		imagePath = "";
		filePath = "";
		modification = false;
	}
	
	void openFile() throws IOException {
		//load a file from the text, also calculate
		JFileChooser Filechoose=new JFileChooser();
		file = new File(filePath);
		Filechoose.setSelectedFile(file);
		 Filechoose.setFileFilter(new FileNameExtensionFilter("EK Grand save file (*.ek)", "ek"));
          int retval=Filechoose.showOpenDialog(null);
          if (retval == JFileChooser.APPROVE_OPTION) {
        	//set and record path of the file
        	filePath = Filechoose.getSelectedFile().getPath();
        	
        	String[] load = load(filePath);
        	
      		//for(int i = 0; i < load.length; i++) {
      	    //    load[i] = load[i].substring(load[i].indexOf("=")+1);
      	    //}
      		textField_7.setText(load[0]);
      		textField_5.setText(load[1]);
      		textField_10.setText(load[2]);
      		textField_6.setText(load[3]);
      		textField_11.setText(load[4]);
      		txtDdmmyyyy.setText(load[5]);
      		textField_12.setText(load[6]);
      		
      		quantityVal.setText(load[7]);
      		
      		imagePath = load[8];
              Image img = new ImageIcon(imagePath).getImage().getScaledInstance(imageVal.getWidth(), imageVal.getHeight(), Image.SCALE_DEFAULT);
              imageVal.setIcon(new ImageIcon(img));
      		
      		initVal.setText(load[9]);
      		sellVal.setText(load[10]);
      		opVal.setText(load[11]);
      		guideVal.setText(load[12]);
      		
      		textField.setText(load[13]);
      		Val1.setText(load[14]);
      		textField_1.setText(load[15]);
      		Val2.setText(load[16]);
      		textField_2.setText(load[17]);
      		Val3.setText(load[18]);
      		textField_3.setText(load[19]);
      		Val4.setText(load[20]);
      		textField_4.setText(load[21]);
      		Val5.setText(load[22]);
      		
      		
      		multi.setText(load[23]);
      		
      		outlet1.setText(load[24]);
      		outlet2.setText(load[25]);
      		outlet3.setText(load[26]);
      		outlet4.setText(load[27]);
      		outlet5.setText(load[28]);
      		
      		outlet1sale.setText(load[29]);
      		outlet2sale.setText(load[30]);
      		outlet3sale.setText(load[31]);
      		outlet4sale.setText(load[32]);
      		outlet5sale.setText(load[33]);
      		
      		
      		calculate();
      		
      		
      		
          }
		
		//set modified as not yet
          modification = false;
          
         // System.out.println(filePath);
	}
	
	static String[] load(String filepath) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filepath));
        
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("-split here-");
            line = br.readLine();
        }
        String[] everything = sb.toString().split("-split here-");
        
        
        br.close();
        
        return everything;
  
	}
	
	void saveFile() throws IOException {
		//if file not yet saved, run menu
		if(filePath.equals("")) {
			runSaveMenu();
		} else {
			//save a file in a text immediately
			String[] words = new String[34];
			words[0] = textField_7.getText();
			words[1] = textField_5.getText();
			words[2] = textField_10.getText();
			words[3] = textField_6.getText();
			words[4] = textField_11.getText();
			words[5] = txtDdmmyyyy.getText();
			words[6] = textField_12.getText();
      	
			words[7] = quantityVal.getText();
      		
			words[8] = imagePath;
      		
			words[9] = initVal.getText();
			words[10] = sellVal.getText();
			words[11] = opVal.getText();
			words[12] = guideVal.getText();
      		
			words[13] = textField.getText();
			words[14] = Val1.getText();
			words[15] = textField_1.getText();
			words[16] = Val2.getText();
			words[17] = textField_2.getText();
			words[18] = Val3.getText();
			words[19] = textField_3.getText();
			words[20] = Val4.getText();
			words[21] = textField_4.getText();
			words[22] = Val5.getText();
      		
			words[23] = multi.getText();
      		
			words[24] = outlet1.getText();
			words[25] = outlet2.getText();
			words[26] = outlet3.getText();
			words[27] = outlet4.getText();
			words[28] = outlet5.getText();
      		
			words[29] = outlet1sale.getText();
			words[30] = outlet2sale.getText();
			words[31] = outlet3sale.getText();
			words[32] = outlet4sale.getText();
			words[33] = outlet5sale.getText();
			
			save(words,filePath);
			file = new File(filePath);
		}
		
		modification = false;
		//set modified as not yet
	}
	
	void saveFileAs() throws IOException {
		//Run menu
		runSaveMenu();
		
		modification = false;
	}
	
	void runSaveMenu() throws IOException {
		JFileChooser Filechoose=new JFileChooser();
		file = new File(filePath);
		Filechoose.setSelectedFile(file);
		 Filechoose.setFileFilter(new FileNameExtensionFilter("EK Grand save file (*.ek)", "ek"));
          int retval=Filechoose.showSaveDialog(null);
          if (retval == JFileChooser.APPROVE_OPTION) {
              //... The user selected a file, get it, use it.
              File file = Filechoose.getSelectedFile();
              System.out.println(file.getPath());
              filePath = file.getPath();
              
              String[] words = new String[34];
  			words[0] = textField_7.getText();
  			words[1] = textField_5.getText();
  			words[2] = textField_10.getText();
  			words[3] = textField_6.getText();
  			words[4] = textField_11.getText();
  			words[5] = txtDdmmyyyy.getText();
  			words[6] = textField_12.getText();
        	
  			words[7] = quantityVal.getText();
        		
  			words[8] = imagePath;
        		
  			words[9] = initVal.getText();
  			words[10] = sellVal.getText();
  			words[11] = opVal.getText();
  			words[12] = guideVal.getText();
        		
  			words[13] = textField.getText();
  			words[14] = Val1.getText();
  			words[15] = textField_1.getText();
  			words[16] = Val2.getText();
  			words[17] = textField_2.getText();
  			words[18] = Val3.getText();
  			words[19] = textField_3.getText();
  			words[20] = Val4.getText();
  			words[21] = textField_4.getText();
  			words[22] = Val5.getText();
        		
  			words[23] = multi.getText();
        		
  			words[24] = outlet1.getText();
  			words[25] = outlet2.getText();
  			words[26] = outlet3.getText();
  			words[27] = outlet4.getText();
  			words[28] = outlet5.getText();
        		
  			words[29] = outlet1sale.getText();
  			words[30] = outlet2sale.getText();
  			words[31] = outlet3sale.getText();
  			words[32] = outlet4sale.getText();
  			words[33] = outlet5sale.getText();
  			
  			save(words,filePath);
  			file = new File(filePath);
          }
	}
	
	static void save(String[] words, String filepath) throws IOException {
		BufferedWriter writer = null;
		
            File file = new File(filepath);
            writer = new BufferedWriter(new FileWriter(file));
            for (String word: words) {
                writer.write(word);
                writer.newLine();
            }
      
            writer.close();
	}
	
	void exit() {
		//ask user if save modified (also for X button as well)
		if(modification) {
			int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","Exit",JOptionPane.YES_NO_OPTION);
	        if(confirmed != JOptionPane.YES_OPTION)
	        {
	        	return;
	        }
		}
		
		//exit
		System.exit(0);
	}
	
	void loadImage() {
		JFileChooser Filechoose=new JFileChooser();
		 Filechoose.setFileFilter(new FileNameExtensionFilter("Images (*.jpg, *.png, *.gif, *.bmp)", "jpg", "png", "gif", "bmp"));
           int retval=Filechoose.showOpenDialog(null);
           if (retval == JFileChooser.APPROVE_OPTION) {
               //... The user selected a file, get it, use it.
               File file = Filechoose.getSelectedFile();
               //System.out.println(file.getPath());
               imagePath = file.getPath();
               Image img = new ImageIcon(imagePath).getImage().getScaledInstance(imageVal.getWidth(), imageVal.getHeight(), Image.SCALE_DEFAULT);
               imageVal.setIcon(new ImageIcon(img));
           }
	}
}
