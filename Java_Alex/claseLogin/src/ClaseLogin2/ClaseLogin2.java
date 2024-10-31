package ClaseLogin2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClaseLogin2 {
    private JFrame login;
    private JTextField usuarioField;
    private JPasswordField passwordField;

    public ClaseLogin2() {
        inicializarVentana();
        inicializarComponentes();
        login.setVisible(true);
    }
    
    private void inicializarVentana() {
        login = new JFrame("Formulario de Login");
        login.setSize(400, 250); // Ajuste del tamaño de la ventana
        login.setLocationRelativeTo(null); // Centrar la ventana
        login.setLayout(new GridBagLayout()); // Usar GridBagLayout para mayor control de diseño
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Añadir espaciado entre componentes

        JLabel titulo = new JLabel("Inicio de Sesión", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        login.add(titulo, gbc);

        JLabel lUsuario = new JLabel("Usuario:");
        usuarioField = new JTextField(15);
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        login.add(lUsuario, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Expandir el campo de usuario
        login.add(usuarioField, gbc);

        JLabel lPassword = new JLabel("Contraseña:");
        passwordField = new JPasswordField(15); // Añadir JPasswordField para la contraseña
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        login.add(lPassword, gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Expandir el campo de contraseña
        login.add(passwordField, gbc);

        JButton accederBtn = new JButton("Acceder");
        accederBtn.setPreferredSize(new Dimension(100, 30));
        accederBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarDatos();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        login.add(accederBtn, gbc);
    }

    protected void validarDatos() {
        String usuario = usuarioField.getText();
        String password = new String(passwordField.getPassword());
        // TODO: Implementar la validación del usuario y contraseña
        System.out.println("Validando datos para el usuario: " + usuario);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClaseLogin2();
            }
        });
    }
}
