package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class VistaAccederAltaCliente extends JPanel {

	protected JButton btnAltaCliente;
	protected VistaEjecutarAltaCliente VistaEjecutarAltaCliente=new VistaEjecutarAltaCliente();

	
	protected JButton button;

	public JButton getButton() {
		return button;
	}

	public VistaAccederAltaCliente() {
		setLayout(new BorderLayout(0, 0));

		JLabel lblAltaCliente = new JLabel("Alta Cliente");
		lblAltaCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAltaCliente.setFont(new Font("David", Font.BOLD, 22));
		lblAltaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblAltaCliente, BorderLayout.SOUTH);

		btnAltaCliente = new JButton("");
		add(btnAltaCliente, BorderLayout.CENTER);
	}

	public JButton getBtnAltaCliente() {
		return btnAltaCliente;
	}


	public VistaEjecutarAltaCliente getVistaEjecutarAltaCliente() {
		return VistaEjecutarAltaCliente;
	}


}