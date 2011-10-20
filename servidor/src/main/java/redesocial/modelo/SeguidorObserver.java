package redesocial.modelo;

public interface SeguidorObserver {

	void recebeMensagem(Usuario usuario, Mensagem mensagem);
}
