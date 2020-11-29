package tr.edu.medipol.yazilimgelistirmearac.MehmetSalih.Pirmit;

import org.junit.*;

import static org.junit.Assert.*;

public class MuhasebeProgramiTest {

	@Test
	public void testucretHesapla() {
	int calisilanSaat = 5;
	int saatlikUcret = 15;
	
	int ucretHesaplaSonuc = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);

	
	Assert.assertEquals(75, ucretHesaplaSonuc);

	}
	
	
	

}
