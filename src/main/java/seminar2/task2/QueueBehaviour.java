package main.java.seminar2.task2;

import main.java.seminar2.task1.Actor;


public interface QueueBehaviour {

    void takeInQueue(Actor actor);  // очередь
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

}
