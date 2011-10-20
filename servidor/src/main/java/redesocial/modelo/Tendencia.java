package redesocial.modelo;

import java.util.List;
import java.util.Vector;

public class Tendencia {

	private String palavra;

	private List<Mensagem> mensagens = new Vector<Mensagem>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Tendencia other = (Tendencia) obj;

		if (palavra == null) {
			if (other.palavra != null)
				return false;
		} else if (!palavra.equals(other.palavra))
			return false;

		return true;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

}
