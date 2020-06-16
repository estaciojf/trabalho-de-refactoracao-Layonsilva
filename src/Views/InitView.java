package Views;

/**
 * Importações não utilizadas foram removidas.
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.IniitController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class InitView extends JFrame {

	/**
	 * Nomes de variáveis trocadas para a facilitar o entendimento.
	 */
	
	private CadastroLivroView cadastroView;

	private JPanel painel;

	/**
	 * Iniciação da aplicação.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitView frame = new InitView();
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
	public InitView() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		painel.setLayout(null);
		
		JLabel novoTitulo = new JLabel("Meus Livros");
		novoTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		novoTitulo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		novoTitulo.setBounds(6, 73, 438, 16);
		painel.add(novoTitulo);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(39, 183, 117, 29);
		painel.add(btnExibir);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(264, 183, 117, 29);
		painel.add(btnCadastrar);
		
		IniitController handle = new IniitController(cadastroView);

		handle.abrirExibirView();
		
		btnCadastrar.addActionListener(handle);
		btnExibir.addActionListener(handle);
	}
	
}
