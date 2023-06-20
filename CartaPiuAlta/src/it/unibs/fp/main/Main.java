package it.unibs.fp.main;
import java.util.ArrayList;
import java.util.Random;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.NumeriCasuali;
import it.unibs.fp.mylib.MyMenu;

public class UiMain {
private static final String TITOLO_MENU_DI_INIZIO = "Carta più alta";
private static final String TITOLO_SCELTA_MAZZO = "Scegli il tuo mazzo";
public static int scelta=32;
public static int tipoMazzo=1;
public static double denaro=0;
public static String [] vociMenuDiInizio= {"Inizia", "Tutorial"};  
public static String [] vociSceltaMazzo= {"Mazzo italiano", "Mazzo francese"};  
public static final String MSG_TUTORIAL= "\nBenvenuto! Per giocare devi scegliere un mazzo di carte. \n\n"
		+ "Mazzo italiano(4 semi):Asso,2,3,4,5,6,7,Jack,Donna,Re \n"
		+ "Mazzo francese(4 semi eccetto i Jolly):Asso,2,3,4,5,6,7,8,9,Jack,Donna,Re,Jolly(x2) \n\n"
		+ "Il valore delle carte cresce secondo l'ordine in cui sono state elencate.\n"
		+ "Il banco ti mostrerà una carta e su di essa dovrai fare una puntata. Verrà pescata una seconda \n"
		+ "carta e nel caso questa abbia un valore minore di quella su cui hai puntato dei soldi riceverai\n"
		+ "il doppio dell'importo che hai scommesso. In alternativa avrà vinto il banco e questo si \n"
		+ "approprierà dei soldi della tua puntata. Qualora le carte avessero lo stesso valore si \n"
		+ "effettuerà una nuova pescata. La puntata minima è di un euro. Buon Divertimento! \n";	



public UiMain() {
		// TODO Auto-generated constructor stub
	
	}
	
	public static void main(String[] args) {
		
	    Partita partita= new Partita();
		MyMenu inizio= new MyMenu(TITOLO_MENU_DI_INIZIO, vociMenuDiInizio);
		
		while (scelta!=1) {
		scelta=inizio.scegli();
		switch (scelta) {
		case 1:
			break;
		
		case 2:
		 stampaTutorial();
		 break;
		
		default:
		 break;
		}
		}
		
		MyMenu sceltaMazzo= new MyMenu( TITOLO_SCELTA_MAZZO, vociSceltaMazzo);
		tipoMazzo=sceltaMazzo.scegli();
	    partita.creaMazzo(tipoMazzo);
	    
	    System.out.println("Inserire la propria disponibilità di denaro (In euro):/n");
	    denaro=InputDati.leggiDouble("/n Buon divertimento! /n");
	    partita.gioca(denaro);
	}
	
	public static void stampaTutorial() {
		
		System.out.println(MSG_TUTORIAL);
		
	}
	
   
}
