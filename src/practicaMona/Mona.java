package practicaMona;

public class Mona {
    private int id, tentaculos;
    private String name, body, face, eyesForm, mouthExpression, hair, facialHair;

    public Mona(int id, int tentaculos, String name, String body, String face, String eyesForm, String mouthExpression, String hair, String facialHair){
        this.id = id;
        this.tentaculos = tentaculos;
        this.name = name;
        this.body = body;
        this.face = face;
        this.eyesForm = eyesForm;
        this.mouthExpression = mouthExpression;
        this.hair = hair;
        this.facialHair = facialHair;
    }

    public int getId(int id){  return id;  }
    public int getTentaculos(int tentaculos){  return tentaculos;  }
    public String getName(String name){  return name;  }
    public String getBody(String body){  return body;  }
    public String getFace(String face){  return face;  }
    public String getEyesForm(String eyesForm){  return eyesForm;  }
    public String getMouthExpression(String mouthExpression){  return mouthExpression;  }
    public String getHair(String hair){  return hair;  }
    public String getFacialHair(String facialHair){  return facialHair;  }

    public boolean setId(){
        if(id > 0 ){
            this.id = id;
            return true;
        } else
            return false;
    }
    public boolean setTentaculos(){
        if(tentaculos >= 3 || tentaculos < 8){
            this.tentaculos = tentaculos;
            return true;
        }else
            return false;
    }
    public boolean setName(){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setBody(){
        if(!body.isEmpty()){
            this.body = body;
            return true;
        }else
            return false;
    }

    public boolean setFace(){
        if(!face.isEmpty()){
            this.face = face;
            return true;
        } else
            return false;
    }

    public boolean setEyesForm(){
        if(!eyesForm.isEmpty()){
            this.eyesForm = eyesForm;
            return true;
        }else
            return false;
    }

    public boolean setMouthExpression(){
        if(!mouthExpression.isEmpty()){
            this.mouthExpression = mouthExpression;
            return true;
        } else
            return false;
    }

    public boolean setHair(){
        if(!hair.isEmpty()){
            this.hair = hair;
            return true;
        }else
            return false;
    }
    public boolean setFacialHair(){
        if(!facialHair.isEmpty()){
            this.facialHair = facialHair;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Descripción de Mona: "+"\n"+
                        "Id: "+id+"\n"+
                        "Nombre: "+name+"\n"+
                        "Tiene: "+tentaculos+" tentaculos"+"\n"+
                        "Cuerpo: "+body+"\n"+
                        "Expresion: "+face+"\n"+
                        "Ojos: "+eyesForm+"\n"+
                        "Boca: "+mouthExpression+"\n"+
                        "Cabello: "+hair+"\n"+
                        "Bigote o Barba: "+facialHair+"\n";
    }

}
