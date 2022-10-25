package Quiz;

import javax.swing.JOptionPane;

public class quiz1 {

	public static void main(String[] args) {
		int numero=0,n1 = 0,menor = 0,raiz = 0, exponente=0,n2=0;
		
		String operacion=JOptionPane.showInputDialog("Seleccione la operacion que desea realizar"
				+ "\n a. Ver el numero mayor"
				+ "\n b. Ver el numeor menor"
				+ "\n c. Calcular la raiz cuadrada"
				+ "\n d. Elevar a una potencia"
				+ "\n f. Salir");
		switch(operacion){
		case "a":
			mayor(n1,n2);
			break;
		case "b":
			menor(menor,n2);
			break;
		case "c":
			Raiz(numero,raiz);
			break;	
		case "d":
			Potencia(numero, exponente);
			break;	
		case "f":
			JOptionPane.showMessageDialog(null, "Hasta la proxima");
			break;	
		}
	}

	public static void mayor (int n1, int n2) {
		n1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer dato"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo dato"));
		
		if (n1<n2) {
			JOptionPane.showMessageDialog(null, "El numero mayor es:"+n2);
		}
		else if (n2<n1) {
			JOptionPane.showMessageDialog(null, "El numero mayor es:"+n1);
		}
		}
	
	public static void menor (int n1, int n2) {
		
		n1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer dato"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo dato"));
		
		if (n1>n2) {
			JOptionPane.showMessageDialog(null, "El numero menor es:"+n2);
		}
		else if (n2>n1) {
			JOptionPane.showMessageDialog(null, "El numero menor es:"+n1);
		}
		}
	public static void Raiz (int numero, int raiz) {
		 numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para calcular la raiz cuadrada:"));
		 
		 raiz = (int) (Math.sqrt(numero));
		 
		JOptionPane.showMessageDialog(null, "La raiz cuadrada de "+numero+" es: "+raiz);
	}
	public static void Potencia (int numero, int exponente) {
		numero =Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base de la potencia:"));
		
		exponente =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el exponente al cual deseas elevar la base:"));
		
		int potencia = (int) (Math.pow(numero, exponente));
		
	    JOptionPane.showMessageDialog(null, numero+"elevado a la potencia de "+exponente+" es:"+potencia);
	}
	}