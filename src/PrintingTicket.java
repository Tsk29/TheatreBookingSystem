import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PrintingTicket extends Cost {

    public static void main(String args[])
    {

        Scanner in = new Scanner(System.in);

        try {
            File f = new File("Final.txt");
            PrintWriter t =new PrintWriter(f);


            ArrayList<String> cnames = new ArrayList<>();

            Cost s=new Cost();

            System.out.println("Enter your Name ");
            String a=in.next();
            cnames.add(a);


            System.out.println("Enter payement Method(Googlepay(GP), Credit Card(CC), Debit Card(DC), Paytm(PT)");
            String p = in.next();
            String pm="Cash";
            switch(p) {
                case "GP":
                    s.setpm(p);
                    pm="Google Pay";
                    break;
                case "CC":
                    s.setpm(p);
                    pm="Credit Card";
                    break;
                case "DC":
                    s.setpm(p);
                    pm="Debit Card";
                    break;
                case "PT":
                    s.setpm(p);
                    pm="Paytm";

                    break;
            }

            System.out.println("Enter phone number(10 digit)");
            String pn=in.next();
            if(pn.length()==10)
            {
                s.setphoneno(pn);
            }
            else {

                System.out.println("Wrong Number");

            }


            System.out.println(s.details());
            s.getScreen();
            s.selTime();
            s.selectlang();
            System.out.println(s.toString());
            s.display();
            s.selectseat();
            s.select3d();
            s.Mask();


            t.println("                            "+"A7 MULTIPLEX"+"                             ");
            t.println("**************************");
            t.println(" Name :"+a+"                                         "+"Phone Number: "+pn);
            t.println("Screen:"+Screen);
            t.println(s.toString()+"                                               "+"Time:"+time);
            t.println(" No.of Tickets:"+count);
            t.println("Tickets Cost:"+ticketprice+"INR only"+"                             "+"Food Cost: "+fc+"INR only");
            t.println("3d glasses Cost:"+dm+"INR only"+"                             "+"Mask Cost: "+cm+"INR only");
            t.println("Payment Method: "+pm);
            t.println("**************************");
            t.println(" Total bill:"+finalbill+"INR only ");
            t.println("**************************");
            t.close();
        }


        catch(FileNotFoundException e)
        {
            System.out.println("\n error occured");
            System.exit(0);
        }

        in.close();

    }

}
