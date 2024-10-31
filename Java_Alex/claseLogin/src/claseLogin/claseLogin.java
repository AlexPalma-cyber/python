package claseLogin;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class claseLogin {
		JFrame login;
		public claseLogin() {
	        login = new JFrame();
	        login.setTitle("Formulario de Login");
	        login.setBounds (200, 100, 500, 300);
	
	        login.setLayout(new GridLayout(4,2));
	
	        JLabel titulo = new JLabel("Autenticacion", JLabel.CENTER);
	        login.add(titulo);
	        JLabel lUsuario  = new JLabel("Usuario: ");
	        JTextField TUsuario  = new JTextField(10); 
	
	        JButton bacceder  = new JButton("Acceder");
	        bacceder.addActionListener(new ActionListener() {
	        	@Override //sobreescrito...abstracta
	        	public void actionPerformed(ActionEvent e) {
	        		validarDatos();
	        	}
	        });
	        	
	        
	        login.add(lUsuario);
	        login.add(TUsuario);
	        login.add(bacceder);
	        login.setVisible(true);
		}
    
    protected void validarDatos() {
			// TODO Auto-generated method stub
			
		}

	public static void main(String[] args){
        new claseLogin();
    }
}