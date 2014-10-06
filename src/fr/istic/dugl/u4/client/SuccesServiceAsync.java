package fr.istic.dugl.u4.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SuccesServiceAsync {

	void afficheSucces(AsyncCallback<List<Succes>> callback);

	void envoieSucces(Succes mySucces, AsyncCallback<Void> callback);

	void envoieNomServer(String nom, AsyncCallback<List<String>> callback);
	

}
