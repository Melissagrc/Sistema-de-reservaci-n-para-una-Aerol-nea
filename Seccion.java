import java.util.ArrayList; 
 
public class Seccion{
	
	public String aerolinea;
	public String idVuelo;
	public String seccion;
	public int renglones;
	public int columnas;
	public char columna;

	ArrayList<Asiento> asientos = new ArrayList<>();
	
	public Seccion(){}
	
	public Seccion(String aerolinea,String idVuelo,int renglones,int columnas,String seccion){
		this.aerolinea = aerolinea;
		this.idVuelo = idVuelo;
		this.renglones = renglones;
		this.columnas = columnas;
		this.seccion = seccion;
		asientos = new ArrayList<>();
	}
	
	public void hayAsientosDisponibles(){		
	}
	
	public Asiento reservaAsiento(String aerolinea,String idVuelo,String seccion,int renglon,char columna){
		boolean bandera = false;
		for(Asiento as: asientos){
			if(seccion.equals(as)){
				if(as.disponible==true){
					as.disponible = false;
					bandera = true;
					return as;
				}else{
					bandera = true;
					System.out.println("ERROR:el asiento " + columna + " ya esta reservado\n");
					return null;
				}
			}
		}
		if(bandera==false){
			System.out.println("ERROR:el asiento " + columna + " no existe\n");
			return null;
		}
		return null;
	}
	
	public boolean equals(Object objt){
		Seccion s = (Seccion) objt;
		if(s.aerolinea.equals(aerolinea) && s.idVuelo.equals(idVuelo) && s.seccion.equals(seccion)){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		String estado =	"aerolinea: " + aerolinea + "," +
						"idVuelo: " + idVuelo + "," +
						"renglones: " + renglones + "," +
						"columnas: " + columnas + "," +
						"seccion: " + seccion;
						
		return estado;
	}
	
}