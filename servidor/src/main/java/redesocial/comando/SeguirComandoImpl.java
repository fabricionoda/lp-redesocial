package redesocial.comando;

import redesocial.servico.AbstractRelacionamentoSeguir;
import redesocial.servico.RelacionamentoSeguirImpl;

public class SeguirComandoImpl implements Comando {

	private AbstractRelacionamentoSeguir relacionamentoSeguir;

	public SeguirComandoImpl() {
		relacionamentoSeguir = new RelacionamentoSeguirImpl();
	}

	public String execute(String... parametros) {

		return relacionamentoSeguir.seguirOuDeixarDeSeguir(parametros[0],
				parametros[1]);
	}

	public int getNumeroArgumentos() {
		return 2;
	}

}
