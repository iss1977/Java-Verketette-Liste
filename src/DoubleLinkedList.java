public class DoubleLinkedList {


    private  DoubleLinkedListElement start = null;
    private  DoubleLinkedListElement end = null;
    private int numberOfElements = 0 ;

    //constructor - link start to stop
    public DoubleLinkedList(){
        start = new DoubleLinkedListElement();
        end= new DoubleLinkedListElement();
        start.next = end;
        end.prev   = start;
    }

    // inner CLASS with the elements between start and end
    private static class DoubleLinkedListElement {
        private DoubleLinkedListElement prev, next;
        private Adresse data;

        //constructor - no parameters
        public DoubleLinkedListElement(){
            this.data = null;
        }

        public DoubleLinkedListElement(Adresse toInsert){
            this.data = new Adresse(toInsert);
        }

        // constructor with parameters
        public DoubleLinkedListElement( String  stadt, String strasse, String hausnummer){
            this.data = new Adresse( stadt,  strasse,  hausnummer);
        }

        public String toString() {
            return data.toString();
        }
    } //  end class DoubleLinkedListElement


    // display the list
    public void displayList(){
        DoubleLinkedListElement currPos = start.next;
        System.out.println("\r\nCurrent list of elements :"+( (start.next == end)?"< no elements >":"") );
        while(currPos != end){
            System.out.println(currPos.toString());
            currPos = currPos.next; // go to the next element
        }
    }

    // add a new element to the list at the end of the list:
    public boolean addElement(Adresse toInsert) {
        if (toInsert.stadt.isBlank() || toInsert.strasse.isBlank() || toInsert.hausnummer.isBlank()){
            System.out.println("Ungültige daten. Wurden nicht hinzugefügt.");
            return false;
        }
        else { // add the element to the end of the list
            DoubleLinkedListElement newElement = new DoubleLinkedListElement( toInsert );
            end.prev.next = newElement;
            newElement.next = end;
            newElement.prev=end.prev;
            end.prev=newElement;
            this.numberOfElements++;
            return true;
        }
    }

    public Adresse getDataFromIndex (int indexOfElement){
        DoubleLinkedListElement currPos = start.next;
        Adresse toReturn=null;

        int currPosIndex = 0;
        while(currPos != end){
            if (currPosIndex++ == indexOfElement) // found the searched element
                toReturn= currPos.data;
            currPos = currPos.next; // go to the next element
        }
        return toReturn;
    }

} // end class DoubleLinkedList

