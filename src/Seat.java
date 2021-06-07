
public class Seat extends Movies {
    int A[][]=new int [20][20];
    static int count=0,ticketprice,fc,y;
    static int totalbill;
    public String toString()
    {
        return ("\n"+"Movie :"+ans );

    }
    public void  display()
    {
        System.out.println("SEATS VIEW(1: available ,0:Not available");
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<20;j++)
            {
                if((i+j)%2==0)
                {
                    A[i][j]=1;



                }
                else A[i][j]=0;
            }
        }

        for (int[] x : A)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println(".............TOWARDS SCREEN.............");
    }
    public void selectseat()
    {
        System.out.println("Enter a for selecting seat \n"+"enter b for getting available seats");
        String n=in.next();
        switch(n)
        {
            case("a"):
                System.out.println("enter no of tickets needed");
                int no1=in.nextInt();
                while(no1>0)
                {
                    System.out.println("enter  row no and col no (20*20)");
                    int r=in.nextInt()-1;
                    int c= in.nextInt()-1;
                    if(A[r][c]==0)
                    {
                        System.out.println("The seat is not available");


                    }
                    else
                    {

                        System.out.println("Your seat is booked");

                        A[r][c]=0;
                        count++;
                        no1--;

                    }


                }
                break;
            case("b"):
                System.out.println("enter no of tickets needed");
                int no=in.nextInt();
                int i=0,j=0;
                while(no>0) {
                    if(A[i][j]==1)
                    {
                        System.out.println("ur seat is booked"+"seat no:"+(i+1)+" "+(j+1)+"");
                        count++;
                        A[i][j]=0;


                    }

                    i++;
                    j++;
                    no--;
                }
        }
        if (count>0)
        {
            ticketprice=count*150;
            System.out.println(" the total amount is :"+ticketprice);
        }
        if(ticketprice!=0)

        {  char ch;
            do {
                System.out.println(" Enter the food needed 1.PopCorn,2.Coke,3.Eggpuffs,4.Icecream,5.Cold  Coffee, 6.Lemon Tea,7.Sweet Corn,8.Hot choclate)");

                System.out.println("select the option(1-8)");
                System.out.println(" else enter 'No'");
                String f=in.next();
                switch(f)
                {

                    case("1"):
                        System.out.println("enter no of popcorn needed");
                        int n1=in.nextInt();
                        fc=fc+n1*90;
                        System.out.println("Food  cost:"+" "+fc);
                        break;
                    case("2"):
                        System.out.println("enter no of cups needed(250 ml)");
                        int n2=in.nextInt();
                        fc=fc+n2*50;
                        System.out.println("Food  cost:"+" "+fc);
                        break;
                    case("3"):
                        System.out.println("enter no of puffs  needed");
                        int n3=in.nextInt();
                        fc=fc+n3*60;
                        System.out.println("Food cost:"+" "+fc);
                        break;
                    case("4"):
                        System.out.println("enter no of softy needed)");
                        int n4=in.nextInt();
                        fc=fc+n4*50;
                        System.out.println("Food  cost:"+" "+fc);
                        break;
                    case("5"):
                        System.out.println("enter no of Cups needed)");
                        int n5=in.nextInt();
                        fc=fc+n5*30;
                        System.out.println("Food  cost:"+" "+fc);
                        break;
                    case("6"):
                        System.out.println("enter no of cups needed(200 ml)");
                        int n6=in.nextInt();
                        fc=fc+n6*40;
                        System.out.println("Food  cost:"+" "+fc);
                        break;
                    case("7"):
                        System.out.println("enter no of cups needed)");
                        int n7=in.nextInt();
                        fc=fc+n7*50;
                        System.out.println("Food  cost:"+" "+fc);
                        break;
                    case("8"):
                        System.out.println("enter no of cups needed)");
                        int n8=in.nextInt();
                        fc=fc+n8*120;
                        System.out.println("Food cost:"+" "+fc);
                        break;
                    default:
                        System.out.println(" Wrong Option");
                }
                System.out.println(" Enter y to Add more Food : ");
                ch=in.next().charAt(0);
            }while (ch=='Y'||ch=='y');

        }

        totalbill=(ticketprice+fc);//calculates 'gst'
    }
}























