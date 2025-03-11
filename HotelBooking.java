public class HotelBooking {
    static class guest{
        String name;
        String roomType;
        int nights;

        // default
        guest(){
            this("Peter","Non AC",3); // only works if matching parameterized function is in the class
        }

        // parameterized function
        guest(String name,String roomType,int nights){
            this.name = name;
            this.roomType = roomType;
            this.nights = nights;
        }

        //copy contructor
        guest(guest guest1){
            this.name = guest1.name;
            this.roomType = guest1.roomType;
            this.nights = guest1.nights;
        }

        // method to display objects
        void display(){
            System.out.println("Name : " + this.name);
            System.out.println("Room Type : "+ this.roomType);
            System.out.println("Number of night stay : "+this.nights);
        }

    }

    public static void main(String[] args) {

        guest p1 = new guest();
        p1.name = "Bruce";
        p1.roomType = "AC";
        p1.nights = 2;

        guest p2 = new guest(); // using default constructor

        guest p3 = new guest("Clark","AC",4); // using parameterized constructor

        guest p4 = new guest(p1);

        p1.display();
        p2.display();
        p3.display();
        System.out.println("Copied constructor :");
        p4.display();

        /*Name : Bruce
Room Type : AC
Number of night stay : 2
Name : Peter
Room Type : Non AC
Number of night stay : 3
Name : Clark
Room Type : AC
Number of night stay : 4
Copied constructor :
Name : Bruce
Room Type : AC
Number of night stay : 2 */
    }
}
