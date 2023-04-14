import java.util.*;

class IteratorDemo{
    public static void main(String...a){
        ArrayList<String> Aa = new ArrayList<String>();
        Aa.add("A");
        Aa.add("B");
        Aa.add("C");
        Iterator<String> aI = Aa.iterator();
        System.out.print("Original contents: ");
        while(aI.hasNext()){
            System.out.print(aI.next() + " ");
        }

        System.out.println();

        ListIterator<String> aL = Aa.listIterator();
        while(aL.hasNext()){
            aL.set(aL.next() + "+");
        }
        aL = Aa.listIterator();
        System.out.print("Content after modification: ");
        while(aL.hasNext()){
            System.out.print(aL.next() + ' ');
        }

        System.out.print("Content reversed: ");

        while(aL.hasPrevious()){
            System.out.print(aL.previous() + " ");
        }


    }
}