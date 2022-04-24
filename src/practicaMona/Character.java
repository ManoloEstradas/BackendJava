package practicaMona;

public class Character extends Mona {

    public String namecha;
    public String tops;
    public String bottoms;
    public String footwear;
    public String hat;
    public String glasses;
    public String accesories;
    public String props;

    public Character(int id, int tentaculos, String namecha, String name, String body, String face, String eyesForm, String mouthExpression, String hair, String facialHair, String tops, String bottoms, String footwear, String hat, String glasses, String accesories, String props ){
        super(id, tentaculos, name, body, face, eyesForm, mouthExpression, hair, facialHair);
        this.namecha = namecha;
        this.tops = tops;
        this.bottoms = bottoms;
        this.footwear = footwear;
        this.hat = hat;
        this.glasses = glasses;
        this.accesories = accesories;
        this.props = props;
    }

    public String getNamecha(){  return namecha;  }
    public String getTops(){  return tops;   }
    public String getBottoms(){  return bottoms;  }
    public String getFootware(){  return footwear;  }
    public String getHat(){  return hat;  }
    public String getGlasses(){  return glasses;  }
    public String getAccesories(){  return accesories;  }
    public String getProps(){  return props;  }

    public boolean setNamecha(String namecha){
        if(!namecha.isEmpty()){
            this.namecha = namecha;
            return true;
        }else
            return false;
    }

    public boolean setTops(String tops){
        if(!tops.isBlank()){
            this.tops = tops;
            return true;
        }else
            return false;
    }
    public boolean setBottoms(String bottoms){
        if(!bottoms.isEmpty()){
            this.bottoms = bottoms;
            return true;
        }else
            return false;
    }
    public boolean setFootware(String footwear){
        if(!footwear.isEmpty()){
            this.footwear = footwear;
            return true;
        }else
            return false;
    }

    public boolean setHat(String hat){
        if(!hat.isEmpty()){
            this.hat = hat;
            return true;
        }else
            return false;
    }
    public boolean setGlasses(String glasses){
        if(!glasses.isEmpty()){
            this.glasses = glasses;
            return true;
        }else
            return false;
    }
    public boolean setAccesories(String accesories){
        if(!accesories.isEmpty()){
            this.accesories = accesories;
            return true;
        } else
            return false;
    }
    public boolean setProps(String props){
        if(!props.isEmpty()){
            this.props = props;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Mona caracterizada de " +namecha +" usa: "+"\n"+
                    "Camisa: "+tops+"\n"+
                    "Pantalon: "+bottoms+"\n"+
                    "Zapatos: "+footwear+"\n"+
                    "Sombrero: "+hat+"\n"+
                    "Lentes: "+glasses+"\n"+
                    "Accesorios: "+accesories+"\n"+
                    "Props: "+props+"\n";
    }
}
