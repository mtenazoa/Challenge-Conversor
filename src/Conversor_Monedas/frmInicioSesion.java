package Conversor_Monedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;

public class frmInicioSesion extends JFrame {

	private JPanel contentPane;
	private final JLabel lblUsuario = new JLabel("Usuario");
	private JTextField txtUsuario;
	private JPasswordField jpassClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmInicioSesion frame = new frmInicioSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmInicioSesion() {
		setTitle("Inicio de Sesión");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 204);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuario.setBounds(66, 11, 98, 31);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContraseña.setBounds(66, 50, 98, 14);
		contentPane.add(lblContraseña);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(208, 16, 119, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] clave = jpassClave.getPassword();
				String claveFinal = new String(clave);
				
				if(txtUsuario.getText().equals("invitado") && claveFinal.equals("123456")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bievenido al Sistema", "INFORMACION",  JOptionPane.INFORMATION_MESSAGE);
					
					frmMenu menu = new frmMenu();
					menu.setVisible(true);								
				} else {
					
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
					txtUsuario.setText("");
					jpassClave.setText("");
					txtUsuario.requestFocus();}
							
			}
		});
		btnIngresar.setBounds(66, 125, 89, 31);
		contentPane.add(btnIngresar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnCancelar.setBounds(208, 125, 98, 31);
		contentPane.add(btnCancelar);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(208, 47, 119, 20);
		contentPane.add(jpassClave);
		
		JLabel lblMensaje2 = new JLabel("Acceso a Todos: Usuario invitado, Contraseña 123456");
		lblMensaje2.setForeground(Color.BLUE);
		lblMensaje2.setBounds(10, 89, 339, 14);
		contentPane.add(lblMensaje2);
	}
}
