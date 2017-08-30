package br.com.fiap.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.fiap.dao.VideoGameDAO;
import br.com.fiap.model.Console;


@Repository
public class VideoGameDAOImpl 
				extends GenericDAOImpl<Console, Integer> 
											 implements VideoGameDAO{

}
