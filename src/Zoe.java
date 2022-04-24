import java.awt.*;

public class Zoe extends Champion implements ZoeCallbacks{

    public Zoe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void moreSparkles(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.BLACK);
        s.showImage("zmoreSparkles.gif");
        s.setBounds(200, 100, 1100, 1000);

    }

    @Override
    public void paddleStar(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.BLACK);
        s.showImage("zpaddleStar.gif");
        s.setBounds(200, 100, 1100, 1000);
    }

    @Override
    public void spellThief(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.BLACK);
        s.showImage("zspellThief.gif");
        s.setBounds(200, 100, 1100, 1000);
    }

    @Override
    public void sleepyTroubleBubble(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.BLACK);
        s.showImage("zsleepyTroubleBubble.gif");
        s.setBounds(200, 100, 1100, 1000);
    }

    @Override
    public void portalJump(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.BLACK);
        s.showImage("zportalJump.gif");
        s.setBounds(200, 100, 1100, 1000);
    }
}
