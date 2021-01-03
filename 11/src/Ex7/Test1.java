package Ex7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;

import java.util.UUID;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextPane;

public class Test1 {

	private JFrame frmProtonRegistry;
	private JTextField Salary;
	private JTextField txtInt;
	private JTextField loanPer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 window = new Test1();
					window.frmProtonRegistry.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProtonRegistry = new JFrame();
		frmProtonRegistry.setTitle("Proton Registry");
		frmProtonRegistry.setBounds(100, 100, 933, 554);
		frmProtonRegistry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProtonRegistry.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 897, 500);
		frmProtonRegistry.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Info", null, panel, null);
		panel.setLayout(null);
		
		JLabel price = new JLabel("Price :");
		price.setBounds(361, 336, 506, 20);
		panel.add(price);
		price.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel carmod = new JLabel("Car");
		carmod.setBounds(50, 442, 256, 14);
		panel.add(carmod);
		carmod.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(46, 0, 205, 179);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Test1.class.getResource("/a2/200px-PROTON_Holdings_logo_(2019\u2013present).png")));
		
		JLabel pic = new JLabel("");
		pic.setBounds(0, 175, 351, 256);
		panel.add(pic);
		pic.setHorizontalAlignment(SwingConstants.CENTER);
		pic.setIcon(new ImageIcon(Test1.class.getResource("/a2/SaGA-256x256.jpg")));
		
		JLabel Sallabel = new JLabel("Salary");
		Sallabel.setBounds(261, 18, 63, 29);
		panel.add(Sallabel);
		Sallabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel modlabel = new JLabel("Model");
		modlabel.setBounds(261, 58, 71, 20);
		panel.add(modlabel);
		modlabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel aftSal = new JLabel("Salary After Monthly Payment :");
		aftSal.setBounds(532, 18, 360, 29);
		panel.add(aftSal);
		aftSal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_4 = new JLabel("Features");
		lblNewLabel_4.setBounds(361, 195, 122, 19);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel intRate = new JLabel("Interest Rate");
		intRate.setBounds(261, 88, 210, 20);
		panel.add(intRate);
		intRate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_6 = new JLabel("Loan Period");
		lblNewLabel_6.setBounds(261, 119, 205, 19);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setToolTipText("in Years");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel totInt = new JLabel("Total Interest :");
		totInt.setBounds(361, 367, 485, 14);
		panel.add(totInt);
		totInt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel monInt = new JLabel("Monthly Interest :");
		monInt.setBounds(361, 392, 485, 14);
		panel.add(monInt);
		monInt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel monIns = new JLabel("Monthly Installment :");
		monIns.setBounds(361, 417, 485, 14);
		panel.add(monIns);
		monIns.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		Salary = new JTextField();
		Salary.setBounds(326, 25, 180, 20);
		panel.add(Salary);
		Salary.setToolTipText("in myr");
		Salary.setColumns(10);
		
		txtInt = new JTextField();
		txtInt.setBounds(377, 91, 210, 20);
		panel.add(txtInt);
		txtInt.setToolTipText("in percent");
		txtInt.setColumns(10);
		
		loanPer = new JTextField();
		loanPer.setBounds(377, 119, 210, 20);
		panel.add(loanPer);
		loanPer.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(326, 58, 180, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Saga", "X50", "X70"}));
		comboBox.setMaximumRowCount(3);
		
		JLabel tranLabel = new JLabel("Transmission :");
		tranLabel.setBounds(361, 225, 485, 29);
		panel.add(tranLabel);
		tranLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel tyreLabel = new JLabel("Tyres :");
		tyreLabel.setBounds(361, 252, 485, 29);
		panel.add(tyreLabel);
		tyreLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel colorLabel = new JLabel("Color :\r\n");
		colorLabel.setBounds(361, 278, 485, 29);
		panel.add(colorLabel);
		colorLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel apLabel = new JLabel("Autopark :");
		apLabel.setBounds(361, 306, 485, 29);
		panel.add(apLabel);
		apLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBounds(597, 84, 256, 55);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(comboBox.getSelectedItem()=="Saga") {
						Finance fn=new Finance(39800.00,Double.parseDouble(txtInt.getText()),Double.parseDouble(loanPer.getText()));
						double[] inter=fn.LoanInter();
						String[] s=fn.tostring(inter);
						totInt.setText("Total Interest     : "+s[0]);
						monInt.setText("Monthly Interest   : "+s[1]);
						monIns.setText("Monthly Installment: "+s[2]);
						String a=String.valueOf(fn.afterpay(Double.parseDouble(Salary.getText()),Double.parseDouble(s[2])));
						aftSal.setText("Salary After Monthly Payment :"+a);
						carmod.setText("Model : Proton Saga");
						tranLabel.setText("Transmission :5 speed Manual And 4 speed Auto ");
						tyreLabel.setText("Tyre : Dunlop 16 inch");
						colorLabel.setText("Color : Solid/Metallic Red,Blue,Silver,White,Yellow");
						apLabel.setText("AutoPark : Not Available");
						pic.setIcon(new ImageIcon(Test1.class.getResource("/a2/SaGA-256x256.jpg")));
						price.setText("Price : RM 39800");
					}
					if(comboBox.getSelectedItem()=="X50") {
						Finance fn=new Finance(79200.00,Double.parseDouble(txtInt.getText()),Double.parseDouble(loanPer.getText()));
						double[] inter=fn.LoanInter();
						String[] s=fn.tostring(inter);
						totInt.setText("Total Interest     : "+s[0]);
						monInt.setText("Monthly Interest   : "+s[1]);
						monIns.setText("Monthly Installment: "+s[2]);
						String a=String.valueOf(fn.afterpay(Double.parseDouble(Salary.getText()),Double.parseDouble(s[2])));
						aftSal.setText("Salary After Monthly Payment :"+a);
						carmod.setText("Model : Proton X50");
						tranLabel.setText("Transmission : 7 speed Auto");
						tyreLabel.setText("Tyre : GoodYear 17 inch");
						colorLabel.setText("Color : Solid/Metallic Red,Blue,Bronze,Silver,White");
						apLabel.setText("AutoPark : Available");
						pic.setIcon(new ImageIcon(Test1.class.getResource("/a2/x50 (2).jpg")));
						price.setText("Price : RM 79200.00");
					}
					if(comboBox.getSelectedItem()=="X70") {
						Finance fn=new Finance(94800.00,Double.parseDouble(txtInt.getText()),Double.parseDouble(loanPer.getText()));
						double[] inter=fn.LoanInter();
						String[] s=fn.tostring(inter);
						totInt.setText("Total Interest     : "+s[0]);
						monInt.setText("Monthly Interest   : "+s[1]);
						monIns.setText("Monthly Installment: "+s[2]);
						String a=String.valueOf(fn.afterpay(Double.parseDouble(Salary.getText()),Double.parseDouble(s[2])));
						aftSal.setText("Salary After Monthly Payment :"+a);
						carmod.setText("Model : Proton X70");
						tranLabel.setText("Transmission : 7 speed Auto");
						tyreLabel.setText("Tyre : GoodYear 17 inch");
						colorLabel.setText("Color : Solid/Metallic Red,Blue,Silver,White");
						apLabel.setText("AutoPark : Available");
						pic.setIcon(new ImageIcon(Test1.class.getResource("/a2/x70.jpeg")));
						price.setText("Price : RM 94800.00");
						
					
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the Correct Value");
				}
			}
		});
	}
}
