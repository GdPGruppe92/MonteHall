
public class MonteHall {
	
	public static void main(String[] args) {
		int Versuche = Integer.parseInt(args[0]);
		
		if(Versuche<=0) {
			System.out.println("Die Anzahl der Versuche muss mindestens 1 sein. Das Programm wird nun beendet");
			System.exit(-1);
		}
		
		
		int Gewinne1 = 0;
		int Gewinne2 = 0;
		
		
		
		
		//Strategie 1 : wechseln
		for(int n=0; n<Versuche; n++) {
			
		
			
			int Preis = (int) (Math.random() * 3 ); //hinter einer der 3 Tueren wird der Preis platziert
			
			int Auswahl = (int) (Math.random() * 3 ); //1 der 3 Tueren wird ausgewaehlt
			
			//nun wird eine andere Tuer ausgewaehlt, hinter welcher der Preis nicht ist
			int Faketuer;
			
			do {
				Faketuer = (int) (3 * Math.random());
			} while((Faketuer == Preis) || (Faketuer == Auswahl));
			
				
				int Neuwahl = 0 + 1 + 2 - Auswahl - Faketuer;
			
			if(Neuwahl == Preis) {
				Gewinne1++;
			}
		}
			
			//Strategie 2 : nicht wechseln
			
			for (int m=0; m<Versuche; m++) {
			
				
				
				int Preis2 = (int) (Math.random() * 3 ); //hinter einer der 3 Tueren wird der Preis platziert
				
				int Auswahl2 = (int) (Math.random() * 3 ); //1 der 3 Tueren wird ausgewaehlt
				
				
				if(Auswahl2 == Preis2) {
					Gewinne2++;
				}
			}
			
				
				double Strategie1 = 1.0 * Gewinne1 / Versuche;
				double Strategie2 = 1.0 * Gewinne2 / Versuche;
				
				System.out.println("Die mittlere Erfolgschance fuer das Wechseln ist" + " " + Strategie1 );
				System.out.println("Die mittlere Erfolgschance fuer das Nicht-Wechseln ist" + " " + Strategie2 );
			
		}
	}
