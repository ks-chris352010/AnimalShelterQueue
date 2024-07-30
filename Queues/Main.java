package Queues;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter(5);

        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");

        System.out.println("Dequeuing any: " + shelter.dequeueAny());
        System.out.println("Dequeuing dog: " + shelter.dequeueDog());
        System.out.println("Dequeuing cat: " + shelter.dequeueCat());
        System.out.println("Dequeuing any: " + shelter.dequeueAny());
        System.out.println("Dequeuing any: " + shelter.dequeueAny());
        System.out.println("Dequeuing any: " + shelter.dequeueAny());
    }
}

// An animal shelter, which holds only dogs and cats, operates on a strictly
// "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
//  all animals at the shelter, or they can select whether they would
//  prefer a dog or a cat (and will receive the oldest animal of that type).
//   They cannot select which specific animal they would like.
//   Create the data structures to maintain this system and implement
//   operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.