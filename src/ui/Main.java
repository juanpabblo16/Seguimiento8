package ui;

import java.util.Scanner;

import model.NominadosList;

public class Main {
	
private static NominadosList nominadosList;

	static Scanner sn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean salir = true;
		
		System.out.println("Ingresa el numero de nominados a ingresar");
		
		int cantidadNominados = sn.nextInt();
		
		int numeroDeNominados = cantidadNominados;
		
		while (cantidadNominados !=0 && cantidadNominados <= numeroDeNominados  && !salir){
		
		System.out.println("Ingresa el nombre de los paises");
		
		String nombreDePaises [] = new String [cantidadNominados];
		
		String nombreNominado  = sn.nextLine();
		
		nombreDePaises [cantidadNominados] = nombreNominado;
		
		System.out.println("Ingresa cantidad de medallas de oro masculino, plata masculino, bronce masculino, oro femenino, plata femenino y bronce femenino");
		
		int medallasDeCadaPais [] = new int [5];
		
		int medallasDeOroMasculino = sn.nextInt();
		int medallasDePlataMasculino = sn.nextInt();
		int medallasDeBronceMasculino = sn.nextInt();
		int medallasDeOroFemenino = sn.nextInt();
		int medallasDePlataFemenio = sn.nextInt();
		int medallasDeBronceFemenino = sn.nextInt();
		
		medallasDeCadaPais [0] = medallasDeOroMasculino;
		medallasDeCadaPais [1] = medallasDePlataMasculino;
		medallasDeCadaPais [2] = medallasDeBronceMasculino;
		medallasDeCadaPais [3] = medallasDeOroFemenino;
		medallasDeCadaPais [4] = medallasDePlataFemenio;
		medallasDeCadaPais [5] = medallasDeBronceFemenino;
		
		}
		
		nominadosList = new NominadosList();
		
		nominadosList.sortBylist();
		printList();
		
		nominadosList.sortNominadosOroHombre();
		printList();
		
		nominadosList.sortNominadosPlataHombre();
		printList();
		
		nominadosList.sortNominadosBronceHombre();
		printList();
		
		nominadosList.sortNominadosOroMujeres();
		printList();
		
		nominadosList.sortNominadosPlataMujeres();
		printList();
		
		nominadosList.sortNominadosBronceMujeres();
		printList();

		nominadosList.sortCompareNombres();
		printList();
		
		
		
	}
	
	public static void printList() {
		System.out.println("----");
		for (int i = 0; i < nominadosList.getNominado().size(); i++) {
			System.out.println(nominadosList.getNominado().get(i));
		}
		System.out.println("----");
	}
	
	
	
}
