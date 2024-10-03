package Logica;

import java.util.Scanner;

public class Producto {
	int cod_producto;
	String descripcion;
	String fecha_venc;
	int nro_lote;
	int cost_tratamiento;
	
	
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
	public int getNro_lote() {
		return nro_lote;
	}
	public void setNro_lote(int nro_lote) {
		this.nro_lote = nro_lote;
	}
	public int getCost_tratamiento() {
		return cost_tratamiento;
	}
	public void setCost_tratamiento(int cost_tratamiento) {
		this.cost_tratamiento = cost_tratamiento;
	}
	
	@Override
	public String toString() {
		return "Producto [cod_producto=" + cod_producto + ", descripcion=" + descripcion + "]";
	}
	
	public void modificarBase(Scanner scanner) {
		System.out.println("Digite la opcion deseada:  ");
		System.out.println("1 codigo producto, 2 descripcion, 3 fecha vencimiento, 4 nro lote, 5 coste de tratamiento");
		int opcion= scanner.nextInt();
		scanner.nextLine();
		
		switch (opcion) {
			case 1:
				
				break;
			case 2:
				
				
				break;
		}
	}
	
}
