package redesocial.modelo;

import redesocial.comando.Comando;
import redesocial.servico.CadastroUsuario;
import redesocial.servico.CadastroUsuarioSingleton;

public class ResetComando implements Comando {

	protected CadastroUsuario cadastroUsuario;

	public ResetComando() {
		cadastroUsuario = CadastroUsuarioSingleton.getInstance();

	}

	public String execute(String... parametros) {
		cadastroUsuario.reset();

		return "ok";
	}

	public int getNumeroArgumentos() {
		return 0;
	}
}
