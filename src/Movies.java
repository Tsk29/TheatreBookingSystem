
public class Movies extends Customer {
    static String time;


    String lang;
    static String ans, Screen;
    public  void getScreen()
    { { System.out.println(" Select Screen (1.A,2.B,3.C,4.D,5.K(Recliners available)");

        boolean f=true;
        while(f==true) {
            int S=in.nextInt();
            switch(S)
            {

                case(1):
                    Screen="A";
                    f=false;
                    System.out.println("Screen is:"+Screen);
                    break;
                case(2):
                    Screen="B";
                    f=false;
                    System.out.println("Screen is:"+Screen);
                    break;

                case(3):
                    Screen="C";
                    f=false;
                    System.out.println("Screen is:"+Screen);
                    break;

                case(4):
                    Screen="D";
                    f=false;
                    System.out.println("Screen is:"+Screen);
                    break;

                case(5):
                    Screen="K";
                    f=false;
                    System.out.println("Screen is:"+Screen);
                    break;
                default:
                    f=true;
                    System.out.println(" Wrong Option,Enter again(1,2,3,4,5)");
                    break;
            }
        }
    }
    }

    public void selTime()
    {

        System.out.println("1. enter the time (9am, 1pm, 3pm, 7pm, 10pm)");

        boolean u=true;
        while(u==true) {
            String t =in.next();
            switch (t) {
                case("9"):
                    time = "9am";
                    u=false;
                    System.out.println(" the selected time is:" +time);
                    break;

                case ("1"):
                    time = "1pm";
                    u=false;
                    System.out.println("the selected time is:" +time);
                    break;

                case ("3"):
                    time = "3pm";
                    u=false;
                    System.out.println(" the selected time is:" +time);
                    break;

                case ("7"):
                    time = "7pm";
                    u=false;
                    System.out.println(" the selected time is:" +time);
                    break;

                case ("10pm"):
                    time = "10";
                    u=false;
                    System.out.println(" the selected time is:" +time);
                    break;
                default:
                    u=true;
                    System.out.println(" Wrong Option,Enter again(9,1,3,7,10)");

            }}
    }


    public void selectlang()
    {
        System.out.println("Enter a language (1. Tamil,2. hindi, 3.telugu,4.malayalam)");
        System.out.println("select the option(1,2,3,4)");

        boolean g=true;
        while(g==true) {
            lang=in.next();
            switch(lang) {
                case "1":
                    System.out.println("Select a movie:\n "+"1.MASTER\t 2.COBRA\t 3.AO2(3D) "+"\n"+"select the option(1,2,3)");

                    boolean j=true;
                    while(j==true) {
                        String tnt=in.next();
                        switch(tnt) {
                            case "1":
                                ans="MASTER";
                                j=false;
                                break;
                            case "2":
                                ans="COBRA";
                                j=false;
                                break;
                            case "3":
                                ans="AO2";
                                j=false;
                            default:
                                j=true;
                                System.out.println("Selected movie is not available,Enter again(1,2,3)");
                        }
                    }
                    g=false;
                    break;
                case "2":
                    System.out.println("Select a movie:\n "+"1.YJHD\t 2.KGF2(3D)\t 3.PATHAN"+"\n"+"select the option(1,2,3)");

                    boolean l=true;
                    while(l==true) {
                        String ht=in.next();
                        switch(ht) {
                            case "1":
                                ans="YJHD";
                                l=false;
                                break;
                            case "2":
                                ans="KGF2";
                                l=false;
                                break;
                            case "3":
                                ans="PATHAN";
                                l=false;
                            default:
                                l=true;
                                System.out.println("Selected movie is not available,Enter again(1,2,3)");
                        }
                    }
                    g=false;
                    break;

                case "3":
                    System.out.println("Select a movie:\n "+"1.MAJOR\t 2.SPYDER\t 3.LIGER(3D)"+"\n"+"select the option(1,2,3)");

                    boolean k=true;
                    while(k==true) {
                        String tt=in.next();
                        switch(tt) {
                            case "1":
                                ans="MAJOR";
                                k=false;
                                break;
                            case "2":
                                ans="SPYDER";
                                k=false;
                                break;
                            case "3":
                                ans="LIGER";
                                k=false;
                            default:
                                k=true;
                                System.out.println("Selected movie is not available,Enter again(1,2,3)");
                        }}
                    g=false;
                    break;

                case "4":
                    System.out.println("Select a movie:\n "+"1.LUCIFER2(3D)\t 2.DHRISHYAM2\t 3.KURUP "+"\n"+"select the option(1,2,3)");
                    boolean x=true;
                    while(x==true) {
                        String mt=in.next();
                        switch(mt) {
                            case "1":
                                ans="LUCIFER2";
                                x=false;
                                break;
                            case "2":
                                ans="DHRISHYAM2";
                                x=false;
                                break;
                            case "3":
                                ans="KURUP";
                                x=false;
                            default:
                                x=true;
                                System.out.println("Selected movie is not available,Enter again(1,2,3)");
                        }
                        break;




                    }
                default:
                    g=true;
                    System.out.println("Selected language is not available,Enter again(1,2,3)");
            }}





    }


}

