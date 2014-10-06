package fr.istic.dugl.u4.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import fr.istic.dugl.u4.client.ui.AfficherListNoms;




/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Devinette implements EntryPoint {

	private final SuccesServiceAsync succesService = GWT.create(SuccesService.class);
	
	private DeckPanel deckPanel = new DeckPanel();

//	private int nbrCoups;
//	private int nbrRech;
//	private int nbrSaisi;
//
//	private VerticalPanel accueilPanel = new VerticalPanel();
//	private VerticalPanel interrogationPanel = new VerticalPanel();
//	private VerticalPanel resultatPanel = new VerticalPanel();
//
//	private TextBox saisieInterroTextBox = new TextBox();
//	private TextBox monNom = new TextBox();
//	private TextBox saisieResultTextBox = new TextBox();
//	private Label TitreNomLabel = new Label("Entrer votre nom");
//	private Label choisissezLabel = new Label("Choisissez un nombre entre 1 et 100");
//	private Label messageInterroLabel = new Label();
//	private Label messageResultLabel = new Label();
//	private Button demarrezAccueilButton = new Button("Demarrez");
//	private Button demarrezInterroButton = new Button("Demarrez");
//	private Button demarrezResultButton = new Button("Demarrez");

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		// première page : Accueil

//		accueilPanel.add(TitreNomLabel);
//		accueilPanel.add(monNom);
//		accueilPanel.add(demarrezAccueilButton);
//
//		deckPanel.add(accueilPanel);
//		accueilPanel.setStyleName("centrer");
//
//		// 2ème page : interrogation
//		interrogationPanel.add(choisissezLabel);
//		interrogationPanel.add(saisieInterroTextBox);
//		interrogationPanel.add(messageInterroLabel);
//		interrogationPanel.add(demarrezInterroButton);
//		demarrezInterroButton.setEnabled(false);
//		deckPanel.add(interrogationPanel);
//		interrogationPanel.setSpacing(30);
//		interrogationPanel.setStyleName("centrer");
//
//		// 3ème page : resultat
//		resultatPanel.add(saisieResultTextBox);
//		resultatPanel.add(messageResultLabel);
//		resultatPanel.add(demarrezResultButton);
//		deckPanel.add(resultatPanel);
//		resultatPanel.setStyleName("centrer");
//
		RootPanel.get("test").add(deckPanel);
		deckPanel.add(MesPages.LIST_NOMS.getPanel());
		deckPanel.showWidget(MesPages.LIST_NOMS.ordinal());
		
		envoieNomServer();
//		deckPanel.showWidget(0);
//
		
//
//		// Listen for mouse events on the Add button.
//		demarrezAccueilButton.addClickHandler(new ClickHandler() {
//			public void onClick(ClickEvent event) {
//				deckPanel.showWidget(1);
//				nbrRech= (int)(Math.random() * (100)) + 1;
//				nbrCoups=0;
//				envoieNomServer();
//
//			}
//
//
//		});
//

//		// Listen for mouse events on the Add button.
//		demarrezResultButton.addClickHandler(new ClickHandler() {
//			public void onClick(ClickEvent event) {
//				deckPanel.showWidget(1);
//				nbrRech= (int)(Math.random() * (100)) + 1;
//				nbrCoups=0;
//				messageInterroLabel.setText("");
//				saisieInterroTextBox.setText("");
//
//			}
//		});
//
//		// Listen for keyboard events in the input box.
//		saisieInterroTextBox.addKeyDownHandler(new KeyDownHandler() {
//			public void onKeyDown(KeyDownEvent event) {
//				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
//					String newVal = saisieInterroTextBox.getText();
//					nbrSaisi=Integer.parseInt(newVal);
//					nbrCoups++;
//					verifierSolution();
//
//				}
//			}
//
//		});

	}

	private  void envoieNomServer() {

		String nom = "toto";
         succesService.envoieNomServer(nom, new AsyncCallback<List<String>>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(List<String> result) {
				AfficherListNoms page = (AfficherListNoms) MesPages.LIST_NOMS.getPanel();
				page.init(result);
				deckPanel.showWidget(MesPages.LIST_NOMS.ordinal());
			}
		}); 
	}
	
	private void verifierSolution() {
//		if (nbrRech == nbrSaisi) {
//			messageResultLabel.setText("Bravo, vous avez trouvez en " + nbrCoups + " coups");
//			deckPanel.showWidget(2);
//		} else { 
//			if (nbrRech < nbrSaisi){
//				messageInterroLabel.setText("trop grand");
//			} else {
//				messageInterroLabel.setText("trop petit");
//			}
//		}
	}


}
