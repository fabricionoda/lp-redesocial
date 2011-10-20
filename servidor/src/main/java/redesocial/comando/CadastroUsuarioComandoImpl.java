package redesocial.comando;

import redesocial.servico.CadastroUsuario;
import redesocial.servico.CadastroUsuarioSingleton;

public class CadastroUsuarioComandoImpl implements Comando {

	private CadastroUsuario cadastroUsuario;

	public CadastroUsuarioComandoImpl() {
		cadastroUsuario = CadastroUsuarioSingleton.getInstance();
	}

	public String execute(String... parametros) {

		return cadastroUsuario.cadastrarNovoUsuario(parametros[0]);
	}

	public int getNumeroArgumentos() {
		return 1;
	}

}
