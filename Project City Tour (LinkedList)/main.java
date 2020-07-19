import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void cityTour (LinkedList<String> cities) {
        ListIterator<String> iterator = cities.listIterator();

        int toDo ;
        write_toDo ();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()){
            System.out.println("Couldn't find any city...");
        }

        boolean exit = false;

        while (!exit){
            System.out.println("Select a number from List");
            toDo = scanner.nextInt();
            switch(toDo){
                case 0 :
                    write_toDo();
                    break;

                case 1 :
                    if (iterator.hasNext()){
                        System.out.println("Going to do next city: " + iterator.next());
                    }
                    else{
                        System.out.println("There is no city to go...");
                    }
                    break;
                case 2 :
                    if (iterator.hasPrevious()){
                        System.out.println("Going to do previous city: " + iterator.previous());
                    }
                    else{
                        System.out.println("City tour started...");
                    }
                    break;
                case 3 :
                    exit = true;
                    System.out.println("Terminating Program...");
                    break;
            }
        }
    }

    private static void write_toDo() {
        System.out.println("0 - Show toDo List");
        System.out.println("1 - Go to the next city");
        System.out.println("2 - Go to the previous city");
        System.out.println("3 - Exit");
    }

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<String>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Izmir");

        cityTour(cities);
    }
}
