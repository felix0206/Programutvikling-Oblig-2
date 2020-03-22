package OppgaveTre3;

public class ForklaringAbstrakt {

    /*

    oppg 3.3.1:

    Burde draw(); være abstrakt?

    Ja, den burde være absrakt.
    En abstrakt metode er en metode uten innhold (body), som blir deklarert uten å bli implementert.

    Draw metoden burde være abstrakt fordi hver enkel shapeklasse representerer en form, noe som gjør
    at de også må ha en draw metode. For at den skal bli implementert hver gang bør den være abstrakt, da en draw metode
    er nødvendig for hver enkel shapeklasse.

    Oppg 3.3.2:

    Observer designmønsteret observerer for eksempel bevegelse av musepekeren. Den oppdateres når en endring skjer.
    Eksempelvis hvis X eller Y koordinatene endrer seg.


    Oppg 3.3.3:

    Composite designmønstert tar i bruk interface eller en abstrakt klasse.
    I dette tilfellet brukes den abstrakte klassen Shapes og ShapesCategory.


    Oppg 3.3.4:

    Designmønsteret Decorator kan brukes i dette tilfellet. Da oppretter man en egen klasse for å "dekorere", i vårt
    tilfelle sette en ramme rundt formen. Denne klassen arver fra de forskjellige formene. Vi trenger derfor ikke
    å dekorere objektene direkte, men kan gjøre dette ved hjelp av denne dekoreringsklassen.

    --> Se klassen Ramme.

     */



}
