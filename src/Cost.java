public class Cost extends Seat{
    static int finalbill;
    static int cm,dm;
    public void select3d()
    {
        boolean y=true;
        System.out.println("Enter 1 if u need 3D glasses(Please check if you need 3d glasses before booking the ticket)"+"\n"+"Enter 2 if u dont need");
        while(y==true) {
            String s =in.next();
            switch (s) {
                case("1"):
                    int glasses=ticketprice/150;
                    dm=glasses*50;
                    finalbill=dm+totalbill;
                    System.out.println("The cost 3d glasses::"+dm+"INR only ");
                    y=false;
                    break;
                case("2"):
                    dm=0;
                    finalbill=dm+totalbill;
                    y=false;

                    break;
                default :
                    y=true;
                    System.out.print("please enter 1 or 2");
            }
        }
    }

    public void  Mask()
    {

        System.out.print("do you have mask: enter 1.for yes 2.for no");


        boolean t=true;
        while ( t==true) {
            String i = in.nextLine ();

            switch(i) {
                case"1":

                    System.out.println("you can get into the theater ");
                    t=false;
                    break ;

                case"2":
                    System.out.println("no of masks u need to buy : ");

                    cm=30*count;//cost of no of masks purchased


                    System.out.println("cost of masks purchased =======>>>>>"+cm+ " rupees");

                    t=false;
                    break;
                default :
                    t=true;
                    System.out.print("please enter 1 or 2");
            }

        }


        finalbill =finalbill+cm;
        System.out.println("The total bill:"+finalbill+"INR only ");

    }


}
