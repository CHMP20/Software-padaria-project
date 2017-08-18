package interfaceGrafica;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class TelaMenuPrincipalFuncionarioLayoutController {

	@FXML
	public void onActionLogout() {
		MainFuncionarioTest.logado = null;
		MainFuncionarioTest.setCenaAnterior();
	}

	@FXML
	public void onActionVender() {
		
		Parent root = null;
		
		try {
			root = FXMLLoader.load( getClass().getResource("TelaVendaFuncionarioLayout.fxml") );			
		} catch ( IOException ioe ) {
			System.out.println("Problema para carregar arquivo TelaVendaFuncionarioLayout");
			System.exit(1);
		}
		
		
		
		Scene scene = new Scene(root, 600, 400);
		
		MainFuncionarioTest.setCenaAtual(scene);
		MainFuncionarioTest.setTituloAtualPalco("Venda | Funcionário: " + MainFuncionarioTest.logado.getNome());
	}

	@FXML
	public void onActionCliente() {
		
		Parent root = null;
		
		try {
			root = FXMLLoader.load( getClass().getResource("TelaClienteFuncionarioLayout.fxml") );			
		} catch ( IOException ioe ) {
			System.out.println("Problema para carregar arquivo ClienteFuncionarioLayout");
			ioe.printStackTrace();
			System.out.println("Problema para carregar arquivo TelaClienteFuncionarioLayout");
			ioe.printStackTrace();
			System.exit(1);
		}
		
		Scene scene = new Scene(root, 600, 400);
		
		MainFuncionarioTest.setCenaAtual(scene);
		MainFuncionarioTest.setTituloAtualPalco("Cliente | Funcionário: " + MainFuncionarioTest.logado.getNome());
	}

	@FXML
	public void onActionEstoque() {
		
		Parent root = null;
		
		try {
			root = FXMLLoader.load( getClass().getResource("TelaEstoqueFuncionarioLayout.fxml") );			
		} catch ( IOException ioe ) {
			System.out.println("Problema para carregar arquivo EstoqueFuncionarioLayout");
			System.out.println("Problema para carregar arquivo TelaEstoqueFuncionarioLayout");
			ioe.printStackTrace();
			System.exit(1);
		}
		
		
		Scene scene = new Scene(root, 600, 400);
		
		MainFuncionarioTest.setCenaAtual(scene);
		MainFuncionarioTest.setTituloAtualPalco("Estoque | Funcionário: " + MainFuncionarioTest.logado.getNome());
	}
	

}
