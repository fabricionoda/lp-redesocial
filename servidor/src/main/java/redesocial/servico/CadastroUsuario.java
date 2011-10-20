package redesocial.servico;

import redesocial.modelo.Usuario;
import redesocial.servico.excecao.CadastroUsuarioException;

public interface CadastroUsuario {

	String cadastrarNovoUsuario(String nome);

	Usuario getUsuarioPorNome(String nome) throws CadastroUsuarioException;

	void reset();
}
