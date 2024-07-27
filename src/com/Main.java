package com;

public class Main {

	    public static void main(String[] args) {
	        IPhone meuIPhone = new IPhone();
	        
	        // Testando funcionalidades do reprodutor musical
	        meuIPhone.selecionarMusica("Imagine - John Lennon");
	        meuIPhone.tocar();
	        meuIPhone.pausar();
	        
	        // Testando funcionalidades do aparelho telefônico
	        meuIPhone.ligar("123-456-7890");
	        meuIPhone.atender();
	        meuIPhone.iniciarCorreioVoz();
	        
	        // Testando funcionalidades do navegador na internet
	        meuIPhone.exibirPagina("https://www.example.com");
	        meuIPhone.adicionarNovaAba();
	        meuIPhone.atualizarPagina();
	    }
	}