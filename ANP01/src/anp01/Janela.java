package anp01;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private JComboBox<String> comboBox;
	private JTextArea textArea;
	private String textoTotal;

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
		setBounds(100, 100, 470, 307);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("PRONOME:");
		lblNewLabel.setForeground(SystemColor.textText);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(21, 65, 67, 19);
		contentPane.add(lblNewLabel);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setForeground(SystemColor.textText);
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(85, 63, 130, 23);
		comboBox.addItem("Sr.");
		comboBox.addItem("Sra.");
		comboBox.addItem("Srta.");
		comboBox.addItem("V.S.a.");
		contentPane.add(comboBox);

		texto1 = new JTextField();
		texto1.setBounds(21, 34, 130, 23);
		contentPane.add(texto1);
		texto1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setForeground(SystemColor.textText);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(21, 11, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setForeground(SystemColor.textText);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(161, 11, 46, 14);
		contentPane.add(lblNewLabel_2);

		texto2 = new JTextField();
		texto2.setBounds(161, 34, 151, 23);
		contentPane.add(texto2);
		texto2.setColumns(10);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(UIManager.getColor("TextArea.inactiveBackground"));
		textArea_1.setBounds(21, 100, 403, 139);
		contentPane.add(textArea_1);

		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setForeground(SystemColor.textText);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome= texto1.getText();
				String cpf= texto2.getText();
				if (nome.isEmpty() || cpf.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "Todos os campos devem estar preenchidos");
				}
				texto1.setText("");
				texto2.setText("");
				String valorSelecionado= (String) comboBox.getSelectedItem();
				if (textoTotal== null) {
					textoTotal= valorSelecionado+ " " +nome+ " tem como CPF: " +cpf+ "\n";
				} else{
					textoTotal= textoTotal+ valorSelecionado +nome+ " tem como CPF: " +cpf+ "\n";
				}
				textArea_1.setText(textoTotal);
			}
		});
		btnNewButton.setBounds(225, 63, 121, 23);
		contentPane.add(btnNewButton);
	}
}