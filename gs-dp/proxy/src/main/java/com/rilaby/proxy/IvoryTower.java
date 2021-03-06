package com.rilaby.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IvoryTower implements WizardTower {

    private static final Logger logger = LoggerFactory.getLogger(IvoryTower.class);

    public void enter(Wizard wizard) {
        logger.info("{} enters the tower.", wizard);
    }

}
