package Queues;

public class AnimalShelter {
    private QueueArray dogs;
    private QueueArray cats;
    private int order;

    public AnimalShelter(int size) {
        dogs = new QueueArray(size);
        cats = new QueueArray(size);
        order = 0;
    }

    // Enqueue a new animal:
    public void enqueue(String type) {
        Animal animal = new Animal(type, order++);
        if (type.equals("dog")) {
            dogs.enQueue(animal.order);
        } else if (type.equals("cat")) {
            cats.enQueue(animal.order);
        } else {
            System.out.println("Unknown animal type: " + type);
        }
    }

    // Dequeue any animal:
    public int dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("No animals available for adoption.");
            return -1;
        } else if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        } else {
            int oldestDogOrder = dogs.peek();
            int oldestCatOrder = cats.peek();

            if (oldestDogOrder < oldestCatOrder) {
                return dogs.deQueue(oldestDogOrder);
            } else {
                return cats.deQueue(oldestCatOrder);
            }
        }
    }

    // Dequeue a dog:
    public int dequeueDog() {
        if (dogs.isEmpty()) {
            System.out.println("No dogs available for adoption.");
            return -1;
        }
        return dogs.deQueue(dogs.peek());
    }

    // Dequeue a cat:
    public int dequeueCat() {
        if (cats.isEmpty()) {
            System.out.println("No cats available for adoption.");
            return -1;
        }
        return cats.deQueue(cats.peek());
    }
}