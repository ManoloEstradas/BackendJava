package practicaMona;

public class TestMonaCharacter {
    public static void main(String[] args) {
        Octocat();
        Kimonotocat();
        Daftpunktocat();
        Heisencat();
        Hulatocat();
        Justicetocat();
        Saketocat();

    }

    public static void Octocat(){
        Mona mona = new Mona(
                00,
                8,
                "Mona",
                "T pose",
                "Sonriente",
                "Abiertos, birllantes",
                "Sonriendo",
                "No",
                "Bigotes de gato"
        );

        System.out.println(mona.showMessage());
    }
    public static void Kimonotocat(){
        Mona kimonotocat = new Character(
                95,
                3,
                "Kimonotocat",
                "Mona",
                "Frontal T pose",
                "Concentrada",
                "Cerrados",
                "Cerrada con sonrisa",
                "No",
                "No",
                "Kimono",
                "Kimono",
                "No",
                "No",
                "No",
                "Broche",
                "Abanico, Espada, Sombrilla"

        );
        System.out.println(kimonotocat.showMessage());
    }
    public static void Daftpunktocat(){
        Mona daftpunktocat = new Character(
                100,
                5,
                "Daftpunktocat",
                "Thomas",
                "Frontal Relax pose",
                "Oculta",
                "Abiertos",
                "Feliz",
                "No",
                "No",
                "Saco",
                "Pantalon traje",
                "Zapatos formales",
                "Casco",
                "No",
                "Corbata, Guantes",
                "No"

        );
        System.out.println(daftpunktocat.showMessage());
    }
    public static void Heisencat(){
        Character heisencat = new Character(
                76,
                5,
                "Heisencat",
                "Mona",
                "Frontal",
                "Seria",
                "Malos",
                "Serio",
                "Rapa",
                "Barba y bigote",
                "Traje quimico amarillo",
                "Traje quimico amarillo",
                "Zapatos casuales",
                "Mascara de gas",
                "Si",
                "Bandita en la nariz",
                "Martillo"

        );
        System.out.println(heisencat.showMessage());
    }
    public static void Hulatocat(){
        Character hulatocat = new Character(
                137,
                5,
                "Hulatocat",
                "Mona",
                "Baile",
                "Disfrutando",
                "Abiertos brillosos",
                "Sonrisa",
                "No",
                "No",
                "Top",
                "Falda hawaiana",
                "Descalsa",
                "No",
                "No",
                "Broche de Hibiscus",
                "Ukulele"

        );
        System.out.println(hulatocat.showMessage());
    }
    public static void Justicetocat(){
        Character justicetocat = new Character(
                132,
                5,
                "Justicetocat",
                "Mona",
                "Justicia sexy",
                "Serena",
                "Cerrados",
                "Cerrada, relajada",
                "Chongo cafe claro",
                "No",
                "Tunica",
                "Parte baja de tunica",
                "No",
                "No",
                "Venda en los ojos",
                "Cinturon",
                "Bascula y espada"

        );
        System.out.println(justicetocat.showMessage());
    }
    public static void Saketocat(){
        Character saketocat = new Character(
                114,
                5,
                "Saketocat",
                "Mona",
                "Sentada relajada",
                "Invita a beber",
                "Abiertos grandes alegres",
                "Sonrisa",
                "No",
                "No",
                "Yukata",
                "Pantalones cortos",
                "No",
                "No",
                "No",
                "Cinturon",
                "Sake"

        );
        System.out.println(saketocat.showMessage());
    }
}
