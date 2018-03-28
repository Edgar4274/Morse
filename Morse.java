package modelo;
import java.util.Scanner;
import javax.print.DocFlavor.INPUT_STREAM;
public class Morse {
	public static void main(String[] args) {
		int opcion;
		String cadena;
		Scanner menu = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Ingresa una opcion.\n1.-Morse a letras\n2.-letras a morse\n3.-salida ");
			opcion = menu.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingresa la cadena: \n");
				cadena =  entrada.nextLine();
				mor(cadena);
				break;
			case 2:
				System.out.println("Ingresa la cadena: \n");
				cadena =  entrada.nextLine();
				alfabeto(cadena);
				break;
			default:
				break;
			}
		} while (3!=opcion);
	}
	public static String fin="";
	public static void alfabeto(String cadena) {
		String cad = "", let="";
		char [] a=cadena.toCharArray();
		for (int i = 0; i < a.length; i++) {
			morse(a[i]);
		}
		System.out.println("\n"+fin);
		fin="";
	}
	public static void mor(String cadena) {
		cadena = cadena + " ";
		String cad = "", let="";
		int l=0, s=0;
		char [] a=cadena.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=' ' && a[i]!='.' && a[i]!='-') {
				l=l+1;
			}
		}
		if (l>0) {
			System.err.println("Ingrese . y - solamente");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i]!=' ') {
					cad +=a[i];
					l=0;
				}else {
					l=l+1;
					if (l==3) {
						fin +=" ";
						l=0;
					}

					let = cad;
					letra(let);
					cad="";
				}
			}
			System.out.println(fin);
			fin="";
		}
	}
	public static void morse(char caracter) {
		switch (caracter) {
		case 'a':
			fin +=".- ";
			break;
		case 'b':
			fin +="-... ";
			break;
		case 'c':
			fin +="-.-. ";
			break;
		case 'd':
			fin +="-.. ";
			break;
		case 'e':
			fin +=". ";
			break;
		case 'f':
			fin +="..-. ";
			break;
		case 'g':
			fin +="--. ";
			break;
		case 'h':
			fin +=".... ";
			break;
		case 'i':
			fin +=".. ";
			break;
		case 'j':
			fin +=".--- ";
			break;
		case 'k':
			fin +="-.- ";
			break;
		case 'l':
			fin +=".-.. ";
			break;
		case 'm':
			fin +="-- ";
			break;
		case 'n':
			fin +="-. ";
			break;
		case 'o':
			fin +="--- ";
			break;
		case 'p':
			fin +=".--. ";
			break;
		case 'q':
			fin +="--.- ";
			break;
		case 'r':
			fin +=".-. ";
			break;
		case 's':
			fin +="... ";
			break;
		case 't':
			fin +="- ";
			break;
		case 'u':
			fin +="..- ";
			break;
		case 'v':
			fin +="...- ";
			break;
		case 'w':
			fin +=".-- ";
			break;
		case 'x':
			fin +="-..- ";
			break;
		case 'y':
			fin +="-.-- ";
			break;
		case 'z':
			fin +="--.. ";
			break;
		case '1':
			fin +=".---- ";
			break;
		case '2':
			fin +="..--- ";
			break;
		case '3':
			fin +="...-- ";
			break;
		case '4':
			fin +="....- ";
			break;
		case '5':
			fin +="..... ";
			break;
		case '6':
			fin +="-.... ";
			break;
		case '7':
			fin +="--... ";
			break;
		case '8':
			fin +="---.. ";
			break;
		case '9':
			fin +="----. ";
			break;
		case '0':
			fin +="----- ";
			break;
		case ' ':
			fin +="   ";
			break;
		default:
			break;
		}
	}
	public static void letra(String letra) {
		switch (letra) {
		case ".-":
			fin +="a";
			break;
		case "-...":
			fin +="b";
			break;
		case "-.-.":
			fin +="c";
			break;
		case "-..":
			fin +="d";
			break;
		case ".":
			fin +="e";
			break;
		case "..-.":
			fin +="f";
			break;
		case "--.":
			fin +="g";
			break;
		case "....":
			fin +="h";
			break;
		case "..":
			fin +="i";
			break;
		case ".---":
			fin +="j";
			break;
		case "-.-":
			fin +="k";
			break;
		case ".-..":
			fin +="l";
			break;
		case "--":
			fin +="m";
			break;
		case "-.":
			fin +="n";
			break;
		case "---":
			fin +="o";
			break;
		case ".--.":
			fin +="p";
			break;
		case "--.-":
			fin +="q";
			break;
		case ".-.":
			fin +="r";
			break;
		case "...":
			fin +="s";
			break;
		case "-":
			fin +="t";
			break;
		case "..-":
			fin +="u";
			break;
		case "...-":
			fin +="v";
			break;
		case ".--":
			fin +="w";
			break;
		case "-..-":
			fin +="x";
			break;
		case "-.--":
			fin +="y";
			break;
		case "--..":
			fin +="z";
			break;
		case ".----":
			fin +="1";
			break;
		case "..---":
			fin +="2";
			break;
		case "...--":
			fin +="3";
			break;
		case "....-":
			fin +="4";
			break;
		case ".....":
			fin +="5";
			break;
		case "-....":
			fin +="6";
			break;
		case "--...":
			fin +="7";
			break;
		case "---..":
			fin +="8";
			break;
		case "----.":
			fin +="9";
			break;
		case "-----":
			fin +="0";
			break;
		default:
			break;
		}
	}
}