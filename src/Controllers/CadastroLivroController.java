package Controllers;

/**
 * Importações não utilizadas foram removidas.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Models.Livro;

public class CadastroLivroController implements ActionListener {

	/**
	 * Nomes de variáveis trocadas para a facilitar o entendimento.
	 */
	
	private JTextField titulo;
	private JTextField autor;
	private JComboBox genero;
	private JComboBox ano;
	private JCheckBox foiLido;
	private List<Livro> listaLivros;
	
	public CadastroLivroController( JTextField titulo, JTextField autor, JComboBox genero, JComboBox ano, JCheckBox foiLido) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.foiLido = foiLido;
		
		listaLivros = new ArrayList<>();
		
		this.populateComboYear(ano);
		this.populateComboGener(genero);
	}
	
	private void populateComboYear(JComboBox comboYear) {
		this.ano = comboYear;
		
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR); 
		
		for (int yearLoop = anoAtual ; yearLoop >= 1900 ; yearLoop --) {
			this.ano.addItem(yearLoop);
		}
	}
	
	private void populateComboGener(JComboBox comboGender) {
		this.genero = comboGender;
		String[] genders = new String[] { "Terror", "Ficção", "Drama", "Aventura", "Comédia", "Técnico" };
		for (String genderLoop : genders) {
			this.genero.addItem(genderLoop);
		}
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		System.out.println(event.getActionCommand());
		this.cadastrarLivro();
	}
	
	public void cadastrarLivro() {
		
		Livro livro = new Livro(
				this.titulo.getText(), 
				this.autor.getText(),
				this.genero.getSelectedItem().toString(),
				Integer.parseInt(this.ano.getSelectedItem().toString()),
				this.foiLido.isSelected()
				);
		
		listaLivros.add(livro);
		
		for (int i = 0 ; i < listaLivros.size() ; i ++ ) {
			System.out.println(listaLivros.get(i).toString());
		}
		
	}

}
