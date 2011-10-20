package redesocial.servico;

import redesocial.servico.excecao.CadastroUsuarioException;

public interface ValidadorCadastroUsuario {

	boolean validar(String nome) throws CadastroUsuarioException;
}
