package practicaMultiverse;

public class Spiderman {
    private String nombre;
    private String alias;
    private String genero;
    private String frase;

    Spiderman(String nombre, String alias, String genero, String frase){
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.frase = frase;
    }

    public String getNombre(){  return nombre;   }
    public String getAlias(){  return alias;  }
    public String getGenero(){  return genero;  }
    public String getFrase(){  return frase;  }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setAlias(String alias) {
        if(!alias.isEmpty()){
            this.alias = nombre;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean setFrase(String frase){
        if(!frase.isEmpty()){
            this.frase = frase;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: "+nombre +"\n"+
                        "Alias: "+alias+ "\n"+
                        "Genero: "+genero+"\n"+
                        "Frase: "+frase+"\n";

    }
}
