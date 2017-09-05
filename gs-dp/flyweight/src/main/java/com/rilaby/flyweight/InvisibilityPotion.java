package com.rilaby.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InvisibilityPotion implements Potion {

    private static final Logger logger = LoggerFactory.getLogger(InvisibilityPotion.class);

    @Override
    public void drink() {
        logger.info("You become invisible. (Potion={})", System.identityHashCode(this));
    }
}
