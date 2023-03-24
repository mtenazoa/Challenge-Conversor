package Conversor_Hora_Paises;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmConversorTiempo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConversorTiempo frame = new frmConversorTiempo();
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
	public frmConversorTiempo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensajeTiempo = new JLabel("Ingrese la hora que desea validar: ");
		lblMensajeTiempo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMensajeTiempo.setBounds(76, 21, 218, 14);
		contentPane.add(lblMensajeTiempo);
		
		JComboBox cboConversorTiempo = new JComboBox();
		cboConversorTiempo.setModel(new DefaultComboBoxModel(new String[] {"De Perú a Brasil", "De Perú a España", "De Perú a EEUU", "De Brasil a Perú", "De España a Perú", "De EEUU a Perú"}));
		cboConversorTiempo.setBounds(76, 57, 208, 22);
		contentPane.add(cboConversorTiempo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(76, 104, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnCancelar.setBounds(205, 104, 89, 23);
		contentPane.add(btnCancelar);
	}

}
