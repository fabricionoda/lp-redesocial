package redesocial.servico;

import java.util.Comparator;

import redesocial.modelo.Mensagem;

public class ComparadorMensagem implements Comparator<Mensagem> {

	public int compare(Mensagem o1, Mensagem o2) {
		return o1.getDataInclusao().compareTo(o2.getDataInclusao());
	}

}
