package br.com.fiap.bean;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.entity.Usuario;
import br.com.fiap.exception.DBException;

@ManagedBean
@ViewScoped
public class UsuarioBean {

	private Usuario usuario;
	private List<Usuario> lista;
	private UsuarioBO bo;
	private String nome;
	private int codigo;
	
	@PostConstruct
	private void init(){
		usuario = new Usuario();
		usuario.setDataNascimento(Calendar.getInstance());
		bo = new UsuarioBO();
		lista = bo.listar();
	}
	
	public String salvar(){
		FacesMessage msg;
		try {
			if(usuario.getCodigo() == 0){
				bo.cadastrar(usuario);
				msg = new FacesMessage("Cadastrado!");
			}else{
				bo.atualizar(usuario);
				msg = new FacesMessage("Atulizado");
			}			
		} catch (DBException e) {
			e.printStackTrace();
			msg = new FacesMessage("Erro...");
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		return "usuario?faces-redirect=true";
	}

	public void buscaPorNome(){
		lista = bo.buscarPorNome(nome);
	}
	
	//Método para o autocomplete da busca por nome
	public List<String> completarPorNome(String texto){
		return bo.completarPorNome(texto);
		
	}
	
	
	public void excluir(){
		FacesMessage msg;
		try {
			bo.remover(codigo);
			lista = bo.listar();
			msg = new FacesMessage("Removido!");
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage("Erro!");
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getLista() {
		return lista;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
