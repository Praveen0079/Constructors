public class LibraryBook {
    static class Book{
        String title;
        String author;
        double price;
        boolean avaibility;

        // Default constructor
        public Book() {
            this.title = "A Song of Ice and Fire";
            this.author = "George R. R. Martin";
            this.price = 59.99;
            this.avaibility  = true;
        }

        // Parameterized constructor
        public Book(String title, String author, double price, boolean avaibility) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.avaibility = avaibility;
        }
        //method to borrow book
        void borrow(){
            if(this.avaibility==true){
                System.out.println("Book Borrowed ! ");
                System.out.println("Title : "+this.title);
                System.out.println("Author : "+this.author);
                System.out.println("Price per month :"+ this.price);
                System.out.println("------------------------");
            }
            else System.out.println(this.title+" by "+this.author+" is Not available");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Silent Patient","Alex Michaelides",59,true);
        Book book3 = new Book("Atomic Habits","James Clear",89,false);

        book1.borrow();
        book2.borrow();
        book3.borrow();

    }
    /*Book Borrowed !
Title : A Song of Ice and Fire
Author : George R. R. Martin
Price per month :59.99
------------------------
Book Borrowed !
Title : The Silent Patient
Author : Alex Michaelides
Price per month :59.0
------------------------
Atomic Habits by James Clear is Not available*/
}
