package shomin.algoritm.practice.pr16;

public class Vector {
    private String[] vectorArray;
    public int size = 0;


    public Vector() {
        vectorArray = new String[10];
    }

    public void addElementFromEnd (String element) {
        if (size == vectorArray.length) {
            grow();
        }

        vectorArray[size] = element;
        size++;
    }

    private void grow() {
        int newCapacity = vectorArray.length * 2;
        String[] newArray = new String[newCapacity];

        System.arraycopy(vectorArray, 0, newArray, 0, vectorArray.length);

        vectorArray = newArray;
    }

    public void addElementToIndex (int index, String element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + "Размер: " + element);
        }

        if (size == vectorArray.length) {
            grow();
        }

        System.arraycopy(vectorArray, index, vectorArray, index + 1, size - index);

        vectorArray[index] = element;
        size++;
    }

    public void deleteElementToIndex (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + "Размер: " + size);
        }

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(vectorArray, index + 1, vectorArray, index, numMoved);
        }

        vectorArray[size - 1] = null;
        size--;
    }

    public void deleteElementFromEnd () {
        if (size == 0) {
            throw new IllegalArgumentException("Масив пуст");
        }

        vectorArray[size - 1] = null;
        size--;
    }

    public String getElements () {
        return "";
    }

    public int getElementsBuffer () {
        return vectorArray.length;
    }
}
