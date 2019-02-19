Anmerkung:
Auch wenn wir im Buch im Code Umlaute verwendet haben, 
haben wir in den Code-Beispielen in Klassen- und Package-Namen 
aus Portabilitätsgründen sicherheitshalber auf Umlaute und 
andere Sonderzeichen verzichtet. Man weiß nie...

Kapitel 1 - Strategy-Muster
--------------------------------------------------------
java -cp ./classes headfirst.strategy.MiniEntenSimulator
java -cp ./classes headfirst.strategy.MiniEntenSimulator1

Kapitel 2 - Observer-Muster
--------------------------------------------------------
java -cp ./classes headfirst.observer.wetter.WetterStation
java -cp ./classes headfirst.observer.wetter.WetterStationWaermeIndex
java -cp ./classes headfirst.observer.wetterobservable.WetterStation
java -cp ./classes headfirst.observer.wetterrobservable.WetterStationWaermeIndex
java -cp ./classes headfirst.observer.swing.SwingObserverBeispiel

Kapitel 3 - Decorator-Muster
------------------------------------------------------------
java -cp ./classes headfirst.decorator.sternback.SternbackKaffee

Für das Beispiel EingabeTest müssen Sie sicherstellen, dass sich die
Datei test.txt in dem Verzeichnis befindet, in dem Sie
headfirst.decorator.io.EingabeTest ausführen

java -cp ./classes headfirst.decorator.io.EingabeTest

Kapitel 4 - Factory-Muster
--------------------------------------------------------
Einfache Fabrik
java -cp ./classes headfirst.factory.pizzas.PizzaTestlauf

Factory Method
java -cp ./classes headfirst.factory.pizzafm.PizzaTestlauf

Abstract Factory
java -cp ./classes headfirst.factory.pizzaaf.PizzaTestlauf

Kapitel 5 - Singleton-Muster
----------------------------------------------------------
java -cp ./classes headfirst.singleton.schokolade.SchokoladenSteuerung
java -cp ./classes headfirst.singleton.statisch.SingletonClient
java -cp ./classes headfirst.singleton.zgs.SingletonClient
java -cp ./classes headfirst.singleton.unterklasse.SingletonTestDrive

Kapitel 6 - Command-Muster
------------------------------------------------------
java -cp ./classes headfirst.command.einfacheFernsteuerung.FernsteuerungTestlauf
java -cp ./classes headfirst.command.fernsteuerung.FernsteuerungsLader
java -cp ./classes headfirst.command.rueckgaengig.FernsteuerungsLader
java -cp ./classes headfirst.command.party.FernsteuerungsLader

Muster 7 - Adapter- und Facade-Muster
------------------------------------------------------------------------------
java -cp ./classes headfirst.adapter.enten.EnteTestlauf
java -cp ./classes headfirst.adapter.enten.TruthahnTestlauf
java -cp ./classes headfirst.adapter.iterenum.EI eins zwei drei
java -cp ./classes headfirst.adapter.iterenum.IteratorEnumerationTestlauf eins zwei drei vier fünf sechs
java -cp ./classes headfirst.adapter.iterenum.EnumerationIteratorTestlauf sieben acht neun zehn elf zwölf
java -cp ./classes headfirst.facade.heimkino.HeimkinoTestlauf

Kapitel 8 - Template Method-Muster
----------------------------------------------------------------------
java -cp ./classes headfirst.templatemethod.ungeschult.Barmann
java -cp ./classes headfirst.templatemethod.schulung.GetraenkeTestlauf
java -cp ./classes headfirst.templatemethod.sortieren.EnteSortierenTestlauf
java -cp ./classes headfirst.templatemethod.frame.MeinFrame

Kapitel 9 - Iterator- und Composite-Muster
--------------------------------------------------------------------------------------
java -cp ./classes headfirst.iterator.restaurantfusion.SpeisekartenTestlauf
java -cp ./classes headfirst.iterator.restaurantfusion2i.SpeisekartenTestlauf
java -cp ./classes headfirst.iterator.restaurantfusioncafe.SpeisekartenTestlauf
java -cp ./classes headfirst.composite.speisekarte.SpeisekartenTestlauf
java -cp ./classes headfirst.composite.speisekarteniterator.SpeisekartenTestlauf

Kapitel 10 - State-Muster
----------------------------------------------------
java -cp ./classes headfirst.state.kaugummi.KaugummiAutomatTestlauf
java -cp ./classes headfirst.state.kaugummizustand.KaugummiAutomatTestlauf
java -cp ./classes headfirst.state.kaugummizustandgewinn.KaugummiAutomatTestlauf

Kapitel 11 - Proxy-Muster
----------------------------------------------------
java -cp ./classes headfirst.proxy.javaproxy.PartnerVermittlungsTestlauf
java -cp ./classes headfirst.proxy.virtuellerproxy.ImageProxyTestlauf
java -cp ./classes headfirst.proxy.kaugummiueberwachung.KaugummiAutomatTestlauf <Ortsname> <Anzahl Kaugummikugeln>

Ausführung des Remote-Kaugummi-Proxy-Beispiels:
 - headfirst.proxy.kaugummi.KaugummiAutomatTestlauf <Host> <Anzahl Kaugummikugeln> 
   auf allen "Automaten" ausführen (und nicht vergessen, vorher rmiregistry zu starten).
 - Dann für die Überwachung headfirst.proxy.kaugummi.KaugummiUeberwachungTestlauf ausführen.
 - Vor dem Kompilieren müssen Sie KaugummiÜberwachungTestlauf editieren und dort die   
   richtigen Verweise auf Ihre "Automaten"-Rechner angeben.
 - Wenn Sie alles auf dem gleichen Rechner ausführen, können Sie als Host auch localhost 
   angeben. Die entsprechende Zeile in KaugummiÜberwachungTestlauf muss dann lauten:
   String[] standort = {"rmi://localhost/kaugummiautomat"};

Kapitel 12 - Zusammengesetzte Muster
--------------------------------------------------------------
Wiedersehen mit den Enten
java -cp ./classes headfirst.combining.enten.EntenSimulator
java -cp ./classes headfirst.combining.adapter.EntenSimulator
java -cp ./classes headfirst.combining.decorator.EntenSimulator
java -cp ./classes headfirst.combining.factory.EntenSimulator
java -cp ./classes headfirst.combining.composite.EntenSimulator
java -cp ./classes headfirst.combining.observer.EntenSimulator

MVC
java -cp ./classes headfirst.combined.djview.DJTestlauf
java -cp ./classes headfirst.combined.djview.HerzTestlauf
Hinweise:
 - Verschieben Sie das Steuerungsfenster, falls es das Anzeigefenster verdeckt.
 - Der DJTestlauf funktioniert leider nur mit Java 1.4. Mit Java 5.0 hören Sie den 
   Beat nur ein einziges Mal, und auch der pulsierende Balken arbeitet nicht richtig. 
   Dies hängt damit zusammen, dass Sun bei Java 5.0 Veränderungen an der sound-API 
   vorgenommen hat. 
   Wenn Sie mit Java 5.0 arbeiten, können Sie in BeatModel.java die auskommentierte 
   Zeile 117 (sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);) hinzunehmen, 
   dann hören Sie zumindest den Beat. 
   Um auch die Frequenzanpassung und den pulsierenden Balken unter Java 5 
   funktionsfähig zu machen, wären weitergehende Veränderungen erforderlich 
   (allerdings würde der Code dann wiederum mit Java 1.4 nicht mehr funktionieren).





