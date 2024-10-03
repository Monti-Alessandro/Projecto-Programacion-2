package Presentacion;

import java.util.Scanner;

public class Presentacion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean salir= false;
		
		while(!salir) {
			System.out.println("Menú  de opciones: ");
			System.out.println("1.Agregar nuevo producto al lote");
			System.out.println("2.Modificar los datos de un producto determinado");
			System.out.println("3.Costo total de un producto determinado");
			System.out.println("4.Margen de ganancia de un lote determinado");
			System.out.println("5.Cantidad de productos en cada lote");
			System.out.println("6.Cantidad de productos de un determinado tipo en cada lote");
			System.out.println("7.Verificar y eliminar productos vencidos en un lote");
			System.out.println("8.Mostrar la etiqueta del producto “Nombre del Producto, Nro de Lote y Fecha de Vencimiento");
			System.out.println("9.Salir");
			
			System.out.println("Digite la opcion deseada:  ");
			int opcion= scanner.nextInt();
			scanner.nextLine();
			
			switch (opcion) {
				case 1:
					// agregar metodo para agregar nuevos productos al lote
				
				case 2:
					// metodo para modificar los datos de un producto
					
				case 3:
					System.out.println("El costo total del producto seleccionado es: "+ //metodo para seleccionar un producto determinado);
				case 4:
					System.out.println("El margen de ganancia del lote es: "+// metodo para la ganancia del lote);
				
				case 5:
					System.out.println("Cantidad de productos en el lote seleccionado: "+//metodo);
				case 6:	
					System.out.println("Cantidad de productos de ese tipo en el lote: "+// metodo);
				case 7:	
					//metodo para eliminar y verificar productos vencidos en un lote
				case 8:	
					//metodo para mostrar las etiquetas
				case 9:
					salir= true;
					break;
				

				default:
					System.out.println("Opción invlida");
				
			
			}
			
			
				
		}
		scanner.close();
	}
		
	
}

	


