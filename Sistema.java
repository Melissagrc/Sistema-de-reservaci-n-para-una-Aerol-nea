import java.util.ArrayList; 

public class Sistema{
		
	public static ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
	public static ArrayList<Aerolinea> aerolineas = new ArrayList<>();
	public static ArrayList<Vuelo> vuelos = new ArrayList<>();
	public static ArrayList<Seccion> secciones = new ArrayList<>();
	
	
	public Sistema(){}
	
	//métodos
	
	public static void creaAeropuerto(String nombre)throws AeropuertoInvalidoException,AeropuertoExistenteException{
		Aeropuerto a = new Aeropuerto(nombre);
		int length = nombre.length();
		
		if(length !=3 ){
			throw new AeropuertoInvalidoException("ERROR:Debe de llevar 3 caracteres");
		}else{
			if(aeropuertos.contains(a)){
				throw new AeropuertoExistenteException("ERROR:El aeropuerto " + a.nombre + " ya existe"); //excepcion por si ya existe 
			}else{
				System.out.println("Creando el aeropuerto: " + a);
				aeropuertos.add(a);
			}
		}
	}
	
	public static void creaAerolinea(String nombre)throws AerolineaInvalidaException,AerolineaExistenteException{
		Aerolinea ae = new Aerolinea(nombre);
		
		if(nombre.length() > 6 ){
			throw new AerolineaInvalidaException("ERROR:Debe llevar al menos 6 caracteres");
		}else{
			if(aerolineas.contains(ae)){
				throw new AerolineaExistenteException("ERROR:La aerolinea " + ae.nombre + " ya existe"); //excepcion por si ya existe 
			}else{
				System.out.println("Creando la aerolinea: " + ae);
				aerolineas.add(ae);
			}
		}
	} 
	
	public static void creaVuelo(String aerolinea,String origen, String destino,int anio,int mes,int dia,String idVuelo)throws VueloExistenteException{
		Vuelo v = new Vuelo(aerolinea,origen,destino,anio,mes,dia,idVuelo);
			if(vuelos.contains(v)){
				throw new VueloExistenteException("ERROR:El vuelo de la aerolinea " +v.aerolinea+ " con origen " + v.origen + " con el id: " + v.idVuelo + " ya existe");
			}else{
				vuelos.add(v);
				System.out.println(v);
			}
	}
	
	public static void creaSeccion(String aerolinea,String idVuelo,int renglones,int columnas,String seccion){
		Seccion s = new Seccion(aerolinea,idVuelo,renglones,columnas,seccion);
		
			if(secciones.contains(s)){
				System.out.println("La aerolinea " + s.aerolinea + " con el id " + s.idVuelo + " en la seccion "+s.seccion+" ya existe");
			}else{
				secciones.add(s);
				System.out.println(s);
			}	
	}
	
	public static void encuentraVuelosDisponibles(String origen,String destino){
        for(Vuelo v: vuelos){
            if(v.origen==origen && v.destino==destino){
                System.out.println("Vuelo encontrado " + v);
            }else{
                //System.out.println("ERROR:No hay vuelos disponibles de " + origen + " a " + destino);
            }
        }                        
    }
	
	public static void encuentraVuelosDisponibles(String origen,String destino,int anio,int mes,int dia){
		for(Vuelo v:vuelos){
			 if(v.origen==origen && v.destino==destino && v.anio==anio && v.mes==anio && v.dia==anio){
                System.out.println("Vuelo encontrado " + v);
            }else{
                //System.out.println("ERROR:No hay vuelos");
            }
		}
	}
	
	public static void despliegaDetallesSistema(){
	
		System.out.println("\nImprimiendo detalles de aeropuertos");
		for(Aeropuerto a: aeropuertos){
			System.out.println(a);
		}
		System.out.println("\nImprimiendo detalles de aerolinea");
		for(Aerolinea ae: aerolineas){
			System.out.println(ae);
		}
		System.out.println("\nImprimiendo detalles de vuelos");
		for(Vuelo v: vuelos){
			System.out.println(v);
		}
		
		System.out.println("\nImprimiendo detalles de secciones");
		for(Seccion s: secciones){
			System.out.println(s);
		}
		
	}

	/*public static Asiento reservarAsiento(int columnas){        
        for(Asiento as: asientos){
            if(as.id.equals(idVuelo)){
                if(a.disponible==true){
                    a.disponible=false;
                    System.out.println("encontrado asiento "+a+" y reservandolo");                    
                    return a;                    
                }else{
                    System.out.println("Asiento ya reservado");
                    System.out.println("Asiento ya reservado");
                }
            }
        }
        return null;       
    }*/
	
	
	
	
	
	
	
	
	
	
	
	
}