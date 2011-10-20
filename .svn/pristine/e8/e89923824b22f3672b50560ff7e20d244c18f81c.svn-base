package redesocial.comando;

import redesocial.servico.ListagemMensagem;
import redesocial.servico.ListagemMensagemImpl;

public class ListagemMensagemUsuarioComandoImpl implements Comando {

	private ListagemMensagem listagemMensagem;

	public ListagemMensagemUsuarioComandoImpl() {

		listagemMensagem = new ListagemMensagemImpl();
	}

	public String execute(String... parametros) {

		return listagemMensagem.listarMensagem(parametros[0]);
	}

	public int getNumeroArgumentos() {
		return 1;
	}

}
