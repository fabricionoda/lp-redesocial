package redesocial.servico;

import redesocial.servico.excecao.CadastroUsuarioException;

public class ValidadorSomenteLetrasCadastroUsuarioImpl implements
		ValidadorCadastroUsuario {

	public boolean validar(String nome) throws CadastroUsuarioException {

		if (!nome.matches("[a-zA-Z]{3,20}")) {
			throw new CadastroUsuarioException("nome-invalido");
		}

		return true;

	}

}
