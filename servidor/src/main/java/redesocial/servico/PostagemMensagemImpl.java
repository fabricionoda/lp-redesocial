package redesocial.servico;

import redesocial.modelo.Mensagem;
import redesocial.modelo.Usuario;
import redesocial.servico.excecao.CadastroUsuarioException;

public class PostagemMensagemImpl implements PostagemMensagem {

	private CadastroUsuario cadastroUsuario;

	public PostagemMensagemImpl() {
		cadastroUsuario = CadastroUsuarioSingleton.getInstance();
	}

	public String postarMensagem(String nomeUsuario, String msg) {

		if (msg == null || msg.trim().equals("") || msg.length() > 140) {
			return "mensagem-invalida";
		}

		Usuario usuario = null;

		try {
			usuario = cadastroUsuario.getUsuarioPorNome(nomeUsuario);
		} catch (CadastroUsuarioException e) {
			return e.getMessage();
		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}

		Mensagem mensagem = new Mensagem(msg, usuario);

		usuario.addMensagem(mensagem);

		return "ok";
	}

}
