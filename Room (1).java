import java.io.*;

class Customer {  //declare superclass
    BufferedReader far = new BufferedReader(new InputStreamReader(System.in)); //object buffered

    //declare variable
    protected String name;
    protected String ic_no;
    protected String Address;
    protected String Tel_no;
    int price, days;

    public Customer()throws IOException{  //constructor superclass for customer

        System.out.print("ENTER CUSTOMER NAME :  ");
        name = far.readLine();//string tokenizer
        System.out.print("ENTER CUSTOMER IC:  ");
        ic_no = far.readLine(); //string tokenizer
        System.out.print("ENTER CUSTOMER ADDRESS:  ");
        Address = far.readLine(); //string tokenizer
        System.out.print("ENTER CUSTOMER PHONE NUMBER:  ");
        Tel_no = far.readLine(); //string tokenizer
    }
}

class Receiptionist extends Customer{ //declare subclass inherit from superclass

    //declare variable
    int RoomAvail;
    String ID;
    String name;
    String Tel_no;
    public Receiptionist()throws IOException{ //constructor with throws variables

        System.out.println("\n"+"*******************COUNTER************************");
        System.out.print("ENTER STAFF ID : ");
        ID=far.readLine(); //string tokenizer
        System.out.print("ENTER STAFF NAME: ");
        name= far.readLine(); //string tokenizer
        System.out.print("ENTER STAFF PHONE NUMBER: ");
        Tel_no= far.readLine(); //string tokenizer
        System.out.println("--------------------------------------------------------");

        System.out.println("*************STAFF CHECK THE ROOM IF AVAILABLE**********");
        System.out.print("ENTER THE AVAILABLE ROOM NUMBER: ");
        RoomAvail=Integer.parseInt(far.readLine()); //string tokenizer

        if(RoomAvail>0) //branching statement
        {
            System.out.println("\n"+"*************ROOM IS AVAILABLE****************");
        }
        else if(RoomAvail<0)
        {
            System.out.print("NO ROOM IS AVAILABLE PLEASE SELECT ANOTHER DATE");
        }
    }
}

class Room extends Receiptionist { //declare subclass

    //declare variables
    String TypeRoom;
    int num, total, money, location;

    public Room() throws IOException { //constructor with throws variables

        System.out.print("ENTER THE ROOM NUMBER: ");
        num = Integer.parseInt(far.readLine());
        System.out.print("ENTER HOW MANY DAYS YOU STAY: ");
        days = Integer.parseInt(far.readLine());

        if (RoomAvail >2) {  //branching statement // yg ni nape ade dua atau ini utk day
            System.out.println("ROOM AVAILABLE ON THIS DAY.");
        } else if (RoomAvail < 2) {
            System.out.println("ROOM NOT AVAILABLE ON THIS DAY.");
        }


        System.out.println("SUITES,PREMIUM,VIP");
        System.out.println("CHOOSE (S/P/V");
        TypeRoom = far.readLine(); //string tokenizer


        if (TypeRoom.equals("S")) { // sepatutnye mu kene buat double quote xle single sbb dia kan String
            System.out.print("HAVE 3 SUITES ROOM LEFT");
            price = 2000;
            System.out.println("PRICE PER NIGHT: RM " + price);

        } else if (TypeRoom.equals("P")) {
            System.out.println("HAVE 1 PREMIUM ROOM LEFT");
            price = 500;
            System.out.println("PRICE PER NIGHT: RM " + price);

        } else if (TypeRoom.equals("V")) {
            System.out.println("HAVE 5 SINGLE ROOM");
            price = 90;
            System.out.println("PRICE PER NIGHT: RM " + price);

        }
    }0

    public void Roomkey() throws IOException { //throws variables
        double total;
        total=price*days;


        if (RoomAvail > 0) { //branching statement
            System.out.print("ENTER THE MONEY: RM");
            money = Integer.parseInt(far.readLine());
            System.out.println("PAYMENT IS: RM "+price);
            System.out.println("YOUR TOTAL PRICE IS: RM "+total);
            System.out.println("********STAFF GIVE ROOM AVAILABLE TO CUSTOMER*******");
            System.out.print("ENTER ROOM NUMBER: ");
            location = Integer.parseInt(far.readLine());
            System.out.println("CUSTOMER ROOM NUMBER IS : " + location);
            System.out.println("*****************CUSTOMER CHECK IN******************");
            System.out.println("\n"+"-----------THANK YOU!! HAVE A GREAT DAY!!-----");
        } else {

        }
    }



    public static void main(String[] args)throws IOException { //main methods with throws variables
        System.out.println("*************WELCOME TO GRAND HYATT HOTEL**************");
        System.out.println("-------------------------------------------------------");
        Room an = new Room(); //new object
        an.Roomkey();
    }

}
