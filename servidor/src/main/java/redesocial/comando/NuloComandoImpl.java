package redesocial.comando;

public class NuloComandoImpl implements Comando {

	public String execute(String... parametros) {

		return "ok";
	}

	public int getNumeroArgumentos() {
		return 0;
	}

}
