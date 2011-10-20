package redesocial.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import redesocial.comando.CadastroUsuarioComandoImpl;

public class CadastroUsuarioComandoImplTest {
	
	CadastroUsuarioComandoImpl cadastroUsarioComando = new CadastroUsuarioComandoImpl();
	
	@Test
	public void testCadastrarNovoUsuarioOK() {

		assertEquals("ok", cadastroUsarioComando.execute("noda"));
	}

}
