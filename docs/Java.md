# Java

## Befehl

Eine Anweisung wird immer mit einem Semikolon beendet. Es wird empfohlen anschließend in einer neuen Zeile weiterzuschreiben. Dies ist aber nicht notwendig.

```java
move();
```

*Experte: Ein Semikolon ohne etwas davor ist ein leerer Befehl.*

## Entscheidung

Ein Rechner kann nur eine Entscheidung treffen, wenn er von einer Aussage prüfen kann, ob diese wahr oder falsch ist. Dazu muss immer eine Behauptung mit einer Tatsache verglichen werden.

Beispiele für Aussagen (Bedingungen):

* `1==2` – (Wichtig: Immer zwei Gleichzeichen) Hier prüft er ob 1 gleich 2 ist.  Das Ergebnis ist falsch (`false`)
* `1!=2` – Hier prüft er, ob 1 ungleich 2 ist. Das Ergebnis ist wahr (`true`)
* `onLeaf()==true` – Hier wird gefragt, ob Kara auf einem Kleeblatt steht.
* `onLeaf()` – Hier wird ein Trick gemacht. Da `onLeaf()` bereits wahr oder falsch sagt, darf ausnahmsweise auf `==true` verzichtet werden.
* `!onLeaf()` – Dies ist noch ausgefuchster: Das Ausrufezeichen dreht die Beheutung einfach um. Es ist also die Kurzfassung von `onLeaf()!=true`

Um den Rechner zu sagen, was in welchen Fall ausgeführt werden muss, werden die betreffenden Befehle in geschweifte Klammern `{}` gesetzt:

```java
if (Bedingung1) {
    // wird ausgeführt, wenn Bedingung1 war ist.
} else if (Bedingung2) { //wird nur geprüft, wenn Bedingung1 nicht zutraf.
    // wird ausgeführt, wenn Bedingung2 war ist.
} else {
    //wird ausgeführt, wenn Bedingung1 und Bedingung2 nicht zutreffen.
}
```

`if` prüft eine Bedingung. `else` wird ausgeführt, wenn `if` falsch war (engl. `else` zu deutsch sonst). Möchte man noch eine weitere Alternative prüfen, so kann man beide kombinieren zu `else if` (wenn nicht, dann prüfe folgendes…)

 `else if` kann beliebig oft geschrieben oder ganz weggelassen werden:					

```java
if (Bedingung1) {
    // wird ausgeführt, wenn Bedingung1 war ist.
} else {
    //wird ausgeführt, wenn Bedingung1 und Bedingung2 nicht zutreffen.
}

if (Bedingung1) {
    // wird ausgeführt, wenn Bedingung1 war ist.
} else if (Bedingung2) { //wird nur geprüft, wenn Bedingung1 nicht zutraf.
    // wird ausgeführt, wenn Bedingung2 war ist.
} else if (Bedingung3) { //wird nur geprüft, wenn Bedingung1 nicht zutraf.
    // wird ausgeführt, wenn Bedingung3 war ist.
} else {
    //wird ausgeführt, wenn Bedingung1, Bedingung1 und Bedingung3 nicht zutreffen.
}
```

Beispiel für eine einfache Entscheidung:

```java
if (onLeaf()) {
    removeLeaf();
} else {
    putLeaf();
}
```



## Entscheidungen mit mehreren Argumenten

Du kannst Bedingungen die geprüft werden sollen auch kombinieren:

In folgendem Beispiel müssen beide Bedingungen stimmen:
```java
if (onLeaf() && treeFront()) {
    displayMessage("Es ist tatsächlich wahr!");
} else {
    displayMessage("Alles ist eine einzige Lüge!");
}
```

In folgendem Beispiel muss mindestens eine Bedingung stimmen:
```java
if (onLeaf() || treeFront()) {
    displayMessage("Es ist tatsächlich wahr!");
} else {
    displayMessage("Alles ist eine einzige Lüge!");
}
```

In folgendem Beispiel  muss mindestens eine Bedingung `onLeaf` und `treeFront` stimmen. Zusätzlich muss auch noch `treeLeft` stimmen:
```java
if ((onLeaf() || treeFront()) && treeLeft()) {
    displayMessage("Es ist tatsächlich wahr!");
} else {
    displayMessage("Alles ist eine einzige Lüge!");
}
```
*Hinweis: Wie in der Mathematik werden Klammern zuerst betrachtet.*



## Schleife

Mit Schleifen können Befehle, die einmal geschrieben wurden, mehrmals aufgerufen werden:

```java
while (!treeFront()) {
     kara.move();
}
```

Hier wird geprüft (Beachte die Ähnlichkeit zu Entscheidungen!), ob Kara vor einem Baum steht, wenn nicht, dann geht Kara einen Schritt nach vorne. Sobald sie vor einem Baum steht hört sie auf.

```java
do {
     move();
} while (!onLeaf())
```

