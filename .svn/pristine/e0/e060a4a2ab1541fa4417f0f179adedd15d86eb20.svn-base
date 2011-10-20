package redesocial.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListagemSeguidoresImplTest {
	
	private ListagemSeguidoresImpl listagemSeguidores = new ListagemSeguidoresImpl();
	
	private CadastroUsuario cadastroUsuario = CadastroUsuarioSingleton
			.getInstance();
		
	private RelacionamentoSeguirImpl relacionamentoSeguir = new  RelacionamentoSeguirImpl();
	

	@Test
	public void testListagemSeguidoresOK() {

		assertEquals("ok", cadastroUsuario.cadastrarNovoUsuario("infouem"));
		
		assertEquals("ok", cadastroUsuario.cadastrarNovoUsuario("fabricio"));	
		
		assertEquals("ok", cadastroUsuario.cadastrarNovoUsuario("malbarbo"));
		
		assertEquals("ok", relacionamentoSeguir.seguirOuDeixarDeSeguir("fabricio", "malbarbo"));
		
		assertEquals("ok", relacionamentoSeguir.seguirOuDeixarDeSeguir("infouem", "malbarbo"));
		
		assertEquals("fabricio/ninfouem/n", listagemSeguidores.listarUsuarios( "malbarbo"));				

	}

}
