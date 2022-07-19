package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
	
	Curso cursoGit = new Curso();
	cursoGit.setTitulo("Introdução ao Git e ao GitHub");
	cursoGit.setDescricao("Conheça o Git e aprenda a utilizar o GitHub para compartilhar seus projetos.");
	cursoGit.setCargaHoraria(5);
		
	Curso cursoJava = new Curso();
	cursoJava.setTitulo("Dominando IDEs Java");
	cursoJava.setDescricao("Conheça e aprenda como utilizar as IDES Eclipse e IntelliJ para programar em Java.");
	cursoJava.setCargaHoraria(4);
	
	Mentoria mentoriaSQL = new Mentoria();
	mentoriaSQL.setTitulo("Primeiros passos com Banco de Dados Relacional (SQL)");
	mentoriaSQL.setDescricao("Conheça o básico de Banco de Dados Relacional (SQL)");
	mentoriaSQL.setData(LocalDate.now());
	
	Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Santander Code Girls");
    bootcamp.setDescricao("Sejam todas bem-vindas ao Santander Bootcamp 2022! "
    		+ "Comece sua jornada na trilha de Java, assista as aulas, faça os desafios de códigos e projetos e conclua as atividades. "
    		+ "Todas as graduadas receberão certificado e terão chance de ingressar no mercado de trabalho!");
    bootcamp.getConteudos().add(cursoJava);
    bootcamp.getConteudos().add(cursoGit);
    bootcamp.getConteudos().add(mentoriaSQL);
    
    Dev devJuliana = new Dev();
    devJuliana.setNome("Juliana");
    devJuliana.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos:" + devJuliana.getConteudosInscritos());
    devJuliana.progredir();
    devJuliana.progredir();
    devJuliana.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos:" + devJuliana.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos:" + devJuliana.getConteudosConcluidos());
    System.out.println("XP:" + devJuliana.calcularTotalXp());
    
    
    
	}
}
