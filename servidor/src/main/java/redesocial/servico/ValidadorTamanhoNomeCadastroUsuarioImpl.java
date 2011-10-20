package redesocial.servico;

import redesocial.servico.excecao.CadastroUsuarioException;

public class ValidadorTamanhoNomeCadastroUsuarioImpl implements
		ValidadorCadastroUsuario {

	public boolean validar(String nome) throws CadastroUsuarioException {

		if (nome == null || nome.length() < 3 || nome.length() > 20) {
			throw new CadastroUsuarioException("nome-invalido");
		}

		return true;
	}

}
