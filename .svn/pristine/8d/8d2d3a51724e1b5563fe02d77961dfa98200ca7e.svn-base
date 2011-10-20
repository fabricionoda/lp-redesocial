package redesocial.servico;

import static org.junit.Assert.*;

import org.junit.Test;

import redesocial.servico.excecao.CadastroUsuarioException;

public class ValidadorTamanhoNomeCadastroUsuarioImplTest {

	private ValidadorCadastroUsuario validadorCadastroUsuario = new ValidadorTamanhoNomeCadastroUsuarioImpl();;

	@Test
	public void testValidarOK() {
		try {
			assertTrue(validadorCadastroUsuario.validar("joao"));
		} catch (CadastroUsuarioException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testValidarNomeMenorQue3Caracteres() {
		try {
			validadorCadastroUsuario.validar("jo");
		} catch (CadastroUsuarioException e) {
			assertEquals("nome-invalido", e.getMessage());
		}
	}

	@Test
	public void testValidarNomeMaiorQue20() {
		try {
			validadorCadastroUsuario.validar("123456789012345678912");
		} catch (CadastroUsuarioException e) {
			assertEquals("nome-invalido", e.getMessage());
		}
	}

}
