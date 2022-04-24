package practicaMultiverse;

import java.awt.*;

public class SpiderVerse {
    public static void main(String[] args) {
        Gwen();
        HoboSpider();
        SpiderHam();
    }

    public static void Gwen(){
        Screen s = new Screen();
        SpiderMulti gwen = new SpiderMulti(
                "Gwendolyne Stacy",
                "Gwen Stacy, Spider-Woman, Spider-Gwen",
                "Female",
                "Alright, people. Let’s start at the beginning one last time. My name is Gwen Stacy. I was bitten by a radioactive spider. And for the last two years, I've been the one and only Spider-Gwen. You guys know the rest. I joined a band. Saved my dad. I couldn’t save my best friend, Peter Parker. So now I save everyone else. And I don’t do friends anymore. Just to avoid any distractions."
        );
        s.setVisible(true);
        s.out(gwen.showMessage(), "helvetica", 28, Color.black);
        gwen.spiderShooter(s);
    }
    public static void HoboSpider(){
        Spiderman hoboSpider = new Spiderman(
                "Peter Parker",
                "Spider-Man, Janky, Old broke, Hobo Spider-Man",
                "Male",
                "When will I know I'm ready?, You won't. It's a leap of faith. That's all it is, Miles. A leap of faith."
        );
        System.out.println("HoboSpider created!");
    }
    public static void SpiderHam(){
        Spiderman spiderHam = new Spiderman(
                "Peter Porker",
                "Spider-Ham",
                "Macho",
                "Do animals talk in this dimension? 'Cause I don't wanna freak him out."
        );
        System.out.println("SpiderHam created!");
    }



}
