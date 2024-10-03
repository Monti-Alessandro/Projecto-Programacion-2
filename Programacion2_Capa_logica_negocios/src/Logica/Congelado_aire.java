package Logica;

import java.util.Scanner;

public class Congelado_aire extends proCongelado {
	int nitrogeno;
	int oxigeno;
	int carbono;
	int vapor_agua;
	
	public Congelado_aire(Scanner scanner) {
		super();
		this.cod_producto = Helper.getInteger("Ingreasar codigo del producto");
		System.out.println("ingresar descripcion del producto");
		
		this.descripcion = scanner.next();
		
		System.out.println("Ingresar fecha de vencimiento, en formato dia/mes/año");
		this.fecha_venc = scanner.next();
		
		this.cost_tratamiento = Helper.getInteger("ingresar coste del tratamiento del producto");

		this.nitrogeno=Helper.getInteger("Ingreasar porcentaje nitrogeno");
		this.oxigeno=Helper.getInteger("Ingreasar porcentaje oxigeno");
		this.carbono=Helper.getInteger("Ingreasar carbono");
		this.vapor_agua=Helper.getInteger("Ingreasar procentaje vapor agua");
	}

	public int getNitrogeno() {
		return nitrogeno;
	}

	public void setNitrogeno(int nitrogeno) {
		this.nitrogeno = nitrogeno;
	}

	public int getOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(int oxigeno) {
		this.oxigeno = oxigeno;
	}

	public int getCarbono() {
		return carbono;
	}

	public void setCarbono(int carbono) {
		this.carbono = carbono;
	}

	public int getVapor_agua() {
		return vapor_agua;
	}

	public void setVapor_agua(int vapor_agua) {
		this.vapor_agua = vapor_agua;
	}
	
	
}
