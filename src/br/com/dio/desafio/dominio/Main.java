package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();

		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descricação curso JS");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("mentoria sobre Java");
		mentoria.setData(LocalDate.now());
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("descricao BootCamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGabriel = new Dev();
		devGabriel.setNome("Gabriel");
		devGabriel.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devGabriel.getConteudosIncritos());
		devGabriel.progredir();
		System.out.println(" - ");
		System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosIncritos());
		System.out.println("Conteúdos Concluídos Gabriel: " + devGabriel.getConteudosConcluidos());
		
		Dev devRennan = new Dev();
		devRennan.setNome("Rennan");
		devRennan.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devRennan.getConteudosIncritos());
		devRennan.progredir();
		System.out.println(" - ");
		System.out.println("Conteúdos Inscritos Rennan: " + devRennan.getConteudosIncritos());
		System.out.println("Conteúdos Concluídos Rennan: " + devRennan.getConteudosConcluidos());
	
	
	
	}

}
