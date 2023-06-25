package main.java.homework2.market;

import main.java.homework2.actor.Actor;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

}