package model;

public class Nominados {
	
	private String nombrePais;

	private int cantidadMedallasOroHombre;
	
	private int cantidadMedallasPlataHombre;
	
	private int cantidadMedallasBronceHombre;

	private int cantidadMedallasOroFemenino;	
	
	private int cantidadMedallasPlataFemenino;
	
	private int cantidadMedallasBronceFemenino;

	public Nominados(String nombrePais, int cantidadMedallasOroHombre, int cantidadMedallasPlataHombre,
			int cantidadMedallasBronceHombre, int cantidadMedallasOroFemenino, int cantidadMedallasPlataFemenino,
			int cantidadMedallasBronceFemenino) {
		
		super();
		this.nombrePais = nombrePais;
		this.cantidadMedallasOroHombre = cantidadMedallasOroHombre;
		this.cantidadMedallasPlataHombre = cantidadMedallasPlataHombre;
		this.cantidadMedallasBronceHombre = cantidadMedallasBronceHombre;
		this.cantidadMedallasOroFemenino = cantidadMedallasOroFemenino;
		this.cantidadMedallasPlataFemenino = cantidadMedallasPlataFemenino;
		this.cantidadMedallasBronceFemenino = cantidadMedallasBronceFemenino;
	}

	/**
	 * @return the nombrePais
	 */
	public String getNombrePais() {
		return nombrePais;
	}

	/**
	 * @param nombrePais the nombrePais to set
	 */
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	/**
	 * @return the cantidadMedallasOroHombre
	 */
	public int getCantidadMedallasOroHombre() {
		return cantidadMedallasOroHombre;
	}

	/**
	 * @param cantidadMedallasOroHombre the cantidadMedallasOroHombre to set
	 */
	public void setCantidadMedallasOroHombre(int cantidadMedallasOroHombre) {
		this.cantidadMedallasOroHombre = cantidadMedallasOroHombre;
	}

	/**
	 * @return the cantidadMedallasPlataHombre
	 */
	public int getCantidadMedallasPlataHombre() {
		return cantidadMedallasPlataHombre;
	}

	/**
	 * @param cantidadMedallasPlataHombre the cantidadMedallasPlataHombre to set
	 */
	public void setCantidadMedallasPlataHombre(int cantidadMedallasPlataHombre) {
		this.cantidadMedallasPlataHombre = cantidadMedallasPlataHombre;
	}

	/**
	 * @return the cantidadMedallasBronceHombre
	 */
	public int getCantidadMedallasBronceHombre() {
		return cantidadMedallasBronceHombre;
	}

	/**
	 * @param cantidadMedallasBronceHombre the cantidadMedallasBronceHombre to set
	 */
	public void setCantidadMedallasBronceHombre(int cantidadMedallasBronceHombre) {
		this.cantidadMedallasBronceHombre = cantidadMedallasBronceHombre;
	}

	/**
	 * @return the cantidadMedallasOroFemenino
	 */
	public int getCantidadMedallasOroFemenino() {
		return cantidadMedallasOroFemenino;
	}

	/**
	 * @param cantidadMedallasOroFemenino the cantidadMedallasOroFemenino to set
	 */
	public void setCantidadMedallasOroFemenino(int cantidadMedallasOroFemenino) {
		this.cantidadMedallasOroFemenino = cantidadMedallasOroFemenino;
	}

	/**
	 * @return the cantidadMedallasPlataFemenino
	 */
	public int getCantidadMedallasPlataFemenino() {
		return cantidadMedallasPlataFemenino;
	}

	/**
	 * @param cantidadMedallasPlataFemenino the cantidadMedallasPlataFemenino to set
	 */
	public void setCantidadMedallasPlataFemenino(int cantidadMedallasPlataFemenino) {
		this.cantidadMedallasPlataFemenino = cantidadMedallasPlataFemenino;
	}

	/**
	 * @return the cantidadMedallasBronceFemenino
	 */
	public int getCantidadMedallasBronceFemenino() {
		return cantidadMedallasBronceFemenino;
	}

	/**
	 * @param cantidadMedallasBronceFemenino the cantidadMedallasBronceFemenino to set
	 */
	public void setCantidadMedallasBronceFemenino(int cantidadMedallasBronceFemenino) {
		this.cantidadMedallasBronceFemenino = cantidadMedallasBronceFemenino;
	}
	
	public int compararNumMedallasOroHombre(Nominados other) {
		int result = 0;
		if (this.cantidadMedallasOroHombre < other.getCantidadMedallasOroHombre()) {
			result = -1;
		}else if (this.cantidadMedallasOroHombre > other.getCantidadMedallasOroHombre()) {
			result = 1;
		}
		return result;		
	}
	public int compararNumMedallasPlataHombre(Nominados other) {
		int result = 0;
		if (this.cantidadMedallasPlataHombre < other.getCantidadMedallasPlataHombre()) {
			result = -1;
		}else if (this.cantidadMedallasPlataHombre > other.getCantidadMedallasPlataFemenino()) {
			result = 1;
		}
		return result;		
	}
	public int compararNumMedallasBronceHombre(Nominados other) {
		int result = 0;
		if (this.cantidadMedallasBronceHombre < other.getCantidadMedallasBronceHombre()) {
			result = -1;
		}else if (this.cantidadMedallasBronceHombre > other.getCantidadMedallasBronceHombre()) {
			result = 1;
		}
		return result;		
	}
	public int compararNumMedallasOroMujer(Nominados other) {
		int result = 0;
		if (this.cantidadMedallasOroFemenino < other.getCantidadMedallasOroFemenino()) {
			result = -1;
		}else if (this.cantidadMedallasOroFemenino > other.getCantidadMedallasOroFemenino()) {
			result = 1;
		}
		return result;		
	}
	public int compararNumMedallasPlataMujer(Nominados other) {
		int result = 0;
		if (this.cantidadMedallasPlataFemenino < other.getCantidadMedallasPlataFemenino()) {
			result = -1;
		}else if (this.cantidadMedallasPlataFemenino > other.getCantidadMedallasPlataFemenino()) {
			result = 1;
		}
		return result;		
	}
	public int compararNumMedallasBronceMujer(Nominados other) {
		int result = 0;
		if (this.cantidadMedallasBronceFemenino < other.getCantidadMedallasBronceFemenino()) {
			result = -1;
		}else if (this.cantidadMedallasBronceFemenino > other.getCantidadMedallasBronceFemenino()) {
			result = 1;
		}
		return result;		
	}
	
	public int compareTo(Nominados other) {
		int result = 0;
		
		result = this.nombrePais.compareTo(other.nombrePais);		
		
		
		return result;
	}
	
	@Override
	public String toString() {
		return nombrePais + ";" + cantidadMedallasOroHombre + ";" + cantidadMedallasPlataHombre + ";" + cantidadMedallasBronceHombre + cantidadMedallasOroFemenino + ";" + cantidadMedallasPlataFemenino + ";" + cantidadMedallasBronceFemenino;
	}
	

}
