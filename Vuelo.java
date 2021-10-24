import java.util.ArrayList; 

public class Vuelo{
	
	ArrayList<Seccion> secciones = new ArrayList<>();
	
	public String aerolinea;
	public String origen;
	public String destino;
	public int anio;
	public int mes;
	public int dia;
	public String idVuelo;

		
	public Vuelo(){}
	
	public Vuelo(String aerolinea,String origen, String destino,int anio,int mes,int dia,String idVuelo){
		this.aerolinea = aerolinea;
		this.origen = origen;
		this.destino = destino;
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
		this.idVuelo = idVuelo;
		secciones = new ArrayList<Seccion>();
	}
	
	public boolean equals(Object ob){
		Vuelo v = (Vuelo) ob;
		if(v.idVuelo.equals(idVuelo) && v.aerolinea.equals(aerolinea)){
			return true;
		}else{
			return false;
		}
	}
	 
	
	public String toString(){
		String estado = "aerolinea: " + aerolinea + "," +
						"origen: " + origen + "," +
						"destino: " + destino + "," +
						"anio: " + anio + "," +
						"mes: " + mes + "," +
						"dia: " + dia + "," +
						"idVuelo: " + idVuelo;
		return estado;
	}
	
	
	
	
	
	
}