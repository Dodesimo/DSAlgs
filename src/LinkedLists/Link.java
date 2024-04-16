package LinkedLists;

public class Link {

    public int iData;
    public double dData;
    public Link nextLink;

    public Link(int i, double d) {

        iData = i;
        dData = d;
        //nextItem is automatically set to a null value.

    }

    public void displayLink() {

        System.out.println("{" + iData + ", " + dData + "}" );

    }

    public static class SortedList {

       private Link first;

       public SortedList() {

          first = null;

       }

       public boolean isEmpty() {

          return (first == null);

       }

       public void insert(double key) {

          Link newLink = new Link(0, key);
          Link previous = null;
          Link current = first;

          while (current != null && key > current.dData) {

             previous = current;
             current = current.nextLink;

          }

          if (previous == null) {

             current = newLink;

          } else {

             previous.nextLink = newLink;
          }
          newLink.nextLink = current;

       }

       public Link remove() {

          Link temp = first;
          first = first.nextLink;
          return temp;
       }

       public void displayList() {

          Link current = first;

          while (current != null) {

             current.displayLink();
             current = current.nextLink;
          }

       }

    }
}
