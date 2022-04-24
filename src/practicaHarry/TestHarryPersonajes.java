package practicaHarry;

public class TestHarryPersonajes {

    public static void main(String[] args) {
        TestPersonHP();
    }

    public static void TestPersonHP(){

        Personaje GinevraW = new Personaje(
                "Gryffindor",
                "Pure-Blood",
                "Married",
                "Female",
                "Ginevra Weasley",
                "Horse"
        );

        Personaje HermioneJ = new Personaje(
                "Griffindor",
                "Muggle-born",
                "Married",
                "Female",
                "Hermione Granger",
                "Otter"
        );

        Personaje LunaL = new Personaje(
                "Ravenclaw",
                "Pure-Blood or Half-blood",
                "Married",
                "Female",
                "Luna Lovegood",
                "Hare"
        );

        Personaje TomR = new Personaje(
                "Slytherin",
                "Half-blood",
                "Single",
                "Male",
                "Tom Marvolo Riddle",
                "None"
        );

        Personaje HarryP = new Personaje(
                "Gryffindor",
                "Half-Blood",
                "Married",
                "Male",
                "Harry James Potter",
                "Stag"
        );

        System.out.println(HarryP.showMessage());
        System.out.println(TomR.showMessage());
        System.out.println(LunaL.showMessage());
        System.out.println(HermioneJ.showMessage());
        System.out.println(GinevraW.showMessage());
    }
}
