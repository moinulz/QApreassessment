import java.awt.*;
import java.util.*;

/**
 * Write a description of class Main here.
 * 
 * @author Moinul
 * @version 1
 */
public class QAcinemas{
    //stu 6, child 4, oap 6, standard 8
   
    public static void main (String[] args)
    {
        int option = 0;
        int totalCost = 0;
        int ticketCost = 0;
        String typeOfTicket;
        String movieDay;
        ArrayList<Movie> movies = new ArrayList<Movie>();
        Scanner select = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        
        
        do
        {
            System.out.println("\n------------------------------");
            System.out.println("\nCinema Ticket System");
            System.out.println("\n------------------------------");
            System.out.println("\nEnter 1 to add a movie");
            System.out.println("\nEnter 2 to select a ticket");
            System.out.println("\nEnter 3 to view movies");
            System.out.println("\nEnter 4 to exit");
            
            System.out.println("\nEnter Option: ");
            option = select.nextInt();
            
            if(option == 1)
            {
                System.out.println("\nEnter name of movie you wish to add: ");
                String movieName = choice.nextLine();
                System.out.println("\nMovie Added!");
                movies.add(new Movie(movieName));
            }
            
            if(option == 2)
            {
               System.out.println("\n Select Tickets: ");
               for (int i = 0; i < movies.size(); i++)
               {
                   int movieNumber = i+1;
                   System.out.println("Movie Number: " + movieNumber);
                   System.out.println("Movie Name: " + movies.get(i).getMovieName());
                   System.out.println("\n");
               }
               System.out.println("------------------");
               System.out.println("Enter the Movie Number: ");
               int movieNumber = choice.nextInt();
               int repeat = 0;
               System.out.println();
               do
               {
                   movies.get(movieNumber-1);
                   System.out.println("\nEnter Ticket Number: " + 
                   "\n 1 for a single Standard Ticket" + 
                   "\n 2 for a single OAP Ticket" + 
                   "\n 3 for a single Student Ticket" +
                   "\n 4 for a single Child Ticket");
                   int selectTicket = choice.nextInt();
                   if (selectTicket == 1)
                   {
                      ticketCost += 8;
                   } else if (selectTicket == 2)
                   {
                      ticketCost += 6;
                   } else if (selectTicket == 3)
                   {
                      ticketCost += 6;
                   } else if (selectTicket == 4)
                   {
                      ticketCost += 4;
                   }
                   System.out.println("\nEnter Day Number: " + "\n 1 for Monday" + "\n 2 for Tuesday" +
                   "\n 3 for Wednesday" + "\n 4 for Thursday" + "\n 5 for Friday");
                   int selectDay  = choice.nextInt();
                   if (selectDay == 3)
                   {
                       ticketCost -= 2;
                   }
                   System.out.println();
                   System.out.print("Enter 1 to add another Ticket or 2 to check out: ");
                   repeat = choice.nextInt();
               } while (repeat == 1);
               System.out.println();
               System.out.println("\nAmount Due: ");
               System.out.println("--------------------");
               System.out.println("TICKETS BOOKED!");
               System.out.println("Total Amount Due: " + "£" + (totalCost + ticketCost));
               System.out.println();
            }   
            
            if(option == 3)
            {
                System.out.println("Display Movies available: ");
                System.out.println("---------------------------");
                for (int i = 0; i < movies.size(); i++)
                {
                    int movieNumber = i+1;
                    System.out.println("Movie Number: " + movieNumber);
                    System.out.println("Movie Name: " + movies.get(i).getMovieName());
                    System.out.println("\n");
                }
                System.out.println("End of Movie List \n");           
            }
            
            if(option == 4)
            {
                System.exit(0);
            }

        }while(true);
    }
}

