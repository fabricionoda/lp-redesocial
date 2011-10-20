package redesocial.comando;

import redesocial.servico.ListagemMensagemSeguidos;
import redesocial.servico.ListagemMensagemSeguidosImpl;

public class ListagemMensagemSeguidosComandoImpl implements Comando {

	private ListagemMensagemSeguidos listagemMensagemSeguidos;

	public ListagemMensagemSeguidosComandoImpl() {
		listagemMensagemSeguidos = new ListagemMensagemSeguidosImpl();
	}

	public String execute(String... parametros) {

		return listagemMensagemSeguidos.listarMensagens(parametros[0]);
	}

	public int getNumeroArgumentos() {
		return 1;
	}

}
