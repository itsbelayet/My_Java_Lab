package java_5thClass_Enum_SingleTon;

public class Coffee {
    private CupSize cupSize;

    public Coffee(CupSize cupSize) {        //This is Constructor
        this.cupSize = cupSize;
    }

    public Coffee() {

    }

    public void setCupSize(CupSize cupSize){
        this.cupSize = cupSize;

    }
    public CupSize getCupSize(){
        return cupSize;
    }
    @Override
    public String toString(){

        return "Coffee cup Size " + cupSize+"\nVolume : "+cupSize.getVolume();
    }
}
