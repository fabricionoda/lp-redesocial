package redesocial.modelo;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Usuario implements SeguidorObserver, Comparable<Usuario> {

	private String nome;

	private List<Mensagem> mensagens = new Vector<Mensagem>();

	private Map<String, Usuario> seguidores = new Hashtable<String, Usuario>();

	private Map<String, List<Mensagem>> seguidos = new Hashtable<String, List<Mensagem>>();

	public Usuario(String nome) {
		this.nome = nome;
	}

	public Usuario() {

	}

	@Override
	public String toString() {
		return nome;
	}

	public void addMensagem(Mensagem mensagem) {
		this.mensagens.add(mensagem);

		for (Usuario seguidor : seguidores.values()) {
			seguidor.recebeMensagem(this, mensagem);
		}

	}

	public void addSeguidor(Usuario seguidor) {
		this.seguidores.put(seguidor.getNome(), seguidor);
	}

	/**
	 * 
	 * @param seguido
	 */
	public boolean addSeguido(Usuario seguido) {

		if (this.seguidos.containsKey(seguido.getNome())) {
			return false;
		}

		this.seguidos.put(seguido.getNome(), new Vector<Mensagem>());

		seguido.addSeguidor(this);

		return true;
	}

	public void removeSeguidor(Usuario seguidor) {
		this.seguidores.remove(seguidor.getNome());
	}

	/**
	 * 
	 * @param seguido
	 */
	public boolean removeSeguido(Usuario seguido) {

		if (!this.seguidos.containsKey(seguido.getNome())) {
			return false;
		}

		this.seguidos.remove(seguido.getNome());
		seguido.removeSeguidor(this);

		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

	public Map<String, Usuario> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(Map<String, Usuario> seguidores) {
		this.seguidores = seguidores;
	}

	public Map<String, List<Mensagem>> getSeguidos() {
		return seguidos;
	}

	public void setSeguidos(Map<String, List<Mensagem>> seguidos) {
		this.seguidos = seguidos;
	}

	public int getNumeroMensagens() {
		return mensagens.size();
	}

	public int getNumeroSeguidos() {
		return seguidos.size();
	}

	public int getNumeroSeguidores() {
		return seguidores.size();
	}

	public void recebeMensagem(Usuario usuario, Mensagem mensagem) {
		seguidos.get(usuario.getNome()).add(mensagem);

	}

	public int compareTo(Usuario o) {
		return this.getNome().compareTo(o.getNome());
	}
}
