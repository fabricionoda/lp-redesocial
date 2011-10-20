package redesocial.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostagemMensagemImplTest {
	
	private PostagemMensagemImpl postagemMensagem = new PostagemMensagemImpl();
	
	private CadastroUsuario cadastroUsuario = CadastroUsuarioSingleton
			.getInstance();
	
	@Test
	public void testPostagemMensagemOK() {
		
		cadastroUsuario.cadastrarNovoUsuario("Noda");

		assertEquals("ok", postagemMensagem.postarMensagem("Noda","teste"));
		
	}
		
	@Test
	public void testPostagemMensagemVazia() {	
		
		assertEquals("mensagem-invalida", postagemMensagem.postarMensagem("Noda",""));
		
	}
	
	@Test
	public void testPostagemMensagemMaiorQue140() {	
		
		assertEquals("mensagem-invalida", postagemMensagem.postarMensagem("Noda","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis elit sapien, sed fringilla arcu. Morbi a magna quam, nec vestibulum nulla. Proin malesuada porta elit, eu viverra leo porta eu. Nam tincidunt consequat urna quis lobortis. Cras tellus lacus, viverra ut posuere eu, tempus sed metus. Vivamus gravida, nisi a tincidunt porta, nulla purus viverra tortor, nec congue felis eros ac purus. Praesent sagittis dapibus arcu, a condimentum nulla ullamcorper at. Cum sociis natoque penatibus et magnis dis parturient montes."));
		
	}
	
	@Test
	public void testPostagemMensagemNull() {	
		
		assertEquals("mensagem-invalida", postagemMensagem.postarMensagem("Noda",null));
		
	}

}
