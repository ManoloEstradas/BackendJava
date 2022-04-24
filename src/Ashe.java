import java.awt.*;

public class Ashe extends Champion implements AsheActionCallbacks{

    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"helvetica",26, Color.BLACK);
        s.showImage("frost_shot.gif");
        s.setBounds(200, 100, 1100, 1000);

    }

    @Override
    public void hawkShot(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.MAGENTA);
        s.showImage("hawkshot.gif");
        s.setBounds(200, 100, 1100, 1000);
    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.BLUE);
        s.showImage("ranger_focus.gif");
        s.setBounds(200, 100, 1100, 1000);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.BLACK);
        s.showImage("volley.gif");
        s.setBounds(200, 100, 1100, 1000);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"helvetica",26, Color.RED);
        s.showImage("crystal_arrow.gif");
        s.setBounds(200, 100, 1100, 1000);
    }
}
