package redesocial.comando;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExecutorComandoTest {

	private ExecutorComando executorComando = new ExecutorComando();

	@Test
	public void testExecutarComando() {

		assertEquals("ok", executorComando
				.executarComando("criar-usuario joao"));
		assertEquals("ok", executorComando
				.executarComando("criar-usuario maria"));

		assertEquals("ok", executorComando
				.executarComando("postar-mensagem joao Eu moro em Maringá"));
		assertEquals("Eu moro em Maringá\n", executorComando
				.executarComando("listar-mensagens-usuario joao"));

		assertEquals("ok", executorComando.executarComando("seguir maria joao"));

		assertEquals("joao/n", executorComando
				.executarComando("listar-seguidos maria"));

		assertEquals("maria/n", executorComando
				.executarComando("listar-seguidores joao"));
		
		assertEquals("ok", executorComando
				.executarComando("postar-mensagem joao oi maria"));
	}

}
