package redesocial.servico;

import redesocial.modelo.Usuario;

public class RelacionamentoSeguirImpl extends AbstractRelacionamentoSeguir {

	@Override
	protected String seguirOuDeixarDeSeguir(Usuario usuarioSeguidor,
			Usuario usuarioSeguido) {

		if (usuarioSeguidor.addSeguido(usuarioSeguido)) {
			return "ok";
		}

		return "ja-seguindo";
	}

}
