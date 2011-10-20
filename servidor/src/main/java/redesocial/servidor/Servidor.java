package redesocial.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import redesocial.comando.ExecutorComando;

public class Servidor {

	private static final int PORTA = 1234;

	private ExecutorComando executorComando;

	private class AtendimentoCliente implements Runnable {

		private Socket cliente;

		public AtendimentoCliente(Socket cliente) {
			this.cliente = cliente;
		}

		public void run() {

			String comando;

			try {

				comando = readLine(cliente.getInputStream());

				System.out.println("comando: " + comando);

				String retornoExecucao = executorComando
						.executarComando(comando);

				System.out.println("retornoExecucao: " + retornoExecucao);

				writeLine(cliente.getOutputStream(), retornoExecucao);

				cliente.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) throws IOException {

		new Servidor().iniciar();
	}

	public void iniciar() throws IOException {

		ServerSocket socket = new ServerSocket(PORTA);

		executorComando = new ExecutorComando();

		try {
			while (true) {
				atenderCliente(socket.accept());
			}
		} finally {
			socket.close();
		}
	}

	private void atenderCliente(final Socket cliente) throws IOException {
		// A ideia basica para atender um cliente é
		// - ler comando
		// - processar comando
		// - escrever resposta
		// Você deve fazer o controle da concorrência, pois vários
		// clientes podem ser atendindos concorrentemente
		// Você pode criar uma thread para atender cada cliente

		new Thread(new AtendimentoCliente(cliente)).start();

	}

	private static String readLine(InputStream in) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		return reader.readLine();
	}

	private static void writeLine(OutputStream out, String linhas)
			throws IOException {

		out.write(linhas.getBytes());
		out.write('\n');
	}

	public void run() {

	}

}
