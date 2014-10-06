package fr.istic.dugl.u4.server;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.istic.dugl.u4.client.Succes;
import fr.istic.dugl.u4.client.SuccesService;

public class SuccesServerImpl extends RemoteServiceServlet implements SuccesService {
	private List<String> add(HttpSession  session, String nom) {
		List<String> noms = (List<String>) session.getAttribute("listDesNoms");
		if (noms == null) {
			noms = new ArrayList<String>();
			session.setAttribute("listDesNoms", noms);
		}
		noms.add(nom);
		return noms;
	}

	@Override
	public List<Succes> afficheSucces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void envoieSucces(Succes mySucces) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> envoieNomServer(String nom) {
		return add(this.getThreadLocalRequest().getSession(), nom);
		
	}

}
