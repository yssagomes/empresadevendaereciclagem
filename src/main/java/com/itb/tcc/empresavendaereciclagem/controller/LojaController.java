package com.itb.tcc.empresavendaereciclagem.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.empresavendaereciclagem.model.Produto;

//http://localhost:8080/comercio/produtos

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArraysList<Produto>();
	
  @GetMapping("/Listar")
    public String listarProdutos() {
    	System.out.println("lista de produtos");
    	

            Produto p1 = new Produto();
            p1.setId(20l);
            p1.setNome("Máquina de Lavar Brastemp 15 1");
            p1.setCodigoBarras("1542D739G4905KT05D837");
            p1.setDescricao("Produto Linha Branca com painel digital");
            p1.setPreco(3215.89);

            Produto p2 = new Produto();
            p2.setId(20l);
            p2.setNome("Televisor 70'");
            p2.setCodigoBarras("TLERD44487114454");
            p2.setDescricao("Televisor Tela Plana let Samsung");
            p2.setPreco(6326.12);

            // Adicionando os produtos á lista
            
            listaDeProdutos.add(p1);
            
         return "produtos";
        }
    }
		

