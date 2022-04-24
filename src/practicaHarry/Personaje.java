package practicaHarry;

public class Personaje {
    private String casa;
    private String bloodStatus;
    private String maritalStatus;
    private String genero;
    private String nombre;
    private String patronus;

    public Personaje(String casa, String bloodStatus, String maritalStatus, String genero, String nombre, String patronus){
        this.casa = casa;
        this.bloodStatus = bloodStatus;
        this.maritalStatus = maritalStatus;
        this.genero = genero;
        this.nombre = nombre;
        this.patronus = patronus;
    }

    public String getCasa(){  return casa;  }
    public String getBloodStatus(){  return bloodStatus;  }
    public String getMaritalStatus(){  return maritalStatus;  }
    public String getGenero(){  return genero;  }
    public String getNombre(){  return nombre;  }
    public String getPatronus(){  return patronus;  }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setBloodStatus(String bloodStatus){
        if(!bloodStatus.isEmpty()){
            this.bloodStatus = bloodStatus;
            return true;
        }else
            return false;
    }
    public boolean setMaritalStatus(String maritalStatus){
        if(!maritalStatus.isEmpty()){
            this.maritalStatus = maritalStatus;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        } return false;

    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus= patronus;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: "+nombre+"\n"+
                "Casa: "+casa+"\n"+
                        "Genero: "+genero+"\n"+
                        "Blood Status: "+bloodStatus+"\n"+
                        "Marital Status: "+maritalStatus+"\n"+
                        "Patronus: "+patronus+"\n";
    }

}


