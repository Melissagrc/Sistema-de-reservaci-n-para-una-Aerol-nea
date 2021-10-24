import java.util.ArrayList; 

public class Asiento{
		
	public String id;
	public boolean disponible;
	
	public Asiento(){}

	
	public Asiento(String id,boolean disponible){
		this.id = id;
		this.disponible = disponible;	
	}
	

	public String toString(){
		char estadoAsiento = 'D';
		if(disponible==true){
			estadoAsiento = 'D';
		}else{
			estadoAsiento = 'R';
		}
		String estado = id + "-" + estadoAsiento;
		return estado;	
	}
	
	
}
	
	
	

