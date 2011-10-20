package redesocial.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RelacionamentoSeguirImplTest {
	
	private CadastroUsuario cadastroUsuario = CadastroUsuarioSingleton
			.getInstance();
	
	RelacionamentoSeguirImpl relacionamentoSeguir = new  RelacionamentoSeguirImpl();
		
	@Test
	public void testRelacionamentoSeguirOK() {
		
		cadastroUsuario.cadastrarNovoUsuario("infouem");
		
		cadastroUsuario.cadastrarNovoUsuario("din");

		assertEquals("ok",relacionamentoSeguir.seguirOuDeixarDeSeguir("infouem", "din"));
		
	}
	
	@Test
	public void testRelacionamentoSeguirJaSeguido() {
		
		cadastroUsuario.cadastrarNovoUsuario("infouem");
		
		cadastroUsuario.cadastrarNovoUsuario("din");

		assertEquals("ja-seguindo",relacionamentoSeguir.seguirOuDeixarDeSeguir("infouem", "din"));
		
	}
}
