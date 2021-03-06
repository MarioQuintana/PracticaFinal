package acciones;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.Puente;

public class ListenerMainArticulo implements ActionListener {
	private Puente puente;

	public ListenerMainArticulo(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		puente.getPanelArticulo().remove(puente.getPanelArticulo().getLblArticulos());
		puente.getPanelArticulo().remove(puente.getPanelArticulo().getPanel());
		puente.getPanelArticulo().setLayout(new GridLayout(2, 1, 0, 0));
		puente.getPanelArticulo().add(puente.getVistaAccederAltaArticulo());
		puente.getPanelArticulo().add(puente.getVistaAccederBuscarArticulo());
		puente.repaint();
		puente.revalidate();
	}
}
