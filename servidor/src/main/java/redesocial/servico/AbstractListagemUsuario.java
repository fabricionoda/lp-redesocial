package redesocial.servico;

import java.util.List;

import redesocial.modelo.Usuario;
import redesocial.servico.excecao.CadastroUsuarioException;

public abstract class AbstractListagemUsuario {

	protected CadastroUsuario cadastroUsuario;

	public AbstractListagemUsuario() {
		cadastroUsuario = CadastroUsuarioSingleton.getInstance();
	}

	protected abstract List<String> getNomesUsuarios(Usuario usuario);

	public String listarUsuarios(String nomeUsuario) {
		Usuario usuario;

		try {
			usuario = cadastroUsuario.getUsuarioPorNome(nomeUsuario);
		} catch (CadastroUsuarioException e) {
			return e.getMessage();
		}

		List<String> seguidos = getNomesUsuarios(usuario);

		//Collections.sort(seguidos);

		StringBuilder sb = new StringBuilder();

		for (String nome : seguidos) {
			sb.append(nome);
			sb.append("\n");
		}

		return sb.toString();
	}
}
