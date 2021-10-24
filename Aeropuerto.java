public class Aeropuerto{
	
	public String nombre;
	
	public Aeropuerto(){}
	
	public Aeropuerto(String nombre){
		this.nombre = nombre;
	}
	
	public boolean equals(Object ob){
        Aeropuerto a = (Aeropuerto)ob;
		if(this.nombre == (a.nombre)){
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