package redesocial.servico;

import java.util.LinkedList;
import java.util.List;

import redesocial.modelo.Usuario;

public class ListagemSeguidosImpl extends AbstractListagemUsuario {

	@Override
	protected List<String> getNomesUsuarios(Usuario usuario) {
		return new LinkedList<String>(usuario.getSeguidos().keySet());
	}

}
