package Logica;

import java.util.Scanner;

public class proRefrigerado extends Producto{

	int cod_supervision;
	String fecha_envas;
	String granja_origen;
	int cantidad;
	
	
	public proRefrigerado(Scanner scanner) {
		super();
		
		this.cod_producto = Helper.getInteger("Ingreasr codigo del producto");
		this.cod_supervision=Helper.getInteger("Ingresar codigo de supervision");
		
		System.out.println("ingresar descripcion del producto");
		this.descripcion = scanner.next();
		
		System.out.println("Ingresar granja origen");
		this.granja_origen = scanner.next();
		
		
		System.out.println("Ingresar fecha de vencimiento, en formato dia/mes/año");
		this.fecha_venc = scanner.next();
		System.out.println("Ingresar fecha de envasado, en formato dia/mes/año");
		this.fecha_envas = scanner.next();
		
		
		this.cost_tratamiento = Helper.getInteger("ingresar coste del tratamiento del producto");
		this.cantidad = Helper.getInteger("Ingresar cantidad total de productos");

	}


	public int getNro_lote() {
		return nro_lote;
	}


	public void setNro_lote(int nro_lote) {
		this.nro_lote = nro_lote;
	}


	public int getCod_producto() {
		return cod_producto;
	}


	public void setCod_producto(int cod_producto) {
		this.cod_producto = cod_producto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getFecha_venc() {
		return fecha_venc;
	}


	public void setFecha_venc(String fecha_venc) {
		this.fecha_venc = fecha_venc;
	}


	public int getCost_tratamiento() {
		return cost_tratamiento;
	}


	public void setCost_tratamiento(int cost_tratamiento) {
		this.cost_tratamiento = cost_tratamiento;
	}


	public int getCod_supervision() {
		return cod_supervision;
	}


	public void setCod_supervision(int cod_supervision) {
		this.cod_supervision = cod_supervision;
	}


	public String getFecha_envas() {
		return fecha_envas;
	}


	public void setFecha_envas(String fecha_envas) {
		this.fecha_envas = fecha_envas;
	}


	public String getGranja_origen() {
		return granja_origen;
	}


	public void setGranja_origen(String granja_origen) {
		this.granja_origen = granja_origen;
	}
	

}
