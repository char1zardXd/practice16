package shomin.algoritm.practice.pr16;

public class Main {
    static void main(String[] args) {
        Vector myVec = new Vector();

        myVec.addElementFromEnd("лалала");
        myVec.addElementFromEnd("пупупу");
        System.out.println("элементов: " + myVec.getElements());
        System.out.println("в буфере: " + myVec.getElementsBuffer());
    }
}
