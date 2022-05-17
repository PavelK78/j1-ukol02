package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    Turtle zofka;

    public void main(String[]args) {
        zofka = new Turtle();

        Color cervenaBarva;
        cervenaBarva = new Color(255,0,0);

        zofka.setLocation(100.0,100.0);
        // Volani metody, do ktere se preda hodnota 50.0 a objekt, ktery je v promenne cervenaBarva
        nakresliBarevnyRovnostrannyTrojuhelnik(50.0,cervenaBarva);

        zofka.setLocation(300.0,100.0);
        // Volani metody, do ktere se preda hodnota 70.0 a in-line vytvoreny objekt barvy
        nakresliBarevnyRovnostrannyTrojuhelnik(70.0,new Color(0,127,255));
    }

    public void nakresliBarevnyRovnostrannyTrojuhelnik(double velikostStrany, Color barvaCary) {
        // Zde lze používat proměnnou velikostStrany a barvaCary:
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
    }
}

