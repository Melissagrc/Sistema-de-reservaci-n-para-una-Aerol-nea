import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args)throws IOException{
		
		Sistema s1 = new Sistema();
		try{
			System.out.println("Creamos los aeropuertos\n");
			Sistema.creaAeropuerto("AER");
			Sistema.creaAeropuerto("ASI");
			Sistema.creaAeropuerto("WES");  
			Sistema.creaAeropuerto("BIO");   
			Sistema.creaAeropuerto("JPN"); 
			Sistema.creaAeropuerto("DEH");   

				try{
					Sistema.creaAeropuerto("AER");//invalido(duplicado)
				}
				catch( AeropuertoExistenteException p){
					System.out.println(p.getMessage());
				}
				try{
					Sistema.creaAeropuerto("DE");  //invalido (2 caracteres)   
					Sistema.creaAeropuerto("HBTT");//invalido(4 caracteres)
				}
				catch(AeropuertoInvalidoException a){
					System.out.println(a.getMessage());
				}
		}
		catch( AeropuertoInvalidoException c ) {
            System.out.println(c.getMessage());
        } 
		catch( AeropuertoExistenteException h){
            System.out.println(h.getMessage());
        }
		
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------");
		
		try{
			System.out.println("Creamos las aerolineas\n");
		
			Sistema.creaAerolinea("VARIAL");
			Sistema.creaAerolinea("WEST");   
			Sistema.creaAerolinea("AMER");   
			Sistema.creaAerolinea("COAST");    
			Sistema.creaAerolinea("FTRE");
				try{
					Sistema.creaAerolinea("GLOBALITY"); //inválido (7 caracteres) 
					Sistema.creaAerolinea("AERPOST"); //inválido (7 caracteres) 
				}
				catch(AerolineaInvalidaException t){
					System.out.println(t.getMessage());
				}
				try{
					Sistema.creaAerolinea("VARIAL");//inválido (duplicado)  
				}
				catch(AerolineaExistenteException c){
					System.out.println(c.getMessage());
				}
		}
		catch(AerolineaInvalidaException t){
			System.out.println(t.getMessage());
		}
		catch(AerolineaExistenteException c){
			System.out.println(c.getMessage());
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------");
		
		try{
			System.out.println("Creamos los vuelos\n");
		
			Sistema.creaVuelo("VARIAL","CDMX","LON",2019,05,03,"129");
			Sistema.creaVuelo("COAST", "EUA", "FRA", 2020, 8, 8, "567"); 
			Sistema.creaVuelo("WEST","CDMX","COL",2020,03,23,"123");
			Sistema.creaVuelo("COAST","EUA", "LON", 2020, 10, 10, "122");  
			
				try{
					Sistema.creaVuelo("COAST", "EUA", "CDMX", 2020, 9, 8, "567"); //inválido si se repite (aerolinea,origen y idVuelo) 
				}
				catch(VueloExistenteException h){
					System.out.println(h.getMessage());
				}
					Sistema.creaVuelo("FTRE", "LON", "DEN", 2020, 5, 7, "909");      
					Sistema.creaVuelo("AMER", "LON", "COL", 2019, 10, 1, "128"); 
				try{
					Sistema.creaVuelo("FTRE", "COL", "FRA", 2020, 1, 12, "909"); //invalido(id duplicado y aerolinea)
				}
				catch(VueloExistenteException h){
					System.out.println(h.getMessage());
				}
		}
		catch(VueloExistenteException h){
			System.out.println(h.getMessage());
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------");
		
		System.out.println("Creamos las secciones\n");
		
		Sistema.creaSeccion("VARIAL","122",2,2,"turista");
		Sistema.creaSeccion("WEST","123",1,2,"negocios");
		Sistema.creaSeccion("COAST","124",1,1,"economica");
		Sistema.creaSeccion("WEST","123",2,4,"negocios");//invalido(se repite la aerolinea,idVuelo y la seccion)
			
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------");
		System.out.println("Despliegue de detalles del programa");
		Sistema.despliegaDetallesSistema();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------");
		
		System.out.println("Buscamos vuelos disponibles\n");
		Sistema.encuentraVuelosDisponibles("EUA", "LON");
		Sistema.encuentraVuelosDisponibles("EUA", "FRA");
		Sistema.encuentraVuelosDisponibles("CDMX", "COL");
		Sistema.encuentraVuelosDisponibles("EUA", "NYC");//no hay vuelos de este destino a este origen
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------");
		
		System.out.println("Buscamos vuelos disponibles por fecha\n");
		Sistema.encuentraVuelosDisponibles("CDMX", "COL", 2020, 03,23); 
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------");
		System.out.println("Despliegue de detalles del programa");
		Sistema.despliegaDetallesSistema();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------");
		System.out.println("Buscamos vuelos disponibles");
		Sistema.encuentraVuelosDisponibles("EUA", "FRA");
 
 
		
		
	}
	
}