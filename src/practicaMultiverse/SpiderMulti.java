package practicaMultiverse;

import java.awt.*;

public class SpiderMulti extends Spiderman implements SpiderCallbacks{


    SpiderMulti(String nombre, String alias, String genero, String frase) {
        super(nombre, alias, genero, frase);
    }

    @Override
    public void superHumanStrength() {
        System.out.println("Super punch!!!");
    }

    @Override
    public void speed() {
        System.out.println("Casi flash!");
    }

    @Override
    public void acceleratedHealing() {
        System.out.println("Super punch!!!");
    }

    @Override
    public void spiderShooter(Screen screen) {
        screen.setVisible(true);
        screen.out("My super power       \n ", "helvetica", 32, Color.MAGENTA);
        screen.showImage("shots-shots-shots.jpg");
        screen.setBounds(200, 100, 1100, 600);
        System.out.println("Shots for everyone!!!!\n");

    }

    @Override
    public void spiderSense() {
        System.out.println("Soy sensible, de forma aragnida");
    }

    @Override
    public void masterMartialCombat() {

        System.out.println("Aprendi de bruce li!");
    }
}
