package java_5thClass_Enum_SingleTon;

public enum CupSize {
    SMALL(25){
        public String getDetails(){
            return "Use the clear glass cup";
        }
    },
    MEDIUM(40),
    LARGE(110);

    private int volume;

    CupSize(int volume) {               //This is parameterized Constructor

        this.volume = volume;           // in enum no need to write public static
    }
    public int getVolume(){             //This is return type method

        return volume;
    }
    public String getDetails(){
        return "Use the Blue Cap ";
    }

}
