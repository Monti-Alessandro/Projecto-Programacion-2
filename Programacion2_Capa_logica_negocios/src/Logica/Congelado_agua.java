package Logica;

import java.util.Scanner;

public class Congelado_agua extends proCongelado{

	int salinidad;
	
	public Congelado_agua(Scanner scanner) {
		super();
		this.cod_producto = Helper.getInteger("Ingreasar codigo del producto");
		System.out.println("ingresar descripcion del producto");
		
		this.descripcion = scanner.next();
		
		System.out.println("Ingresar fecha de vencimiento, en formato dia/mes/año");
		this.fecha_venc = scanner.next();
		
		this.cost_tratamiento = Helper.getInteger("ingresar coste del tratamiento del producto");

		this.salinidad=Helper.getInteger("Ingreasar gramos de sal por litro de agua");
	}

	public int getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}
	
	
}
