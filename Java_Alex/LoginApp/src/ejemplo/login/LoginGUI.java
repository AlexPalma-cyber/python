package ejemplo.login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginGUI {
    public static void main(String[] args) {
        // Crear el marco principal (JFrame)
        JFrame frame = new JFrame("Login");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Usamos diseño absoluto

        // Etiquetas para usuario y contraseña
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(50, 30, 80, 25);
        frame.add(userLabel);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 70, 80, 25);
        frame.add(passwordLabel);

        // Campos de texto para usuario y contraseña
        JTextField userText = new JTextField();
        userText.setBounds(150, 30, 150, 25);
        frame.add(userText);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(150, 70, 150, 25);
        frame.add(passwordText);

        // Botón de login
        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(125, 110, 120, 25);
        frame.add(loginButton);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}

