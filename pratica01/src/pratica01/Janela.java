package pratica01;
/**KAILLANE STEFANI DOS SANTOS PALHUCH   27/10/2022**/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;

	
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
		setBounds(100, 100, 400, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto1 = new JTextField();
		texto1.setBounds(61, 65, 108, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setBounds(208, 65, 108, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Número 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 45, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(208, 45, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSoma = new JButton("SOMA");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = texto1.getText();
				String n2 = texto2.getText();
				Integer num1 = Integer.valueOf(n1);
				Integer num2 = Integer.valueOf(n2);
				Integer soma = num1 + num2;
				JOptionPane.showInternalMessageDialog(null,"SOMA: "+soma);
			}
		});
		btnSoma.setBounds(139, 107, 108, 23);
		contentPane.add(btnSoma);
	}
}
