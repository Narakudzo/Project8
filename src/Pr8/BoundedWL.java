package Pr8;

public class BoundedWL<E> extends WaitList<E>{

    private int capacity;

    public BoundedWL(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(E element) {

        if(this.content.size() < this.capacity) {
            super.add(element);
        }

    }

    @Override
    public String toString() {

        return this.content.toString() + ". Capacity " + this.capacity;
    }
}

