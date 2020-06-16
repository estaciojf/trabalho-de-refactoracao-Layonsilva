package Views;
/**
 * Importações não utilizadas foram removidas.
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.CadastroLivroController;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroLivroView extends JFrame {
	
	/**
	 * Nomes de variáveis trocadas para a facilitar o entendimento.
	 */
	
	private JPanel contentPane;
	private JTextField espacoTitulo;
	private JTextField espacoAutor;

	/**
	 * Iniciação da aplicação.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLivroView frame = new CadastroLivroView();
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
	public CadastroLivroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(28, 76, 61, 16);
		contentPane.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(28, 140, 61, 16);
		contentPane.add(lblAutor);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(266, 76, 61, 16);
		contentPane.add(lblGenero);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(266, 140, 61, 16);
		contentPane.add(lblAno);
		
		JCheckBox livroLido = new JCheckBox("Ja leu?");
		livroLido.setBounds(28, 204, 128, 23);
		contentPane.add(livroLido);
		
		espacoTitulo = new JTextField();
		espacoTitulo.setBounds(78, 71, 130, 26);
		contentPane.add(espacoTitulo);
		espacoTitulo.setColumns(10);
		
		espacoAutor = new JTextField();
		espacoAutor.setBounds(78, 135, 130, 26);
		contentPane.add(espacoAutor);
		espacoAutor.setColumns(10);
		
		JComboBox cbbGenero = new JComboBox();
		cbbGenero.setBounds(321, 72, 106, 27);
		contentPane.add(cbbGenero);
		
		JComboBox cbbAno = new JComboBox();
		cbbAno.setBounds(321, 136, 106, 27);
		contentPane.add(cbbAno);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(270, 215, 117, 29);
		contentPane.add(btnCadastrar);
		
		
		CadastroLivroController handle = new CadastroLivroController(espacoTitulo, espacoAutor, cbbGenero, cbbAno, livroLido);
		btnCadastrar.addActionListener(handle);
		
		
	}
}
