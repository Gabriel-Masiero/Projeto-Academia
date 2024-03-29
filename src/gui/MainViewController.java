package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemAlunos;
	
	@FXML
	private MenuItem menuItemUsuarios;
	
	@FXML
	private MenuItem menuItemTreinos;
	
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemAlunosAction() {
		System.out.println("Alunos");
	}
	
	@FXML
	public void onMenuItemUsuariosAction() {
		System.out.println("Usuários");
	}
	
	@FXML
	public void onMenuItemTreinosAction() {
		System.out.println("Treinos");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("Sobre");
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
