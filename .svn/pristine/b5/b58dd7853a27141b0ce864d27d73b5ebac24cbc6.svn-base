package redesocial.servico;

import java.util.Map;

import redesocial.modelo.Usuario;
import redesocial.servico.excecao.CadastroUsuarioException;

public class ValidadorUsuarioJaCadastradoImpl implements
		ValidadorCadastroUsuario {

	private Map<String, Usuario> mapaUsuarios;

	public ValidadorUsuarioJaCadastradoImpl(Map<String, Usuario> mapaUsuarios) {
		this.mapaUsuarios = mapaUsuarios;
	}

	public boolean validar(String nome) throws CadastroUsuarioException {

		if (mapaUsuarios.containsKey(nome)) {
			throw new CadastroUsuarioException("usuario-ja-existe");
		}

		return true;
	}

}
