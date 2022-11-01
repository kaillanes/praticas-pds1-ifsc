package atv2;

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

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;

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
		setBounds(100, 100, 248, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lado 1:");
		lblNewLabel.setBounds(31, 35, 71, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lado 2:");
		lblNewLabel_1.setBounds(31, 60, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lado 3:");
		lblNewLabel_2.setBounds(31, 85, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		texto1 = new JTextField();
		texto1.setBounds(99, 32, 86, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setBounds(99, 57, 86, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		texto3 = new JTextField();
		texto3.setBounds(99, 82, 86, 20);
		contentPane.add(texto3);
		texto3.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1= texto1.getText();	
				String num2= texto2.getText();	
				String num3= texto3.getText();
				Integer n1= Integer.valueOf(num1);
				Integer n2= Integer.valueOf(num2);
				Integer n3= Integer.valueOf(num3);
				if((n1==n2) && (n1==n3)){
					JOptionPane.showMessageDialog(null,"O triangulo é equilatero");
				}else if((n1!=n2) && (n1!=n3)){
					JOptionPane.showMessageDialog(null,"O triangulo é escaleno");
				}else {
					JOptionPane.showMessageDialog(null,"O triangulo é isosceles");
			}
		}
		});
		btnNewButton.setBounds(96, 121, 89, 23);
		contentPane.add(btnNewButton);
	}
}
