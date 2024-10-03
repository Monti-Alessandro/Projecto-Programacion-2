package Logica;
import java.util.Scanner;

public class Inicio {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Lote lote1 = new Lote();
		Añadirproducto(lote1, scanner);
		
		Mostrar(lote1, scanner);
	}
	
	public static void Añadirproducto(Lote lote, Scanner scanner) {
		int opcion;
		System.out.println("Ingresar opcion a realizar, 1 para añadir un producto Refrigerado");
		System.out.println("Ingresar opcion a realizar, 2 para añadir un producto Congelado");
		opcion=Helper.getInteger("Introducir opcion ===>");
		if (opcion==1) {
			proRefrigerado refrigerado_nuevo = new proRefrigerado(scanner);
			lote.getItem().add(refrigerado_nuevo);
		}
		
		if (opcion==2) {
			opcion=Helper.getInteger("Que tipo de elemento desea añadir? 1 por aire, 2 por agua, 3 por hidrogeno");
			switch(opcion) {
			case 1:
				Congelado_aire nuevo_aire = new Congelado_aire(scanner);
				lote.getItem().add(nuevo_aire);
				break;
			case 2:
				Congelado_agua nuevo_agua = new Congelado_agua(scanner);
				lote.getItem().add(nuevo_agua);
				break;
			case 3: 
				Congelado_hidrogeno nuevo_hidrogeno = new Congelado_hidrogeno(scanner);
				lote.getItem().add(nuevo_hidrogeno);
				break;
			
			}
		}
	}
	
	public static void Mostrar(Lote lote, Scanner scanner) {
		for (int i=0; i<lote.getItem().size(); i++) {
			System.out.println(lote.getItem().get(i).toString()+ " " +i);
		}
	}

	public static void Modificar(Lote lote, Scanner scanner, int posicion) {
		Object item = lote.getItem().get();
	}
}
