package edu.wctc.dice.impl;

import edu.wctc.dice.iface.Dice;

import java.util.Random;

public class Die6Roller implements Dice {


    @Override
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
