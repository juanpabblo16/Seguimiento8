package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NominadosList {

	private List<Nominados> nominados;

	public NominadosList() {
		nominados = new ArrayList<>();
	}

	public void addNominado(Nominados nominado) {
		nominados.add(nominado);
	}

	public List<Nominados> getNominado() {
		return nominados;
	}
	
	public void sortBylist() {
		int n = nominados.size();
		boolean inversion = true;
		
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n - i; j++) {
	    		if (nominados.get(j).compareTo(nominados.get(j-1)) < 0) {
	    			Nominados temp = nominados.get(j);
	    			nominados.set(j, nominados.get(j-1));
	    	        nominados.set(j-1, temp);
	    			inversion = true;
	    		}
	    	}
	    }
	}

	public void sortNominadosOroHombre() {
		Collections.sort(nominados, new Comparator<Nominados>() {
			@Override
			public int compare(Nominados o1, Nominados o2) {

				return o1.getCantidadMedallasOroHombre() - o2.getCantidadMedallasOroHombre();
				
			}
		});
	}
	public void sortNominadosPlataHombre() {
		Collections.sort(nominados, new Comparator<Nominados>() {
			@Override
			public int compare(Nominados o1, Nominados o2) {
				
				return o1.getCantidadMedallasPlataHombre() - o2.getCantidadMedallasPlataHombre();
				
			}
		});
	}
	public void sortNominadosBronceHombre() {
		Collections.sort(nominados, new Comparator<Nominados>() {
			@Override
			public int compare(Nominados o1, Nominados o2) {
				
				return o1.getCantidadMedallasBronceHombre() - o2.getCantidadMedallasBronceHombre();
				
			}
		});
	}
	public void sortNominadosOroMujeres() {
		Collections.sort(nominados, new Comparator<Nominados>() {
			@Override
			public int compare(Nominados o1, Nominados o2) {
				
				return o1.getCantidadMedallasOroFemenino() - o2.getCantidadMedallasOroFemenino();
				
			}
		});
	}
	public void sortNominadosPlataMujeres() {
		Collections.sort(nominados, new Comparator<Nominados>() {
			@Override
			public int compare(Nominados o1, Nominados o2) {
				
				return o1.getCantidadMedallasPlataFemenino() - o2.getCantidadMedallasPlataFemenino();
				
			}
		});
	}
	public void sortNominadosBronceMujeres() {
		Collections.sort(nominados, new Comparator<Nominados>() {
			@Override
			public int compare(Nominados o1, Nominados o2) {
				
				return o1.getCantidadMedallasBronceFemenino() - o2.getCantidadMedallasBronceFemenino();
				
			}
		});
	}
	
	public void sortByClaseAnonima() {
		
		Collections.sort(nominados, new Comparator<Nominados>() {
			
			@Override
			
			public int compare (Nominados o1, Nominados o2) {
				
				return o1.getNombrePais().compareTo(o2.getNombrePais());
				
			}
			
		});
			
				
		
	}
	
	public void sortCompareNombres() {
		Collections.sort(nominados, new Comparator<Nominados>() {
			
			@Override
			public int compare(Nominados o1, Nominados o2) {
				return o2.getNombrePais().compareTo(o1.getNombrePais());
			}
			
		});
	}
	
	
	

}
