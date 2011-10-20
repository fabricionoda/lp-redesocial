package redesocial.comando;

import redesocial.servico.AbstractListagemUsuario;
import redesocial.servico.ListagemSeguidosImpl;

public class ListagemSeguidosComandoImpl implements Comando {

	private AbstractListagemUsuario listagemUsuario;

	public ListagemSeguidosComandoImpl() {

		listagemUsuario = new ListagemSeguidosImpl();
	}

	public String execute(String... parametros) {

		return listagemUsuario.listarUsuarios(parametros[0]);
	}

	public int getNumeroArgumentos() {
		return 1;
	}

}
