package redesocial.servico;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadastroUsuarioSingletonTest {

	private CadastroUsuario cadastroUsuario = CadastroUsuarioSingleton
			.getInstance();

	@Test
	public void testCadastrarNovoUsuarioOK() {

		assertEquals("ok", cadastroUsuario.cadastrarNovoUsuario("Fabricio"));
	}

	@Test
	public void testCadastrarNovoUsuarioNumeroCaracteresInvalido() {

		assertEquals("nome-invalido", cadastroUsuario
				.cadastrarNovoUsuario("Fabricio12231545644897987987987"));
	}

	@Test
	public void testCadastrarNovoUsuarioNumeroCaracteresInvalido2() {

		assertEquals("nome-invalido", cadastroUsuario
				.cadastrarNovoUsuario("Fa"));
	}

	@Test
	public void testCadastrarNovoUsuarioSomenteLetras() {

		assertEquals("nome-invalido", cadastroUsuario
				.cadastrarNovoUsuario("Fa12"));
	}

	@Test
	public void testCadastrarNovoUsuarioJaCadastrado() {

		assertEquals("usuario-ja-existe", cadastroUsuario
				.cadastrarNovoUsuario("Fabricio"));
	}
}
