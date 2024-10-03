package Logica;
import java.util.ArrayList;
import java.util.Scanner;
public class Lote {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Object> item = new ArrayList();
	
	int nro_lote;
	String nombre_responsable;
	int legajo_responsable;
	String codigo_ubicacion;
	String fecha_creacion;
	
	public Lote() {
		
		this.nro_lote = Helper.getInteger("Ingresar numero del lote");
		
		System.out.println("Ingresar nombre del responsable");
		this.nombre_responsable = scanner.next();
		
		this.legajo_responsable =Helper.getInteger("Ingresar numero legajo del responsable");
		
		
		System.out.println("Ingresar codigo de ubicacion del lote");
		this.codigo_ubicacion = scanner.next();
		
		System.out.println("Ingresar fecha de creacion en formato dia/mes/año");
		this.fecha_creacion = fecha_creacion=scanner.next();
		
	}

	public ArrayList<Object> getItem() {
		return item;
	}

	public void setItem(ArrayList<Object> item) {
		this.item = item;
	}
	
	
}
