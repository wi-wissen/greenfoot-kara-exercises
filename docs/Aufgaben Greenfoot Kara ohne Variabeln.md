# Grundlagen

In den vorherigen Aufgaben haben wir die `act()`-Methode kennen gelernt. Nun wollen wir uns anschauen, wo das Verhalten dieser Methode denn überhaupt programmiert wurde. Dazu müssen wir den **Quelltext** im Editor öffnen: *Rechtsklick* auf die Klasse *MyKara | Open editor* (oder einfach *Doppelklick*).

## 1.Karas erste Schritte

1. Platziere Kara (den Marienkäfer) auf der Welt.
2. Ergänze dein Programm wie folgt:
```java
public class MyKara extends Kara {	
	public void act() {
		move();
	}
}
```
3. Erweitere dein Programm, so dass Kara 3 Schritte macht
4. Lass kara vor jeden Schritt ein Kleeblatt ablegen (Tipp: Schau in der Hilfe nach, wie der Befehl heißt)


 

## 2. Stößt sich kara den Kopf?

1. Öffne die Welt Grundlagen 3-1.world

2. Ergänze die `act()`-Methode:


```java
if(treeFront()) 
{
	showMessage("Autsch, ein Baum!");
} 
else 
{
	move();
}
```

3. Öffne nun Grundlagen 3-2.world und prüfe, ob alles klappt.


 

## 3. Kara im Glück

1. Öffne 03a.

2. Prüfe, ob kara auf einem Kleeblatt sitzt. Gib einen Jubelschrei aus. Wenn sie auf keinen Kleeblatt sitzt, soll sie deprimiert ausstoßen, dass sie schon ihr ganzes Leben viel Pech hat.

3. Prüfe dein Programm auch in Grundlagen 03b


 

## 4. Kara auf Wanderschaft

1. Öffne Grundlagen 4a

2. Gib folgende Befehle in dein Programm ein:

```java
   for(i = 0; i < 5; i++) {
        move();
   }
```

3. Verwende eine andere Schleife, sodass Kara solange auf Wanderschaft ist, bis sie ein Kleeblatt erreicht. Prüfe dein Programmauch an 4b und 4c

4. Öffne 4d suche eine passende Schleife, ob kara so lange laufen zu lassen, bis sie vor einem Baum steht. Prüfe dein Ergebnis an 4c

*Expertenaufgabe: Lass Kara anschließend rufen: „Ohm, Ohm, kommt, meine Freunde! Die Ents ziehen in den Krieg!“*

 

# Einfach

## 1. Kara und die Blätter

Schreibe ein Programm, das Kara bis zum nächsten Baum führt. Liegt auf einem Feld ein Blatt, soll Kara es aufnehmen; liegt auf einem Feld kein Blatt, eines hinlegen. Bei dem Baum angekommen ist kara fertig. 

Prüfe dein Programm an 05a-c.



## 2. Kleeblattsuche im Wald I

![ohne-variabeln-06](img/ohne-variabeln-06.png)

Kara sucht ein Kleeblatt. Sie weiß, dass eines geradeaus vor ihr liegt - sie muss nur um die Bäume herumlaufen. Glücklicherweise stehen nie zwei Bäume nebeneinander. Schreibe ein Programm, das sie bis zum Kleeblatt führt!

Prüfe dein Programm an 06a-c.



## 3. Kleeblattsuche im Wald II

Erweiter dein Programm von *Kleeblattsuche im Wald I* so, dass Kara auch mit mehreren nebeneinander stehenden Bäumen zurecht kommt. 

Prüfe dein Programm an 07a-c.

Hinweis: Die Lösung dieser Aufgabe erfordert eine Schleife in einer Schleife! 




# Mittel

## 1. Kleeblatt-PacMan
Programmiere Kara so, dass er die Spur von Kleeblättern "auffrisst"! Da du weißt, dass die Spur nie entlang eines Baumes geht, kann das Programm beendet werden, sobald Kara auf einem Kleeblatt vor einem Baum steht. Du kannst selbst bestimmen, ob du auf einem Kleeblatt oder davor starten möchtest.

Prüfe dein Programm an 09a,b.

## 2. Immer der Wand entlang
Kara möchte einen Wald im Uhrzeigersinn patrouillieren. Programmiere Kara so, dass sie endlos im Uhrzeigersinn um diesen Wald läuft.

Prüfe dein Programm an 10a-c.

## 3. Slaloom
![ohne-variabeln-11](img/ohne-variabeln-11.png)

Kara möchte zwischen den Bäumen Slalom fahren. Der Anfang des Slaloms ist im Bild eingezeichnet. Programmieren Sie Kara so, dass er den Slalom endlos hin- und zurück fährt. Am Anfang wird Kara immer so gedreht, dass sie zuerst eine Linkskurve machen muss.

Wie lange der Parcour ist (wieviele Bäume der Slalom hat), weiß Kara zu Beginn natürlich nicht. Es soll ihr auch egal sein, ob die Bäume horizontal oder vertikal nebeneinander stehen.



*Hinweis: Du musst mehrere Bedingungen gleichzeitig prüfen.*

 

# Klara erhält neue Funktion

## Schneller mit Methode

Das vorherige Programm Slaloom sollte **mehrere gleiche Teile** enthalten, nämlich für das Herumgehen um jeden Baum. Um das oberste Prinzip der Programmierer *Never repeat yourself!* zu realisieren, werden wir eine Funktion erschaffen. Unterhalb der `act()`-Methode erstellen wir eine neue Funktion:

```java
public void quarterTurnLeft() {

}

public void quarterTurnRight() {

}
```

Schreibe zwischen die geschweiften Klammern der Funktion die Befehle, die es braucht, um um den Baum zu biegen.

Benutzen nun innerhalb der `act()`-Methode die eben neu erschaffenen Methoden 



# Expertenaufgabe

Bist du eher fertig, wäre es sehr schön, wenn du deinenMitschülern helfen würdest. Denke bitte daran, dass helfen nicht bedeutet, dass du ihr Programm schreibst oder sie deins abschreiben.

Alternativ würde ich mich freuen, wenn du dir eine eigeneAufgabe für kara ausdenkst und die zusammen mit der Lösung hier einreichst: <https://goo.gl/forms/fCPuUObToHZk6qiv1>

Du hilfst dabei den Unterricht zu verbessern.