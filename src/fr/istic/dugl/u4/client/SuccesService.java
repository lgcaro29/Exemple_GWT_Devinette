package fr.istic.dugl.u4.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("lesSucces")
public interface SuccesService extends RemoteService {

	public List<Succes> afficheSucces();
	public void envoieSucces(Succes mySucces);
	public List<String> envoieNomServer(String nom);
}
