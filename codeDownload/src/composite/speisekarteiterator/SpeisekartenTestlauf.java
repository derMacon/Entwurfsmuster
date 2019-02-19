package headfirst.composite.speisekarteiterator;

import java.util.*;

public class SpeisekartenTestlauf {
	public static void main(String args[]) {
		SpeisekartenKomponente pfannkuchenhausSpeisekarte = 
			new Speisekarte("PFANNKUCHENHAUS-SPEISEKARTE", "Frühstück");
		SpeisekartenKomponente restaurantSpeisekarte = 
			new Speisekarte("RESTAURANT-SPEISEKARTE", "Mittagessen");
		SpeisekartenKomponente cafeSpeisekarte = 
			new Speisekarte("CAFE-SPEISEKARTE", "Abendessen");
		SpeisekartenKomponente dessertSpeisekarte = 
			new Speisekarte("DESSERT-SPEISEKARTE", "Desserts natürlich!");
		SpeisekartenKomponente kaffeeSpeisekarte = new Speisekarte("KAFFEE-SPEISEKARTE", "Alles, was man zum Nachmittagskaffee essen kann");
  
		SpeisekartenKomponente alleSpeisekarten = new Speisekarte("ALLE SPEISEKARTEN", "Alle Speisekarten");
  
		alleSpeisekarten.hinzufügen(pfannkuchenhausSpeisekarte);
		alleSpeisekarten.hinzufügen(restaurantSpeisekarte);
		alleSpeisekarten.hinzufügen(cafeSpeisekarte);
  
		pfannkuchenhausSpeisekarte.hinzufügen(new Speise(
			"Spezial Pfannkuchen-Frühstück", 
			"Pfannkuchen mit Rührei und Toast", 
			true,
			2.99));
		pfannkuchenhausSpeisekarte.hinzufügen(new Speise(
			"Normales Pfannkuchen-Frühstück", 
			"Pfannkuchen mit Spiegelei und Würstche", 
			false,
			2.99));
		pfannkuchenhausSpeisekarte.hinzufügen(new Speise(
			"Blaubeer-Pfannkuchen",
			"Pfannkuchen mit frischen Blaubeeren und Blaubeersirup",
			true,
			3.49));
		pfannkuchenhausSpeisekarte.hinzufügen(new Speise(
			"Waffeln",
			"Waffeln mit Baubeeren oder Erdbeeren",
			true,
			3.59));

		restaurantSpeisekarte.hinzufügen(new Speise(
			"Vegetarisches Sandwich",
			"(Falscher) Schinken mit Salat und Tomaten auf Vollkornbrot", 
			true, 
			2.99));
		restaurantSpeisekarte.hinzufügen(new Speise(
			"Schinken-Sandwich",
			"Schinken, Salat & Tomaten auf Vollkornbrot", 
			false, 
			2.99));
		restaurantSpeisekarte.hinzufügen(new Speise(
			"Tagessuppe",
			"Ein Teller Suppe des Tages mit Beilagensalat", 
			false, 
			3.29));
		restaurantSpeisekarte.hinzufügen(new Speise(
			"Hotdog",
			"Ein Hotdog mit Sauerkraut, relish###, Zwiebeln und Käse",
			false, 
			3.05));
		restaurantSpeisekarte.hinzufügen(new Speise(
			"Gedünstetes Gemüse auf braunem Reis",
			"Gedünstetes Gemüse auf braunem Reis", 
			true, 
			3.99));
 
		restaurantSpeisekarte.hinzufügen(new Speise(
			"Pasta",
			"Spaghetti mit Marinara-Soße und einer Scheibe Brot",
			true, 
			3.89));
   
		restaurantSpeisekarte.hinzufügen(dessertSpeisekarte);
  
		dessertSpeisekarte.hinzufügen(new Speise(
			"Apfelkuchen",
			"Heißer Apfelkuchen mit Sahne und Vanilleeis",
			true,
			1.59));
  
		dessertSpeisekarte.hinzufügen(new Speise(
			"Käsekuchen",
			"Cremiger Käsekuchen mit Kirschen",
			true,
			1.99));
		dessertSpeisekarte.hinzufügen(new Speise(
			"Sorbet",
			"Himbeer- und Zitronen-Sorbet",
			true,
			1.89));

		cafeSpeisekarte.hinzufügen(new Speise(
			"Vegetarischer Burger mit Pommes",
			"Vegatarischer Burger auf Vollkornbrötchen mit Salat, Tomaten und Pommes",
			true, 
			3.99));
		cafeSpeisekarte.hinzufügen(new Speise(
			"Tagesuppe",
			"Ein Teller Suppe des Tages mit Beilagensalat",
			false, 
			3.69));
		cafeSpeisekarte.hinzufügen(new Speise(
			"Burrito",
			"Ein großer Burrito mit Bohnen, Salsa und Mais",
			true, 
			4.29));

		cafeSpeisekarte.hinzufügen(kaffeeSpeisekarte);

		kaffeeSpeisekarte.hinzufügen(new Speise(
			"Zupfkuchen",
			"Schokoladen-Vanille-Kuchen",
			true,
			1.59));
		kaffeeSpeisekarte.hinzufügen(new Speise(
			"Bagel",
			"Verschiedene Sorten: Sesam, Mohn, Rosinen, Kürbis",
			false,
			0.69));
		kaffeeSpeisekarte.hinzufügen(new Speise(
			"Kekse",
			"Drei wunderbar krümelige Kekse",
			true,
			0.89));
 
		Kellnerin kellnerin = new Kellnerin(alleSpeisekarten);
   
		kellnerin.vegetarischeSpeisekarteAusgeben();
	}
}
