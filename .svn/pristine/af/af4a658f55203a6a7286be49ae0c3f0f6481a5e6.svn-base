package redesocial.servico;

import redesocial.modelo.Usuario;
import redesocial.servico.excecao.CadastroUsuarioException;

public abstract class AbstractRelacionamentoSeguir {

	protected CadastroUsuario cadastroUsuario;

	public AbstractRelacionamentoSeguir() {
		cadastroUsuario = CadastroUsuarioSingleton.getInstance();
	}

	protected abstract String seguirOuDeixarDeSeguir(Usuario usuarioSeguidor,
			Usuario usuarioSeguido);

	public final String seguirOuDeixarDeSeguir(String nomeUsuarioSeguidor,
			String nomeUsuarioSeguido) {

		Usuario usuarioSeguidor = null;

		try {
			usuarioSeguidor = cadastroUsuario
					.getUsuarioPorNome(nomeUsuarioSeguidor);
		} catch (CadastroUsuarioException e) {
			return "seguidor-nao-encontrado";
		}

		Usuario usuarioSeguido = null;

		try {
			usuarioSeguido = cadastroUsuario
					.getUsuarioPorNome(nomeUsuarioSeguido);
		} catch (CadastroUsuarioException e) {

			return "seguido-nao-encontrado";
		}

		if (usuarioSeguidor.equals(usuarioSeguido)) {
			return "seguidor-e-seguido-sao-iguais";
		}

		return seguirOuDeixarDeSeguir(usuarioSeguidor, usuarioSeguido);

	}
}
