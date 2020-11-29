package tr.edu.medipol.yazilimgelistirmearac.MehmetSalih.Pirmit;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		
		System.out.println(ucretHesapla(5, 25));
	}

	
			public static int ucretHesapla(int calisilanSaat, int saatlikUcret) {
				return calisilanSaat * saatlikUcret;
				
			}
			
			private static class Ucret {
				int calisilanSaat;
				int saatlikUcret;
				int ucret;
		
				public Ucret(int calisilanSaat, int saatlikUcret) {
					this.calisilanSaat = calisilanSaat;
					this.saatlikUcret = saatlikUcret;
					this.ucret = calisilanSaat * saatlikUcret;
				}
		
				@Override
				public String toString() {
					return "" + calisilanSaat + " * " + saatlikUcret + " = " + ucret + "";
				}
			}
}
