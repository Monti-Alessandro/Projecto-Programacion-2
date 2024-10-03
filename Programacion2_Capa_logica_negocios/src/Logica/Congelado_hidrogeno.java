package Logica;

import java.util.Scanner;

public class Congelado_hidrogeno extends proCongelado{

	int tiempo_exposicion_s;
	String Descripcion;
	
	public Congelado_hidrogeno(Scanner scanner) {
		super();
		this.cod_producto = Helper.getInteger("Ingreasar codigo del producto");
		System.out.println("ingresar descripcion del producto");
		
		this.descripcion = scanner.next();
		
		System.out.println("Ingresar fecha de vencimiento, en formato dia/mes/año");
		this.fecha_venc = scanner.next();
		
		this.cost_tratamiento = Helper.getInteger("ingresar coste del tratamiento del producto");
		
		this.tiempo_exposicion_s=Helper.getInteger("ingresar tiempo de exposicion en segundos");
		
		System.out.println("Ingresar Descripcion del proceso de hidrogeno");
		this.Descripcion = scanner.next();

	}

	public int getTiempo_exposicion_s() {
		return tiempo_exposicion_s;
	}

	public void setTiempo_exposicion_s(int tiempo_exposicion_s) {
		this.tiempo_exposicion_s = tiempo_exposicion_s;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
