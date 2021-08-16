package practic.learn_enum;

public class Months {
     private EMonth month;

    public Months(EMonth month) {
        this.month = month;
    }

    public void whatToDo(){
        switch (month){

            case January:
                System.out.println("This is January");
                break;
            case February:
                System.out.println("This is February");
                break;
            case March:
                System.out.println("This is March");
                break;
            case April:
                System.out.println("This is April");
                break;
            case May:
                System.out.println("This is May");
                break;
            case June:
                System.out.println("This is June");
                break;
            case July:
                System.out.println("This is July");
                break;
            case August:
                System.out.println("This is August");
                break;
            case September:
                System.out.println("This is September");
                break;
            case October:
                System.out.println("This is October");
                break;
            case November:
                System.out.println("This is November");
                break;
            default:
                System.out.println("This is Last Month of the year");
        }

    }

}
