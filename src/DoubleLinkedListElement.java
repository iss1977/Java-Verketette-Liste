public class DoubleLinkedList {


    public DoubleLinkedList next = null;
    public DoubleLinkedList prev = null;

    private  class DoubleLinkedListElement {
        private DoubleLinkedListElement prev, next;
        private int numberOfElements = 0;

        public void add(String stadt, String strasse, String hausnummer) {

        }
    }


    public void addElement(String  stadt, String strasse, String hausnummer) {
            DoubleLinkedListElement newElement = new DoubleLinkedListElement();
            newElement.add(stadt,strasse,hausnummer);
    }

}

