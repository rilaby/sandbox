package com.rilaby.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoisonPotion implements Potion {

    private static final Logger logger = LoggerFactory.getLogger(PoisonPotion.class);

    @Override
    public void drink() {
        logger.info("Urgh! This is poisonous. (Potion={})", System.identityHashCode(this));
    }
}
