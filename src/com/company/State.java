package com.company;

public class State {
    private String stateName;
    private String stateAbrev;

    public State() {
        this("-nowhere-", "00");
    }

    public State(String stateName, String stateAbrev) {
        this.stateName = stateName;
        if (stateAbrev.length() == 2)
            this.stateAbrev = stateAbrev;
        else
            this.stateAbrev = "00";
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateAbrev() {
        return stateAbrev;
    }
}
