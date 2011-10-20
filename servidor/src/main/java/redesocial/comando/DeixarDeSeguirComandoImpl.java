package redesocial.comando;

import redesocial.servico.AbstractRelacionamentoSeguir;
import redesocial.servico.RelacionamentoDeixarDeSeguirImpl;

public class DeixarDeSeguirComandoImpl implements Comando {

	private AbstractRelacionamentoSeguir relacionamentoSeguir;

	public DeixarDeSeguirComandoImpl() {
		relacionamentoSeguir = new RelacionamentoDeixarDeSeguirImpl();
	}

	public String execute(String... parametros) {

		return relacionamentoSeguir.seguirOuDeixarDeSeguir(parametros[0],
				parametros[1]);
	}

	public int getNumeroArgumentos() {
		return 2;
	}

}
