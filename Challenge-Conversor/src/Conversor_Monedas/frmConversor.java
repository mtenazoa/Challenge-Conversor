package Conversor_Monedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frmConversor extends JFrame {

	private JPanel contentPane;
	

	frmMenu menu = new frmMenu();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConversor frame = new frmConversor();
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
	public frmConversor() {
		setTitle("Monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 194);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoMoneda = new JLabel("Elije la moneda a la que deseas convertir tu dinero");
		lblTipoMoneda.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipoMoneda.setBounds(98, 11, 324, 22);
		contentPane.add(lblTipoMoneda);
		
		JComboBox cboTipoMoneda = new JComboBox();
		cboTipoMoneda.setModel(new DefaultComboBoxModel(new String[] {"De Sol a Dólar", "De Sol a Euro", "De Sol a Libras", "De Sol a Yen", 
		"De Sol a Won Coreano", "De  Dólar a Sol", "De Euro a Sol", "De Libras a Sol", "De Yen a Sol", "De Won Coreano  a Sol", "", ""}));
		cboTipoMoneda.setBounds(98, 44, 308, 22);
		contentPane.add(cboTipoMoneda);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				String itemTipoMoneda;
				itemTipoMoneda = cboTipoMoneda.getSelectedItem().toString();
				
				double resultadoCon;
				
				switch(itemTipoMoneda) {
				
				case "De Sol a Dólar": 
					
					resultadoCon = menu.monto * 3.78;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					break;
				
				case "De Sol a Euro":
					resultadoCon = menu.monto * 4.02;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "De Sol a Libras":					
					resultadoCon = menu.monto * 4.55;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					break;	
					
				case "De Sol a Yen":
					resultadoCon = menu.monto * 0.0280147;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					
					break;			
					
				case "De Sol a Won norCoreano":
					resultadoCon = menu.monto * 0.0280147;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					break;
				
				case "De  Dólar a Sol":
					resultadoCon = menu.monto / 3.78;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					break;
				
				case "De Euro a Sol":
					resultadoCon = menu.monto / 4.02;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);					
					break;
					
				case "De Libras a Sol":
					resultadoCon = menu.monto / 4.55;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "De Yen a Sol":
					resultadoCon = menu.monto / 0.0280147;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					break;
				
				case "De Won Coreano  a Sol":
					resultadoCon = menu.monto / 0.0280147;					
					JOptionPane.showMessageDialog(null, resultadoCon, "RESULTADO",  JOptionPane.INFORMATION_MESSAGE);
					break;
					}
								
				
				int i = JOptionPane.showConfirmDialog(null, "¿Desea realizar la conversión de otra moneda?");
									
				if (i==0) {
					dispose();
					menu.setVisible(true);	
					
				} else if (i==1) {
					dispose();
					JOptionPane.showMessageDialog(null, "Se finalizó el programa");
				} else {
					dispose();
					JOptionPane.showMessageDialog(null, "Se finalizó el programa");
				}			
								
			}
		});
		btnCalcular.setBounds(94, 91, 89, 32);
		contentPane.add(btnCalcular);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnCancelar.setBounds(317, 91, 89, 32);
		contentPane.add(btnCancelar);
	}
}





