package com.siriusxi.dp.behav.observer;

@FunctionalInterface
public interface Observer {
    void update(Message message);
}
