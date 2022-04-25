package practicaComic;

import java.awt.*;

public class CalvinAndHobbes extends Comic implements ComicContent {

    public CalvinAndHobbes(int paginas, String titulo, String genero, String autor, String descripcion) {
        super(paginas, titulo, genero, autor, descripcion);
    }

    @Override
    public void portada(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"helvetica",21, Color.BLACK);
        s.showImage("CA_01.png");
        s.setBounds(500, 250, 620, 700);
    }

    @Override
    public void viggnete1(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_01.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete2(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_02.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete3(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_03.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete4(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_04.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete5(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_05.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete6(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_06.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete7(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_07.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete8(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_08.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete9(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_09.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete10(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_10.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void viggnete11(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("CA_11.png");
        s.setBounds(500, 250, 600, 500);
    }

    @Override
    public void texto(Screen s) {
        System.out.println("Soy un texto del comic");
    }

    @Override
    public void ilustracion(Screen s) {
        System.out.println("Soy ilustracion del comic ");

    }
}

