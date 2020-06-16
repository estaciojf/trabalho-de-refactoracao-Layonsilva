package Views;
/**
 * Importações não utilizadas foram removidas.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.ExibirController;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Image;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ExibirView extends JFrame {

	/**
	 * Nomes de variáveis trocadas para a facilitar o entendimento.
	 */
	
	private JPanel painel;
	private JTextField texto;
	private JTable tabela;

	/**
	 * Iniciação da aplicação.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExibirView frame = new ExibirView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Criação do frame.
	 */
	public ExibirView() {
		setTitle("Exibir");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		painel.setLayout(new BorderLayout(0, 0));
		setContentPane(painel);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		painel.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Buscar Livro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		
		texto = new JTextField();
		panel.add(texto);
		texto.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		panel.add(btnBuscar);
		
		JButton btnRefresh = new JButton("");
		

		panel.add(btnRefresh);
		
		ImageIcon iconButton = new ImageIcon("/Users/leandrosimoes/Desktop/refresh_icon.png");
		Image imageIcon = iconButton.getImage();
		Image imageButton = imageIcon.getScaledInstance(12, 12, java.awt.Image.SCALE_SMOOTH);
		
		btnRefresh.setIcon(new ImageIcon(imageButton));
		
		JScrollPane scrollPane = new JScrollPane();
		painel.add(scrollPane, BorderLayout.CENTER);
		tabela = new JTable();

		/**
		 *  O handler foi removido, mas as tarefas foram mantidas.
		 */
				
		try {
			new ExibirController(tabela);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		scrollPane.setViewportView(tabela);
	}

}
