package gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import negocio.Servidor;
import negocio.beans.Administrador;
import negocio.beans.Cliente;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


public class Gui extends Application 
{
	public void start(Stage primeiroPalco) 
	{
		Servidor netflix = Servidor.getInstance();
		try 
		{
			
			BorderPane primeiroPane = new BorderPane();
			Scene primeiraCena = new Scene(primeiroPane,1300, 600);
			
			
			
			BackgroundImage myBI= new BackgroundImage(new Image("https://www.dailypioneer.com/uploads/2018/story/"
					+ "images/big/netflix-announces-eight-new-indian-original-films-2018-11-09.jpg",1200,700,false,false),
			        BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
			          BackgroundSize.DEFAULT);
			primeiroPane.setBackground(new Background(myBI));
			
			
			Button primeiroEntrar = new Button("Entrar");
			
			primeiroPane.setBottom(primeiroEntrar);
			
			
			//Inicio
			primeiroEntrar.setOnAction(e -> 
			{
				Stage palcoLogin = new Stage();
				//BorderPane paneLogin = new BorderPane();
				GridPane paneLoginAux = new GridPane();
				Scene cenaLogin = new Scene(paneLoginAux, 200, 300);
				
				Text emailLogin = new Text("Email:");
				Text senhaLogin = new Text("Senha:");
				Text avisoNaoCads = new Text("");
				
				Text nomeCad = new Text("Nome:");
				Text emailCad = new Text("Email:");
				Text senhaCad = new Text("Senha:");
				Hyperlink mensNovoCad = new Hyperlink("Cadastre-se!");
				Text mensSucesso = new Text("Pressione Ok para continuar...");
				
				Button entrar = new Button("Entrar");
				Button cadastrar = new Button("Ok");
				
				TextField tEmailLogin = new TextField();
				PasswordField tSenhaLogin = new PasswordField();
				TextField tNomeCads = new TextField();
				TextField tEmailCads = new TextField();
				PasswordField tSenhaCads = new PasswordField();
				

				paneLoginAux.add(emailLogin, 0,0);
				paneLoginAux.add(tEmailLogin, 1, 0);
				paneLoginAux.add(senhaLogin, 0, 1);
				paneLoginAux.add(tSenhaLogin, 1, 1);
				paneLoginAux.add(entrar, 1, 2);
				paneLoginAux.add(avisoNaoCads, 1, 3);
				paneLoginAux.add(mensNovoCad, 1, 4);
				
				
				
				
				//Login
				entrar.setOnAction(w -> {
				
					try
					{
						
						
						Administrador loginAdm = netflix.buscarAdministradorSenha(tEmailLogin.getText(), tSenhaLogin.getText());
						Cliente loginCliente = netflix.buscarClienteSenha(tEmailLogin.getText(), tSenhaLogin.getText());
						
						//Area login cliente
						if(loginCliente != null)
						{
							
						}
						
						//Area Login Adm
						else if(loginAdm != null)
						{
							
						}
						
						else 
						{
							avisoNaoCads.setText("Aviso! Usuário não cadastrado!");
						}
					}
					catch (Exception a) 
					{
					}
					
				});
				
				
				//Cadastro
				mensNovoCad.setOnAction(a -> {
					
					paneLoginAux.add(nomeCad, 0, 5);
					paneLoginAux.add(tNomeCads, 1, 5);
					paneLoginAux.add(emailCad, 0, 6);
					paneLoginAux.add(tEmailCads, 1, 6);
					paneLoginAux.add(senhaCad, 0, 7);
					paneLoginAux.add(tSenhaCads, 1, 7);
					paneLoginAux.add(cadastrar, 1, 9);
					
					
					
					cadastrar.setOnAction(w -> {
						
						try
						{
							
						}
						catch (Exception x) 
						{
						}
						
					});
					
				});
				
				palcoLogin.setScene(cenaLogin);
				palcoLogin.show();
				
			});
			
			primeiroPalco.setOnCloseRequest(new EventHandler<WindowEvent>() {
			    @Override
			    public void handle(WindowEvent t) {
			        Platform.exit();
			        System.exit(0);
			    }
			});
			
			
			primeiroPalco.setTitle("Netflix");
			primeiroPalco.setScene(primeiraCena);
			primeiroPalco.show();
		} 
		catch(Exception e) 
		{
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}


