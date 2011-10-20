package redesocial.servico;

import java.util.LinkedHashSet;
import java.util.Set;

import redesocial.servico.excecao.CadastroUsuarioException;

public class ValidadorCadastroUsuarioCompositeImpl implements
		ValidadorCadastroUsuario {

	private Set<ValidadorCadastroUsuario> validadores = new LinkedHashSet<ValidadorCadastroUsuario>();

	public boolean validar(String nome) throws CadastroUsuarioException {

		boolean sucesso = true;

		for (ValidadorCadastroUsuario v : validadores) {
			sucesso &= v.validar(nome);
		}

		return sucesso;
	}

	public boolean addValidadorCadastroUsuario(ValidadorCadastroUsuario v) {
		return validadores.add(v);
	}
}
