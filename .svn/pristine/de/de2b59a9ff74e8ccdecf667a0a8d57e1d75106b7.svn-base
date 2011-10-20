package redesocial.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListagemMensagemImplTest {
	
	private CadastroUsuario cadastroUsuario = CadastroUsuarioSingleton
			.getInstance();
	
	private PostagemMensagemImpl postagemMensagem = new PostagemMensagemImpl();
	
	private ListagemMensagemImpl listagemMensagem = new ListagemMensagemImpl();
	
	@Test
	public void testListagemMensagem() {				
		
		cadastroUsuario.cadastrarNovoUsuario("Joao");

		assertEquals("ok", postagemMensagem.postarMensagem("Joao","primeira"));

		assertEquals("primeira\n", listagemMensagem.listarMensagem("Joao"));
		
	}
	
	@Test
	public void testListagemMensagemOrdemInversa() {				
		
		cadastroUsuario.cadastrarNovoUsuario("Noda");

		assertEquals("ok", postagemMensagem.postarMensagem("Noda","primeira"));
		
		assertEquals("ok", postagemMensagem.postarMensagem("Noda","segunda"));
		
		assertEquals("ok", postagemMensagem.postarMensagem("Noda","ultima"));

		assertEquals("ultima\nsegunda\nprimeira\n", listagemMensagem.listarMensagem("Noda"));
		
	}

}
