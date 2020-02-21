package br.com.moradacodigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.moradacodigo.loja.modelos.Produtos;



@Controller
public class ProdutosController {
	
	@RequestMapping("/produtos/form")
	public String form() {
		return "produtos/form";
	}
	
	
	@RequestMapping("/produtos")
	public String gravar(Produtos produto) {
		System.out.println(produto.toString());
		return "produtos/OK";
	}
	
	
}