Hier geht Kara so lange vorwärts, bis Kara auf einem Kleeblatt steht. (Beachte, dass die Frage nach einem Baum vor und eine nach einem Kleeblatt nach dem Laufen gestellt werden sollte)

```java
for (i = 0; i < 5; i++) {
     move();
}
```

Hier läuft Kara genau 5-mal. Anschließend bleibt sie stehen. Was dieser Ausdruck genau bedeutet ist zu Beginn noch sehr schwer zu verstehen, merke dir, dass die anstelle der 5 eine beliebig andere Zahl schreiben könntest, wie oft etwas gemacht werden soll.

## eigene Funktion

Nicht nur Kara kann Funktionen ausführen. Auch du kannst eine Funktion erstellen:

```java
public void karaDrehtDurch() {
  kara.turnLeft();
  kara.turnLeft();
  kara.turnLeft();
  kara.turnLeft();
}

// hier kommt das Hauptprogramm hin, z.B.:
karaDrehtDurch();
```

Hier wurde die Funktion`karaDrehtDurch` beschrieben und anschließend ausgeführt. 

`public` gibt dabei die Sichtbarkeit der Funktion an. Diese Funktion ist auch außerhalb der Klasse sichtbar.

`void` gibt den Rückgabewert an. In diesem Fall gibt die Funktion nichts zurück. Eine Funktion `summe` würde aber bspw. die Summe zurückgeben und sähe so aus:

```java
public int summe(int sum1, int sum2) {
    int summe = 0;
  	summe = sum1 + sum2;
  	return summe
}
```

## Variablen

Die Erklärung an dieser Stelle ist angepasst an die Sek. I, im Eigenstudium können durchaus weiterführende Erklärungen gefunden werden.

Eine Variable ist eine Art Tasche, wo ich mir Werte merken kann. Dies ist sehr praktisch, um beispielsweise Werte vom Benutzer entgegenzunehmen oder abhängig vom aktuellen Zustand eine Aktion durchführen zu können.

Hier ein Beispiel:

```java
String name = "";
name = stringInput("Wie heißt du?");
displayMessage("Hallo " + name);
```

In der ersten Zeile Erkläre ich dem Rechner, dass ich gern eine Variable (Tasche) mit dem Namen `name` hätte. Diese Varibale (Tasche) soll vom Typ `String` sein.  Man könnte sich vorstellen, dass die Tasche eine spezielle Form haben soll. Diese Variable (Tasche) ist zu Beginn leer.

In der zweiten Zeile gebe ich eine Frage an den Benutzer aus. Das Ergebnis wird in die Variable (Tasche) `name` geschrieben. Das einfach Istgleichzeichen (`=`) wird hier als Zuweisung verwendet. Daher haben wir beim Vergleich immer zweimal das Istgleichzeichen (`==`) nehmen müssen.

In der dritten Zeile wird die Nachricht „Hallo „ und der Inhalte der Variable (Tasche) ausgegeben.

Variablen (Taschen) können ganz verschiedene Inhalte aufnehmen (von verschiedenem Typ sein). Für den Unterricht können wir uns folgende Typen vorstellen:

| mögliche Inhalte  | Typ       | Beispiel     |
| ----------------- | --------- | ------------ |
| Zeichenketten     | `String`  | `„Papa Bär“` |
| Zahlen            | `int`     | `5`          |
| Wahrheitszustände | `boolean` | `true`       |

### wichtige Variablentypen

#### einzelnzes Zeichen
| Typ    | von  | bis einschliesslich | Speicherbedarf |
| ------ | ---- | ------------------- | -------------- |
| `char` | 0    | 65'635              | 16 bit         |

#### Ganze Zahlen in verschiedenen Größen

| Typ     | von                        | bis einschliesslich       | Speicherbedarf |
| ------- | -------------------------- | ------------------------- | -------------- |
| `byte`  | -128                       | 127                       | 8 bit          |
| `short` | -32'768                    | 32'767                    | 16 bit         |
| `int`   | -2'147'483'648             | 2'147'483'647             | 32 bit         |
| `long`  | -9'223'372'036'854'775'808 | 9'223'372'036'854'775'807 | 64 bit         |

#### Fliesskomma-Zahlen

Bitte beachte, dass die Genauigkeit von der Größe der Zahl abhängt. Das hört sich erstmal komisch an, ließe sich aber mit viel Mathematik erklären. Hierauf wird freundlicherweise verzichtet. :wink:

| Typ      | von          | bis einschliesslich | Speicherbedarf |
| -------- | ------------ | ------------------- | -------------- |
| `float`  | -3.4 * 1038  | 3.4 * 1038          | 32 bit         |
| `double` | -1.7 * 10308 | 1.7 * 10308         | 64 bit         |

#### Wahrheitswerte

| Typ       | Wertebereich        | Speicherbedarf |
| --------- | ------------------- | -------------- |
| `boolean` | `true` oder `false` | 1 bit          |