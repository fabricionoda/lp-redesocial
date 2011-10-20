package redesocial.servico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import redesocial.modelo.Mensagem;
import redesocial.modelo.Usuario;
import redesocial.servico.excecao.CadastroUsuarioException;

public class ListagemMensagemImpl implements ListagemMensagem {

	private CadastroUsuario cadastroUsuario;

	private ComparadorMensagem comparador;

	public ListagemMensagemImpl() {
		cadastroUsuario = CadastroUsuarioSingleton.getInstance();

		comparador = new ComparadorMensagem();
	}

	public String listarMensagem(String nomeUsuario) {

		Usuario usuario = null;

		try {

			usuario = cadastroUsuario.getUsuarioPorNome(nomeUsuario);
		} catch (CadastroUsuarioException e) {
			return e.getMessage();
		}

		List<Mensagem> mensagens = new ArrayList<Mensagem>(usuario
				.getMensagens());

		Collections.sort(mensagens, comparador);

		Collections.reverse(mensagens);

		StringBuilder sb = new StringBuilder();

		for (Mensagem m : mensagens) {
			sb.append(m.getTexto());
			sb.append("\n");
		}

		return sb.toString();
	}
}
