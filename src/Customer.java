import java.util.ArrayList;
import java.util.Scanner;
public class Customer {

    private	String phoneno;

    String paymentmethod;
    static Scanner in =new Scanner(System.in);


    public static void display(ArrayList<String> cnames) {

        System.out.print("ArrayList: ");
        for(String cname :cnames )
        {
            System.out.println(cname+ " ");
        }

    }

    public  String  getphoneno()
    { return phoneno;

    }
    public void setphoneno(String  phoneno)
    {
        this.phoneno=phoneno;

    }
    public  String getpm()
    { return paymentmethod;

    }
    public void setpm(String paymentmethod)
    {
        this.paymentmethod=paymentmethod;

    }
    public String details()
    {
        return("Phone No:"+ getphoneno()+"\n"+"The payment method is:"+getpm());
    }
}


