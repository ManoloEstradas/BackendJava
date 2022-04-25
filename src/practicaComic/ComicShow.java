package practicaComic;

import practicaComic.CalvinAndHobbes;

public class ComicShow {
    public static void main(String[] args) throws InterruptedException{
        CandH();
    }

    public static void CandH() throws InterruptedException{
        Screen screen = new Screen();
        CalvinAndHobbes candh = new CalvinAndHobbes(
                1,
                "Calvin and Hobbes",
                "comic filosofico",
                "Bill Watterson",
                "Calvin y Hobbes retrata las divertidas aventuras de Calvin, un niño imaginativo de seis años, y Hobbes, su tigre de peluche sarcástico. Irónicamente, los nombres de los dos personajes se toman de los nombres de dos pensadores con filosofías radicalmente diferentes: el teólogo John Calvin y el materialista Thomas Hobbes "
        );

        Runnable showComic = new Runnable() {
            @Override
            public void run() {
                try{
                    candh.portada(screen);
                    Thread.sleep(17000);

                    candh.viggnete1(screen);
                    Thread.sleep(3000);

                    candh.viggnete2(screen);
                    Thread.sleep(7000);

                    candh.viggnete3(screen);
                    Thread.sleep(13000);

                    candh.viggnete4(screen);
                    Thread.sleep(10000);

                    candh.viggnete5(screen);
                    Thread.sleep(10000);

                    candh.viggnete6(screen);
                    Thread.sleep(10000);

                    candh.viggnete7(screen);
                    Thread.sleep(10000);

                    candh.viggnete8(screen);
                    Thread.sleep(10000);

                    candh.viggnete9(screen);
                    Thread.sleep(10000);

                    candh.viggnete10(screen);
                    Thread.sleep(10000);

                    candh.viggnete11(screen);
                    Thread.sleep(10000);


                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread showComicCandH = new Thread(showComic);
        showComicCandH.start();
    }

}
