package com.aliceresponde.life;

public enum Cell {
    ALIVE, DEATH;

    private static final String DEATH_CHAR = "*";
    private static final String ALIVE_CHAR = ".";

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        switch (this) {
        case ALIVE:
            result.append(ALIVE_CHAR);
        case DEATH:
            result.append(DEATH_CHAR);
        }
        return result.toString();
    }
}
