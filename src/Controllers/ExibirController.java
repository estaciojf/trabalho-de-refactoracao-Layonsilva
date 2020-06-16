package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.LivroDAO;
import Listeners.TableLivroListener;
import Models.Livro;

public class ExibirController implements ActionListener {
	
	/**
	 * Remoção da private JTable que não estava sendo utilizada.
	 */
	
	public String column[]={"Terror", "Ficção", "Drama", "Aventura", "Comédia", "Técnico"};  
	DefaultTableModel model;

	public ExibirController(JTable table) throws SQLException {
		this.model = (DefaultTableModel) table.getModel();
		this.setTableColumns();
		this.getLivros();
		
		TableLivroListener tableListener = new TableLivroListener(table);
		
		table.getModel().addTableModelListener(tableListener);
	}
	
	private void setTableColumns() {
		for (String columnName : this.column) {
			model.addColumn(columnName);
		}
	}
	
	public String getLivros() {
		
		this.model.setRowCount(0);
		
		try {
			LivroDAO livroDao = new LivroDAO();
			List<Livro> list = livroDao.getAllLivros();
			
			for (Livro livro : list) {
				model.addRow(new Object[] {
						livro.getTitle(),
						livro.getAuthor(),
						livro.getGender(),
						livro.getYear(),
						livro.isRead()
				});
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		this.getLivros();
		
	}
}


