

/**
 * MyKara is a subclass of KaraIO. Therefore, it inherits all methods of KaraIO: <p>
 * <i>MyKara ist eine Unterklasse von KaraIO. Sie erbt damit alle Methoden der Klasse KaraIO:</i> <p>
 * 
 * Actions:      move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors:      onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 * Input/Output: displayMessage(...), intInput(...), doubleInput(...)
 */
public class MyKaraIO extends KaraIO {
    private boolean linksNachRechts = true;
    private boolean gefunden = false;
    private int x = 1;
    private int y = 0;
        
    /**
     * In the 'act()' method you can write your program for Kara <br>
     * <i>In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden</i>
     */
    public void act() {
        //loslaufen
        zeileLaufen();
        drehen();
        
        while (!treeFront() && gefunden == false) {
            move();
            y++; //eine Zeile nach oben gegangen
            drehen();
            if (linksNachRechts) {
                linksNachRechts = false;
                x = x-2;
            } else {
                linksNachRechts = true;
                x = x+2; //das Feld vor ihm verschiebt sich durch drehen 
            }    
            zeileLaufen();
            drehen(); //nach oben drehen
        }   
    }

    public void drehen() {
    	if (linksNachRechts == true) turnLeft();
    	if (linksNachRechts == false) turnRight();    
    }
    
    public void zeileLaufen() {
    	while (!treeFront() && gefunden == false) {
    	  if (mushroomFront()){
    	      //gefunden
              gefunden = true;
              displayMessage("Der Pilz ist vom Kleeblat aus gesehen bei (" + x + "," + y + ")");
    	  }
          else {
              move();
              if (linksNachRechts == true) x++;
    	      if (linksNachRechts == false) x--;
          }
    	} 
    }

}
