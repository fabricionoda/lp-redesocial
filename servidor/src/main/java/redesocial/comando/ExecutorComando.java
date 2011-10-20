package redesocial.comando;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redesocial.modelo.ResetComando;

public class ExecutorComando {

	private Map<String, Comando> comandos;

	public ExecutorComando() {

		comandos = new HashMap<String, Comando>();

		comandos.put(Comando.CRIAR_USUARIO, new CadastroUsuarioComandoImpl());

		comandos.put(Comando.DEIXAR_DE_SEGUIR, new DeixarDeSeguirComandoImpl());

		comandos.put(Comando.LISTAR_MENSAGENS_SEGUIDOS,
				new ListagemMensagemSeguidosComandoImpl());

		comandos.put(Comando.LISTAR_MENSAGENS_USUARIO,
				new ListagemMensagemUsuarioComandoImpl());

		comandos.put(Comando.LISTAR_SEGUIDORES,
				new ListagemSeguidoresComandoImpl());

		comandos
				.put(Comando.LISTAR_SEGUIDOS, new ListagemSeguidosComandoImpl());

		comandos
				.put(Comando.POSTAR_MENSAGEM, new PostagemMensagemComandoImpl());

		comandos.put(Comando.SEGUIR, new SeguirComandoImpl());

		comandos.put(Comando.RESETAR, new ResetComando());

		// nao implementado ainda
		comandos
				.put(Comando.LISTAR_ESTATISTICAS_USUARIO, new NuloComandoImpl());

		// nao implementado ainda
		comandos.put(Comando.LISTAR_MENSAGENS_COM_PALAVRA_MARCADA,
				new NuloComandoImpl());
		// nao implementado ainda
		comandos.put(Comando.LISTAR_TENDENCIA, new NuloComandoImpl());

	}

	public String executarComando(String linhaComando) {

		int indexDelimitadorComando = linhaComando.indexOf(" ");

		String comandoString = (indexDelimitadorComando >= 0) ? linhaComando
				.substring(0, indexDelimitadorComando) : linhaComando;

		Comando comando = comandos.get(comandoString);

		if (comando == null) {
			return null;
		}

		int numeroArgumentos = comando.getNumeroArgumentos();

		List<String> parametros = new ArrayList<String>();

		String parametrosString = null;

		if (numeroArgumentos > 0) {
			parametrosString = linhaComando
					.substring(indexDelimitadorComando + 1);
		}

		switch (numeroArgumentos) {
		case 1:
			parametros.add(parametrosString);
			break;
		case 2:
			int indexParam = parametrosString.indexOf(' ');

			parametros.add(parametrosString.substring(0, indexParam));

			parametros.add(parametrosString.substring(indexParam + 1));
			break;
		}

		return comando.execute(parametros.toArray(new String[0]));

	}
}
