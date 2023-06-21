package com.sda.she_likes_java.mine_tasks.ship_batle;

public class SimpleStartup {
    int[] locationCells;
    int numberOfHints;

    public int[] getLocationCells() {
        return locationCells;
    }

    public int getNumberOfHints() {
        return numberOfHints;
    }

    public void setNumberOfHints(int numberOfHints) {
        this.numberOfHints = numberOfHints;
    }

    String checkYourself(int guess) {
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numberOfHints++;
                break;
            }
            if (numberOfHints == locationCells.length) {
                result = "kill";
            }
            System.out.println(result);
        }

        return result;
    }

    void setLocationCells(int[] locs) {
        locationCells = locs;

    }
}
