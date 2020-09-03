public class Main {
    public static void main(String[] args) {
        DoubleLinkedListElement start, end;
        start = new DoubleLinkedListElement("Start");
        end = new DoubleLinkedListElement("End");

        start.next = end;
        start.prev = end;
        end.prev = start;
        end.next=start;


        for (int i = 0; i < 10; i++) {
            DoubleLinkedListElement el = new DoubleLinkedListElement(Integer.toString(i));

            end.prev.next  = el;
            el.next = end;
            end.prev = el;
            el.next = end;



            



        }

        DoubleLinkedListElement currentElement= start;

        while (currentElement.next!=start ) {

            System.out.println(currentElement.data);
            currentElement=currentElement.next;
        }
    }
}
