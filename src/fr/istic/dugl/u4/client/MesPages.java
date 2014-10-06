package fr.istic.dugl.u4.client;

import com.google.gwt.user.client.ui.VerticalPanel;

import fr.istic.dugl.u4.client.ui.AfficherListNoms;

public enum MesPages {
	LIST_NOMS(new AfficherListNoms());
	private VerticalPanel panel;

	private MesPages(VerticalPanel panel) {
		this.panel = panel;
	}
	
	public VerticalPanel getPanel() {
		return panel;
	}
	

}
