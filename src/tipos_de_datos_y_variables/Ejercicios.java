package tipos_de_datos_y_variables;

public class Ejercicios {

	public static void main(String[] args) {
		// Todo lo que esté dentro de estas llaves es lo que va a leer nuestro programa
		
	//System.out.println("Hola mundo");
	
	//Tipos de datos
		//byte: sirve para representar un valor numérico de 8 bits
		
	
	//Cine Java
	byte salas = 10;
	System.out.println(salas);
	
	//short: sirve para representrar un valor numérico de 16 bits
	short asientos = 1120;
	System.out.println(asientos);
	
	//int: sirve para almacenar un valor numérico de 32 bits
	int dulces = 3476;
	System.out.println(dulces);
	
	// long sirve para representar un valor numérico 64 bits
	
	long clientes = 313600l;
	System.out.println(clientes);
	
	
	//datos que pueden tener punto decimal
	
	//float: sirve para almacenar un valor numérico de 32 bits
	
	float palomitas = 35.5f;
	System.out.println(palomitas);
	
	//double: Sirve para representar un valor numérico de 64 bits
	
	double ganancia = 23770880.7d;
	System.out.println(ganancia);
	
	
	
	//boolean Sirve para representar valores booleanos y solamente tienen dos salidas, verdadero o falso
	//char Sirve para representar un carácter o un número (pero solamente uno)
	
	//casting o cateo Sirve para realizar una conversión de tipos de datos a uno más grande o más pequeño, o incluso diferente
	
	double num = 59.7d;
	//casteo a entero
	int numInt = (int) num; //que lo pase a un número entero hacia abajo
	System.out.println("double" + numInt); //Dará como resultado 59
	
	long numlong = (long) num;
	System.out.println("long" + numlong);
	
	String cantidad = "85";
	String precio = "59.7";
	int cantEntero = Integer.parseInt(cantidad); //Se cambia de un string a un número entero (Integer) 
	double precioDouble = Double.parseDouble(precio);
	//vamos a cambiar el precio a número
	System.out.println("El valor de la compra es: " + (cantEntero * precioDouble)); //Aquí realizamos la operación
	
	
	//operadores aritméticos
	
	int dias = 28;
	dias = dias / 2;
	System.out.println("días: " + dias);
	
	
	//operadores de incremento y decremento
	
	int p = 0;
	p++;
	p++;
	p++;
	System.out.println(p);
	
	/*
	 Operadores relacionales
	 == se compara si un operando es igual a otro
	 !0 diferente a
	 < mayor que
	 > menor que
	 <= mayor o igual
	 >= menor o igual
	 */
	
	int a = 10;
	int b = 15;
	boolean resultado;
	resultado = a == b;
	System.out.println("El resultado de la opración es: " + resultado);
	
	int c = 10;
	int d = 15;
	boolean resultado2;
	resultado2 = c != d;
	System.out.println("El resultado de la opración es: " + resultado2);

	
	
	
	
	
	
	
	


	}

}
