import java.awt.*;

public class Game {
    public static void main(String[] args) throws InterruptedException{
        TestAshe();
        //TestZoe();
    }

    public static void TestAshe() throws InterruptedException{
        Screen screen = new Screen();
        Ashe ashe = new Ashe(
                01,
                "Ashe",
                "Marskman",
                "Moderate",
                "Iceborn warmother of the Avarosan tribe, Ashe commands the most populous horde in the north. Stoic, intelligent, and idealistic, yet uncomfortable with her role as leader, she taps into the ancestral magics of her lineage to wield a bow of True Ice..."
        );
        Zoe zoe = new Zoe(
                02,
                "Zoe",
                "Mage",
                "Moderate",
                "As the embodiment of mischief, imagination, and change, Zoe acts as the cosmic messenger of Targon, heralding major events that reshape worlds. Her mere presence warps the arcane mathematics governing realities, sometimes causing cataclysms without..."
        );


        Runnable attack = new Runnable() {
            @Override
            public void run() {
                try {
                    ashe.frostShot(screen);
                    Thread.sleep(3000);

                    zoe.moreSparkles(screen);
                    Thread.sleep(3000);

                    ashe.hawkShot(screen);
                    Thread.sleep(3000);

                    zoe.paddleStar(screen);
                    Thread.sleep(3000);

                    ashe.crystalArrow(screen);
                    Thread.sleep(3000);

                    zoe.portalJump(screen);
                    Thread.sleep(3000);

                    ashe.rangerFocus(screen);
                    Thread.sleep(3000);

                    zoe.sleepyTroubleBubble(screen);
                    Thread.sleep(3000);

                    ashe.volley(screen);
                    Thread.sleep(3000);

                    zoe.spellThief(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread attackAshe = new Thread(attack);
        attackAshe.start();
    }
/*
    public static void TestZoe(){
        Zoe zoe = new Zoe(
                02,
                "Zoe",
                "Mage",
                "Moderate",
                "As the embodiment of mischief, imagination, and change, Zoe acts as the cosmic messenger of Targon, heralding major events that reshape worlds. Her mere presence warps the arcane mathematics governing realities, sometimes causing cataclysms without..."
        );

        System.out.println(zoe.showMessage());
    }
*/
}


