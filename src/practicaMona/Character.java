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

    public String getNamecha(String namecha){  return namecha;  }
    public String getTops(String tops){  return tops;   }
    public String getNamecha(){ return namecha; }
    public String getBottoms(String bottoms){  return bottoms;  }
    public String getFootware(String footwear){  return footwear;  }
    public String getHat(String hat){  return hat;  }
    public String getGlasses(String glasses){  return glasses;  }
    public String getAccesories(String accesories){  return accesories;  }
    public String getProps(String props){  return props;  }

    public boolean setNamecha(){
        if(!namecha.isEmpty()){
            this.namecha = namecha;
            return true;
        }else
            return false;
    }

    public boolean setTops(){
        if(!tops.isBlank()){
            this.tops = tops;
            return true;
        }else
            return false;
    }
    public boolean setBottoms(){
        if(!bottoms.isEmpty()){
            this.bottoms = bottoms;
            return true;
        }else
            return false;
    }
    public boolean setFootware(){
        if(!footwear.isEmpty()){
            this.footwear = footwear;
            return true;
        }else
            return false;
    }

    public boolean setHat(){
        if(!hat.isEmpty()){
            this.hat = hat;
            return true;
        }else
            return false;
    }
    public boolean setGlasses(){
        if(!glasses.isEmpty()){
            this.glasses = glasses;
            return true;
        }else
            return false;
    }
    public boolean setAccesories(){
        if(!accesories.isEmpty()){
            this.accesories = accesories;
            return true;
        } else
            return false;
    }
    public boolean setProps(){
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
