package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.model.Console;

@Controller
@RequestMapping("/videogame")
public class VideoGameController {

	@GetMapping("cadastrar")
	public String abriForm(){
		return "videogame/cadastro";
	}
	
	public ModelAndView processaForm(Console console){
		System.out.println(console.getMarca() +  " " + console.getModelo());
		ModelAndView retorno = new ModelAndView("videogame/cadastroSucesso");
		retorno.addObject("v",console);
		return retorno;
	}
	
}
