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

}
