public class Main {
    public static void main(String[] args) {

        // create an object to hold my list
        DoubleLinkedList myList1 = new DoubleLinkedList();

        // display the empty list
        myList1.displayList();

        // adding 3 elements to the list and display it afterwards
        myList1.addElement(new Adresse("Linz", "Peter Behrens","12A"));
        myList1.addElement(new Adresse("Graz", "Grazergasse","1B"));
        myList1.addElement(new Adresse("Salzburg", "Salzburgerstrasse",""));
        myList1.displayList();

        // get data from index
        Adresse myAdresse = myList1.getDataFromIndex(0);
        System.out.println("Data from element nr. 0 is ..."+myAdresse.toString());
         myAdresse = myList1.getDataFromIndex(1);
        System.out.println("Data from element nr. 1 is ..."+myAdresse.toString());
         myAdresse = myList1.getDataFromIndex(2);
        System.out.println("Data from element nr. 2 is ..."+myAdresse.toString());
    }
}
