package pratica01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField texto2;
	private JTextField texto1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("N\u00FAmero 2:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(184, 28, 86, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 1:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(65, 28, 86, 14);
		contentPane.add(lblNewLabel_1);

		texto2 = new JTextField();
		texto2.setBounds(65, 45, 86, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);

		texto1 = new JTextField();
		texto1.setBounds(184, 45, 86, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = texto2.getText();
				String n2 = texto1.getText();
				Float num1 = Float.valueOf(n1);
				Float num2 = Float.valueOf(n2);
				Float soma = num1 + num2;
				JOptionPane.showMessageDialog(null, "SOMA: "+soma);
			}
		});
		btnNewButton.setBounds(65, 76, 86, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("x");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1= texto2.getText();
				String n2= texto1.getText();
				Float num1= Float.valueOf(n1);
				Float num2= Float.valueOf(n2);
				Float multiplicacao= num1 * num2;
				JOptionPane.showMessageDialog(null, "MULTIPLICACAO: "+multiplicacao);
			}
		});
		btnNewButton_1.setBounds(65, 110, 86, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1= texto2.getText();
				String n2= texto1.getText();
				Float num1= Float.valueOf(n1);
				Float num2= Float.valueOf(n2);
				Float subtracao= num1 - num2;
				JOptionPane.showMessageDialog(null, "SUBTRACAO: "+subtracao);
			}
		});
		btnNewButton_2.setBounds(184, 76, 86, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u00F7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1= texto2.getText();
				String n2= texto1.getText();
				Float num1= Float.valueOf(n1);
				Float num2= Float.valueOf(n2);
				Float divisao= num1 / num2;
				JOptionPane.showMessageDialog(null, "DIVISAO: "+divisao);
			}
		});
		btnNewButton_3.setBounds(184, 110, 86, 23);
		contentPane.add(btnNewButton_3);
	}

}