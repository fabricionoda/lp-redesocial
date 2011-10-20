package redesocial.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListagemMensagemSeguidosImplTest {

	private CadastroUsuario cadastroUsuario = CadastroUsuarioSingleton
			.getInstance();

	private PostagemMensagemImpl postagemMensagem = new PostagemMensagemImpl();

	private ListagemMensagemSeguidosImpl listagemMensagemSeguidos = new ListagemMensagemSeguidosImpl();

	private RelacionamentoSeguirImpl relacionamentoSeguir = new RelacionamentoSeguirImpl();

	@Test
	public void testListagemMensagemSeguidos() {

		assertEquals("ok", cadastroUsuario.cadastrarNovoUsuario("infouem"));

		assertEquals("ok", cadastroUsuario.cadastrarNovoUsuario("fabricio"));

		assertEquals("ok", relacionamentoSeguir.seguirOuDeixarDeSeguir(
				"infouem", "fabricio"));

		assertEquals("ok", postagemMensagem.postarMensagem("fabricio", "teste"));

		assertEquals("fabricio teste/n", listagemMensagemSeguidos
				.listarMensagens("infouem"));

	}

}
