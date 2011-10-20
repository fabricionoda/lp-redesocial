package redesocial.servico;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import redesocial.modelo.Mensagem;
import redesocial.modelo.Usuario;
import redesocial.servico.excecao.CadastroUsuarioException;

public class ListagemMensagemSeguidosImpl implements ListagemMensagemSeguidos {

	private CadastroUsuario cadastroUsuario;

	private ComparadorMensagem comparador;

	public ListagemMensagemSeguidosImpl() {

		cadastroUsuario = CadastroUsuarioSingleton.getInstance();
		comparador = new ComparadorMensagem();

	}

	public String listarMensagens(String nomeUsuario) {

		Usuario usuario = null;

		try {
			usuario = cadastroUsuario.getUsuarioPorNome(nomeUsuario);
		} catch (CadastroUsuarioException e) {

			return e.getMessage();
		}

		Collection<List<Mensagem>> mensagensSeguidos = usuario.getSeguidos()
				.values();

		List<Mensagem> mensagensAgrupadas = new LinkedList<Mensagem>();

		for (List<Mensagem> listaMensagens : mensagensSeguidos) {
			mensagensAgrupadas.addAll(listaMensagens);
		}

		Collections.sort(mensagensAgrupadas, comparador);

		Collections.reverse(mensagensAgrupadas);

		StringBuilder sb = new StringBuilder();

		for (Mensagem m : mensagensAgrupadas) {

			sb.append(m.getUsuario().getNome());
			sb.append(" ");
			sb.append(m.getTexto());
			sb.append("\n");
		}

		return sb.toString();
	}

}
