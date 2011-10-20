package redesocial.servico;

import redesocial.modelo.Usuario;

public class RelacionamentoDeixarDeSeguirImpl extends
		AbstractRelacionamentoSeguir {

	@Override
	protected String seguirOuDeixarDeSeguir(Usuario usuarioSeguidor,
			Usuario usuarioSeguido) {

		if (usuarioSeguidor.removeSeguido(usuarioSeguido)) {
			return "ok";
		}

		return "nao-seguindo";
	}

}
