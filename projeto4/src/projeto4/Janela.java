package projeto4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField textonome;
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
		setBounds(100, 100, 267, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 26, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota1:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(39, 51, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota2:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(39, 76, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota3:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(39, 101, 67, 14);
		contentPane.add(lblNewLabel_3);
		
		textonome = new JTextField();
		textonome.setBounds(105, 23, 86, 20);
		contentPane.add(textonome);
		textonome.setColumns(10);
		
		texto1 = new JTextField();
		texto1.setBounds(105, 48, 86, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setBounds(105, 76, 86, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		texto3 = new JTextField();
		texto3.setBounds(105, 101, 86, 20);
		contentPane.add(texto3);
		texto3.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular media");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=textonome.getText();
				String num1=texto1.getText();
				String num2=texto2.getText();
				String num3=texto3.getText();
				if(!num1.isEmpty() && !num2.isEmpty() && !num3.isEmpty()) {
				Float n1=Float.valueOf(num1);
				Float n2=Float.valueOf(num2);
				Float n3=Float.valueOf(num3);	
				Float media= (n1+n2+n3)/3;
				JOptionPane.showInternalMessageDialog(null,"A media do aluno "+nome+" é: "+media);
			}
		}
		});
		btnNewButton.setBounds(49, 132, 143, 20);
		contentPane.add(btnNewButton);
	}

}