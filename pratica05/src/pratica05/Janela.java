package pratica05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Janela extends JFrame {

	private JPanel contentPane;
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
		setBounds(100, 100, 438, 237);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(74, 28, 148, 22);
		comboBox.addItem("Amapa");
		comboBox.addItem("Santa Catarina");
		comboBox.addItem("Amazonas");
		comboBox.addItem("Rio de Janeiro");
		contentPane.add(comboBox);

		JLabel lblNewLabel = new JLabel("OPÇÕES:");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(44, 44, 44));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 32, 71, 14);
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 400, 100);
		contentPane.add(scrollPane);
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setForeground(new Color(44, 44, 44));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valorSelecionado= (String) comboBox.getSelectedItem();
				if (textoTotal== null) {
					textoTotal= valorSelecionado;
				} else{
				textoTotal= textoTotal+ ", "+ valorSelecionado;
				}
			textArea_1.setText(textoTotal);
			}
		});
		btnNewButton.setBounds(232, 28, 125, 23);
		contentPane.add(btnNewButton);

	}
}