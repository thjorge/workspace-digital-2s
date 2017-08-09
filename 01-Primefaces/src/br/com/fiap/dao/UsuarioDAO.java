package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Usuario;

public interface UsuarioDAO 
					extends GenericDAO<Usuario, Integer>{

	long contarPorMesAniversario(int mes);
	
	long buscarPorNivel(int nivel);

	List<Usuario> buscarPorNome(String nome);

	List<String> completarPorNome(String texto);
	
	
}