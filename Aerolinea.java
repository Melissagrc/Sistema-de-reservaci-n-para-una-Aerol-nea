import java.util.ArrayList; 

public class Aerolinea{
	
	ArrayList<Vuelo> vuelos = new ArrayList<>();
	
	public String nombre;
	
	
	public Aerolinea(){}
	
	public Aerolinea(String nombre){
		this.nombre = nombre;
		vuelos = new ArrayList<Vuelo>();
	}
	
	public boolean equals(Object obj){
		Aerolinea ae = (Aerolinea) obj;
		if(ae.nombre.equals(nombre)){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		String estado = nombre;
		return estado;
	}
	
	
	
}