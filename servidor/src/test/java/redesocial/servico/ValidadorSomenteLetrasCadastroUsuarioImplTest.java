package redesocial.servico;

import static org.junit.Assert.*;

import org.junit.Test;

import redesocial.servico.excecao.CadastroUsuarioException;

public class ValidadorSomenteLetrasCadastroUsuarioImplTest {

	private ValidadorCadastroUsuario validadorCadastroUsuario = new ValidadorSomenteLetrasCadastroUsuarioImpl();

	@Test
	public void testValidarOK() {

		try {
			assertTrue(validadorCadastroUsuario.validar("maria"));
		} catch (CadastroUsuarioException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testValidarComNumeros() {

		try {
			assertFalse(validadorCadastroUsuario.validar("maria123"));
		} catch (CadastroUsuarioException e) {
			assertEquals("nome-invalido", e.getMessage());
			return;
		}

		fail("passou");
	}

	@Test
	public void testValidarSomenteNumeros() {

		try {
			validadorCadastroUsuario
					.validar("124544577178780979494909874890484904908494");
		} catch (CadastroUsuarioException e) {
			assertEquals("nome-invalido", e.getMessage());
			return;
		}

		fail("passou");
	}
}
