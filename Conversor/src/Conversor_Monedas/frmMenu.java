package Conversor_Monedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conversor_Hora_Paises.frmConversorTiempo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frmMenu extends JFrame {

	protected static double monto;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu frame = new frmMenu();
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
	public frmMenu() {
		setTitle("Menú Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 166);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensajePrincipal = new JLabel("Seleccione el tipo de converción que desea realizar:");
		lblMensajePrincipal.setBounds(57, 11, 312, 15);
		lblMensajePrincipal.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblMensajePrincipal);
		
		JComboBox cboTipoConversion = new JComboBox();
		cboTipoConversion.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Monedas", "Conversor de Tiempo"}));
		cboTipoConversion.setBounds(57, 37, 312, 22);
		contentPane.add(cboTipoConversion);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				String item;
				item = cboTipoConversion.getSelectedItem().toString();
				
				if(item.equalsIgnoreCase("Conversor de Monedas")){
					
					try {					
						 monto = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el monto a convertir: ", 0));	
						 dispose();
						frmConversor frmConversor = new frmConversor();
						frmConversor.setVisible(true);	
						 
					} catch (NumberFormatException mensaje){
						JOptionPane.showMessageDialog(null, "Ingrese solo números", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);				
										
					}	} else if (item.equalsIgnoreCase("Conversor de Tiempo")) {
						
					frmConversorTiempo conversorTiempo = new frmConversorTiempo();
					dispose();
					conversorTiempo.setVisible(true);					
														
				}
				
							}
		});
		btnAceptar.setBounds(57, 79, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnCancelar.setBounds(278, 79, 89, 23);
		contentPane.add(btnCancelar);
	}
}
