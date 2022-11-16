package Parcial3;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class JUANCAMILO { 
	static String alineacion [][]=new String [8][8];
	public static void main(String[] args) {
		String elegir;
		int cambio=0,  cambio1=0;
		String cambio2 = null;

		JOptionPane.showMessageDialog(null, "¡Bienvenido al torneo Futbol Azteca, Podrás formar parte del torneo mas importante!");
		int fut=Integer.parseInt(JOptionPane.showInputDialog("¿Quieres conocer los equipos? marca:"
				+"\n 1. Mostrar los equipos por elegir"
				+ "\n 2. Salir "));
		String francia[]= new String[]{" Areola 23"," Upamecano 13"," Saliba 3"," Badiashile 18"," Pavard 2"," Tchouameni 8"," Camavinga 6"," Coman 21"," Griezmann 7"," Mbappé 10"," Benzema 19"};
		String suplefran[]= new String[]{" Lloris 1"," Varane 4"," Dembélé 11"," Clauss 15"," Fofana 19", " Nkunku 12"};
		String brasil[]= new String[]{" Alisson 1"," Danilo 2"," Marquinhos 4"," Silva 3"," Telles 6"," Casemiro 5"," Fred 8"," Raphinha 19"," Neymar 10"," Paqueta 7","Richarlison 29"};
		String suplebra[]= new String[]{" Ederson 23"," Fabinho 15"," Firmino 24"," Antony 18"," Militao 14"," Vinicius 20"};
		String alemania[]= new String[]{" Ter Stegen 22"," Kehrer 5"," Sule 15"," Schlotterbeck 23"," Raum 3"," Kimmich 6"," Gündogan 21"," Hofmann 18"," Musiala 14"," Sané 19"," Havertz 7"};
		String suplealema[]= new String[]{" Trapp 12"," Müller 13"," Gnabry 10"," Werner 9"," Henrichs 16"," Arnold 8"};
		String argentina[]= new String[]{" Martinez E 23"," Molina 21"," Romero 13"," Otamendi 19"," Acuña 8"," De paul 7"," Paredes 5"," Lo Celso 20"," Messi 10"," Martínez L 22"," Di María 11"};
		String suplearge[]= new String[]{" Armani 1"," Álvarez 15"," Correa A. 9"," Correa J 16"," Tagliafico 3"," Musso 12"};
		String portugal[]= new String[]{" Diogo Costa 22"," Cancelo 20"," Pereira 13"," Pepe 3"," Mendes 2"," Fernandes 11"," Moutinho 8"," Otavio 16"," Ronaldo 7"," Diogo Jota 19"," Silva 10"};
		String supleportu[]= new String[]{" Patricio 1"," Nunes 18"," Carvalho 14"," Joao Felix 23"," Guerreiro 5"," Vitinha 4"};
		String inglaterra[]= new String[]{" Pope 1"," Stones 4"," Dier 5"," Maguire 6"," James 2"," Bellingham 8"," Rice 7"," Shaw 3"," Foden 11"," Kane 9"," Sterling 10"};
		String supleingla[]= new String[]{" Henderson 14"," Trippier 12"," Walker 15"," Abraham 23"," Mount 19"," Saka 18"};
		switch(fut) {
		case(1):
			int h= Integer.parseInt(JOptionPane.showInputDialog("Selecciona un número para conocer a los jugadores del equipo."
					+ "\n 1. Francia"
					+ "\n 2. Brasil"
					+ "\n 3. Alemania"
					+ "\n 4. Argentina"
					+ "\n 5. Portugal"
					+ "\n 6. Inglaterra"));
		switch(h) {
		case (1):	
			System.out.print( "\t Titulares Francia \n\n"+ Arrays.toString(francia)+ "\n\t Suplentes Francia \n\n"+ Arrays.toString(suplefran)+"\n");	
		fran(francia, suplefran);
		elegir = JOptionPane.showInputDialog("Desea escoger este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			franciacompleto(francia, suplefran , cambio, cambio1, cambio2);
			fran(francia, suplefran);
		}

		break;
		case (2):
			System.out.print( "\t Titulares Francia \n"+ Arrays.toString(brasil)+ "\n\n\t Suplentes Francia \n\n"+ Arrays.toString(suplebra)+"\n");
		bras(brasil, suplebra);
		elegir = JOptionPane.showInputDialog("Desea escoger este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			brasilcompleto(brasil, suplebra , cambio, cambio1,cambio2);
			bras(brasil, suplebra);
		}
		break;
		case (3):
			System.out.print( "\t Titulares Alemania \n"+ Arrays.toString(alemania)+ "\n\n\t Suplentes Alemania \n\n"+ Arrays.toString(suplealema)+"\n");
		alem(alemania, suplealema);
		elegir = JOptionPane.showInputDialog("Desea escoger este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			alemaniacompleto(brasil, suplebra , cambio, cambio1,cambio2);
			alem(brasil, suplebra);
		}
		break;
		case (4):
			System.out.print( "\t Titulares Argentina \n"+ Arrays.toString(argentina)+ "\n\n\t Suplentes Argentina \n\n"+ Arrays.toString(suplealema)+"\n");
		argent(argentina, suplearge);
		elegir = JOptionPane.showInputDialog("Desea escoger este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			argentinacompleto(brasil, suplearge , cambio, cambio1,cambio2);
			argent(brasil, suplebra);
		}
		break;
		case (5):
			System.out.print( "\t Titulares Portugal \n"+ Arrays.toString(portugal)+ "\n\n\t Suplentes Portugal  \n\n"+ Arrays.toString(suplealema)+"\n");
		port(portugal, supleportu);
		elegir = JOptionPane.showInputDialog("Desea escoger este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			portugalcompleto(portugal, supleportu , cambio, cambio1,cambio2);
			port(brasil, suplebra);
		}
		break;
		case (6):
			System.out.print( "\t Titulares Inglaterra \n"+ Arrays.toString(inglaterra)+ "\n\n\t Suplentes Inglaterra  \n\n"+ Arrays.toString(suplealema)+"\n");
		ingl(inglaterra, supleingla);
		elegir = JOptionPane.showInputDialog("Desea escoger este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			inglaterracompleto(brasil, supleingla , cambio, cambio1, cambio2);
			ingl(inglaterra, supleingla);
		}
		break;
		}
		break;
		}

	}
	public static void  fran (String francia[], String suplefran []){	
		System.out.println();
		System.out.println("Matriz jugadores alineados.");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < francia.length)
					alineacion[3][0]=francia[0]+" POR";
				alineacion[2][2]=francia[1]+" DF";
				alineacion[4][2]=francia[2]+" DF";
				alineacion[5][3]=francia[3]+" LA";
				alineacion[1][3]=francia[4]+" LI";
				alineacion[2][3]=francia[5]+" MCD";
				alineacion[4][4]=francia[6]+" MI";
				alineacion[5][5]=francia[7]+" MD";
				alineacion[1][5]=francia[8]+" EI";
				alineacion[2][4]=francia[9]+" DC";
				alineacion[4][5]=francia[10]+" ED";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}
				else {
					System.out.print(alineacion[i][j] + " ");

				}
			}
			System.out.println();
		}
	}	
	public static void bras(String brasil[], String suplebra []) {
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < brasil.length)
					alineacion[3][0]=brasil[0]+" POR";
				alineacion[1][2]=brasil[1]+" LI";
				alineacion[2][1]=brasil[2]+" DF";
				alineacion[4][1]=brasil[3]+" DF";
				alineacion[5][2]=brasil[4]+" LA";
				alineacion[3][1]=brasil[5]+" MCD";
				alineacion[2][4]=brasil[6]+" MI";
				alineacion[4][4]=brasil[7]+" MD";
				alineacion[0][7]=brasil[8]+" EI";
				alineacion[3][2]=brasil[9]+" DC";
				alineacion[6][7]=brasil[10]+" ED";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}		
	}
	public static void alem (String alemania[],  String suplealem[]) {
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < alemania.length)
					alineacion[3][0]=alemania[0]+" POR";
				alineacion[6][3]=alemania[1]+" LD";
				alineacion[2][3]=alemania[2]+" DF";
				alineacion[4][2]=alemania[3]+" DF";
				alineacion[0][3]=alemania[4]+" LI";
				alineacion[5][5]=alemania[5]+" MD";
				alineacion[1][5]=alemania[6]+" MI";
				alineacion[0][6]=alemania[7]+" EI";
				alineacion[3][3]=alemania[8]+" MCO";
				alineacion[6][6]=alemania[9]+" ED";
				alineacion[3][4]=alemania[10]+" DC";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}		
	}
	public static void argent(String argentina[], String supleargen []) {
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < argentina.length)
					alineacion[3][0]=argentina[0]+" POR";
				alineacion[6][3]=argentina[1]+"  LD";
				alineacion[2][3]=argentina[2]+"  DF";
				alineacion[4][3]=argentina[3]+"  DF";
				alineacion[0][3]=argentina[4]+"  LI";
				alineacion[1][6]=argentina[5]+"  MI";
				alineacion[3][2]=argentina[6]+"  MCD";
				alineacion[5][6]=argentina[7]+"  MD";
				alineacion[5][7]=argentina[8]+"  ED";
				alineacion[3][3]=argentina[9]+"  DC";
				alineacion[1][7]=argentina[10]+"  EI";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}	
	}
	public static void port(String portugal[], String supleportu []) {
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < portugal.length)
					alineacion[3][0]=portugal[0]+" POR";
				alineacion[6][4]=portugal[1]+"  LD";
				alineacion[2][3]=portugal[2]+" DF";
				alineacion[4][3]=portugal[3]+" DF";
				alineacion[0][4]=portugal[4]+" LI";
				alineacion[1][6]=portugal[5]+" MI";
				alineacion[3][1]=portugal[6]+" MCD";
				alineacion[5][6]=portugal[7]+" MD";
				alineacion[5][7]=portugal[8]+" ED";
				alineacion[3][2]=portugal[9]+" DC";
				alineacion[1][7]=portugal[10]+" EI";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}	
	}
	public static void ingl(String inglaterra[], String supleingla []) { 
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < inglaterra.length)
					alineacion[3][0]=inglaterra[0]+" POR";
				alineacion[5][3]=inglaterra[1]+" DFD";
				alineacion[3][1]=inglaterra[2]+" DFC";
				alineacion[1][3]=inglaterra[3]+" DFI";
				alineacion[0][6]=inglaterra[4]+" CAI";
				alineacion[2][6]=inglaterra[5]+" MD";
				alineacion[4][6]=inglaterra[6]+" MI";
				alineacion[6][6]=inglaterra[7]+" CAD";
				alineacion[5][6]=inglaterra[8]+" ED";
				alineacion[3][4]=inglaterra[9]+" DC";
				alineacion[1][6]=inglaterra[10]+" EI";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}	
	}

	public static void franciacompleto(String francia[], String suplefran [],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<francia.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+francia[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<suplefran.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+suplefran[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			suplefran[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<francia.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+francia[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplefran.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplefran[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<francia.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+francia[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplefran.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplefran[k]+"\n");	
			}
		}
		break;
		}
		//int contadorsuplencia=0;//
		///while(contadorsuplencia<=3){///
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			francia[cambio-1]=suplefran[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<francia.length;k++) {
				System.out.print((k+1)+")"+francia[k]+"\n");			
			}
			//contadorsuplencia++;//
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<francia.length;k++) {
			System.out.print((k+1)+")"+francia[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<suplefran.length;k++) {
			System.out.print((k+1)+")"+suplefran[k]+"\n");	
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<francia.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+francia[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		francia[capitan-1]=francia[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<francia.length;k++) {
			System.out.print((k+1)+")"+francia[k]+"\n");			
		}
	}
	public static void brasilcompleto(String brasil[], String suplebra [], int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<brasil.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+brasil[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<suplebra.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+suplebra[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			suplebra[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<brasil.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+brasil[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplebra.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplebra[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<brasil.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+brasil[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplebra.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplebra[k]+"\n");	
			}
		}
		break;
		}
		//int contadorsuplencia=0;//
		///while(contadorsuplencia<=3){///
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			brasil[cambio-1]=suplebra[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<brasil.length;k++) {
				System.out.print((k+1)+")"+brasil[k]+"\n");			
			}
			//contadorsuplencia++;//
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<brasil.length;k++) {
			System.out.print((k+1)+")"+brasil[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<suplebra.length;k++) {
			System.out.print((k+1)+")"+suplebra[k]+"\n");	
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<brasil.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+brasil[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		brasil[capitan-1]=brasil[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<brasil.length;k++) {
			System.out.print((k+1)+")"+brasil[k]+"\n");			
		}
	}
	public static void alemaniacompleto(String alemania[], String suplealema [],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<alemania.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+alemania[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<suplealema.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+suplealema[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			suplealema[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<alemania.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+alemania[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplealema.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplealema[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<alemania.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+alemania[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplealema.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplealema[k]+"\n");	
			}
		}
		break;
		}
		//int contadorsuplencia=0;//
		///while(contadorsuplencia<=3){///
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			alemania[cambio-1]=suplealema[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<alemania.length;k++) {
				System.out.print((k+1)+")"+alemania[k]+"\n");			
			}
			//contadorsuplencia++;//
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<alemania.length;k++) {
			System.out.print((k+1)+")"+alemania[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<suplealema.length;k++) {
			System.out.print((k+1)+")"+suplealema[k]+"\n");	
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<alemania.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+alemania[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		alemania[capitan-1]=alemania[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<alemania.length;k++) {
			System.out.print((k+1)+")"+alemania[k]+"\n");			
		}
	}
	public static void argentinacompleto(String argentina[], String suplearge [],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<argentina.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+argentina[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<suplearge.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+suplearge[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			suplearge[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<argentina.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+argentina[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplearge.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplearge[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<argentina.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+argentina[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplearge.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplearge[k]+"\n");	
			}
		}
		break;
		}
		//int contadorsuplencia=0;//
		///while(contadorsuplencia<=3){///
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			argentina[cambio-1]=suplearge[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<argentina.length;k++) {
				System.out.print((k+1)+")"+argentina[k]+"\n");			
			}
			//contadorsuplencia++;//
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<argentina.length;k++) {
			System.out.print((k+1)+")"+argentina[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<suplearge.length;k++) {
			System.out.print((k+1)+")"+suplearge[k]+"\n");	
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<argentina.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+argentina[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		argentina[capitan-1]=argentina[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<argentina.length;k++) {
			System.out.print((k+1)+")"+argentina[k]+"\n");			
		}
	}
	public static void portugalcompleto(String portugal[], String supleportu [],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<portugal.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+portugal[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<supleportu.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+supleportu[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			supleportu[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<portugal.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+portugal[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<supleportu.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+supleportu[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<portugal.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+portugal[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<supleportu.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+supleportu[k]+"\n");	
			}
		}
		break;
		}
		//int contadorsuplencia=0;//
		///while(contadorsuplencia<=3){///
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			portugal[cambio-1]=supleportu[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<portugal.length;k++) {
				System.out.print((k+1)+")"+portugal[k]+"\n");			
			}
			//contadorsuplencia++;//
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<portugal.length;k++) {
			System.out.print((k+1)+")"+portugal[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<supleportu.length;k++) {
			System.out.print((k+1)+")"+supleportu[k]+"\n");	
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<portugal.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+portugal[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		portugal[capitan-1]=portugal[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<portugal.length;k++) {
			System.out.print((k+1)+")"+portugal[k]+"\n");			
		}
	}
	public static void inglaterracompleto(String inglaterra[], String supleingla[],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<inglaterra.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+inglaterra[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<supleingla.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+supleingla[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			supleingla[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<inglaterra.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+inglaterra[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<supleingla.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+supleingla[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<inglaterra.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+inglaterra[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<supleingla.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+supleingla[k]+"\n");	
			}
		}
		break;
		}
		//int contadorsuplencia=0;//
		///while(contadorsuplencia<=3){///
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			inglaterra[cambio-1]=supleingla[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<inglaterra.length;k++) {
				System.out.print((k+1)+")"+inglaterra[k]+"\n");			
			}
			//contadorsuplencia++;//
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<inglaterra.length;k++) {
			System.out.print((k+1)+")"+inglaterra[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<supleingla.length;k++) {
			System.out.print((k+1)+")"+supleingla[k]+"\n");	
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<inglaterra.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+inglaterra[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		inglaterra[capitan-1]=inglaterra[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<inglaterra.length;k++) {
			System.out.print((k+1)+")"+inglaterra[k]+"\n");			
		}
	}

}






