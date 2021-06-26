package basicJava;

import java.util.Scanner;

public class TicketPrinter {
    String companyName = "ABC Travel Agency";
    String eventName = null;
    double eventPrice = 0;
    double totalqty = 0;
    double grossPay;
    double netPay = 0;
    double discount = 0;
    int percent = 0;

    public static void main (String[]args){
        TicketPrinter printer1 = new TicketPrinter();
        printer1.wellcome();
        printer1.getEventName();
        printer1.getEventQty();
        printer1.getEventRate();
        printer1.calculateTicketInformation();
        printer1.displayTicketInformation();
    }

    public void wellcome() {
        System.out.println("##### Employee Salary Calculator V1.0 For " + companyName);
        System.out.println("Please Follow the Instruction ........");
    }

    public void getEventName() {
        Scanner nameScan = new Scanner(System.in);
        System.out.println("Enter Event Name : ");
        eventName = nameScan.nextLine();
    }

    public void getEventQty() {
        boolean is_A_ValidNumber = false;
        do {
            try {
                Scanner qtyScan = new Scanner(System.in);
                System.out.println("Number of Ticket : ");
                totalqty = qtyScan.nextDouble();
            } catch (Exception e) {
                System.out.println("Not A number Please Enter Between 1 - 10");
                continue;
            }
            if (totalqty >= 1 && totalqty <= 10) {
                is_A_ValidNumber = true;
            } else {
                System.out.println("Please Enter A Number Between 1 - 10");
            }
        } while (is_A_ValidNumber == false);
    }

    public void getEventRate() {
        boolean is_A_ValidNumber = false;
        do {
            try {
                Scanner ratescan = new Scanner(System.in);
                System.out.println("Enter Ticket Price : ");
                eventPrice = ratescan.nextDouble();
            } catch (Exception e) {
                System.out.println("Please Enter a Valid Price");
                continue;
            }
            if (eventPrice >= 50 && eventPrice <= 250) {
                is_A_ValidNumber = true;
            } else {
                System.out.println("Please Enter a Price Between $50 - $250");
            }

        } while (is_A_ValidNumber == false); // Until the number is unexpected
    }

    public void calculateTicketInformation() {
        grossPay = totalqty * eventPrice;
        if (grossPay <= 100) {
            netPay = grossPay;
        } else if (grossPay > 100 && grossPay < 501) {
            netPay = grossPay * (1 - .10);
            percent = 10;
        } else if (grossPay > 500 && grossPay < 1000) {
            netPay = grossPay * (1 - .20);
            percent = 20;
        } else if (grossPay > 1000) {
            netPay = grossPay * (1 - .30);
            percent = 30;
        }
    }

    public void displayTicketInformation() {
        discount = grossPay - netPay;
        System.out.println("--------- Pay Check --------------------");
        discount = grossPay - netPay;
        System.out.println("--------- Pay Check --------------------");
        System.out.println("EVENT NAME     : " + eventName);
        System.out.println("TICKET PRICE   : " + eventPrice);
        System.out.println("TOTAL TICKET   : " + totalqty);
        System.out.println("GROSS PAY      : " + grossPay);
        System.out.println("DISCOUNT       : " + discount + "  " + percent + " % of Total Price");
        System.out.println("NET PAY        : " + netPay);
        System.out.println("--------- ----" + companyName + "------ --------------------");
    }
}
