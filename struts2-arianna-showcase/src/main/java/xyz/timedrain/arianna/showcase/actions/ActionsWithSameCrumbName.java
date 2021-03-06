package xyz.timedrain.arianna.showcase.actions;

import xyz.timedrain.arianna.plugin.BreadCrumb;

public class ActionsWithSameCrumbName extends ShowcaseAction {

    private static final long serialVersionUID = 1L;

    @BreadCrumb("Crumb-A")
    public String action_A1() {
        addMessage();
        return SUCCESS;
    }

    @BreadCrumb("Crumb-A")
    public String action_A2() {
        addMessage();
        return SUCCESS;
    }

    @BreadCrumb("Crumb-A")
    public String action_A3() {
        addMessage();
        return SUCCESS;
    }

    @BreadCrumb("Crumb-A")
    public String action_A4() {
        addMessage();
        return SUCCESS;
    }

    @BreadCrumb("Crumb-A")
    public String action_A5() {
        addMessage();
        return SUCCESS;
    }

    // Crumb-B Actions
    ////////////////////////////////////
    @BreadCrumb("Crumb-B")
    public String action_B1() {
        addMessage();
        return SUCCESS;
    }

    @BreadCrumb("Crumb-B")
    public String action_B2() {
        addMessage();
        return SUCCESS;
    }

    @BreadCrumb("Crumb-B")
    public String action_B3() {
        addMessage();
        return SUCCESS;
    }

    @BreadCrumb("Crumb-B")
    public String action_B4() {
        addMessage();
        return SUCCESS;
    }

    @BreadCrumb("Crumb-B")
    public String action_B5() {
        addMessage();
        return SUCCESS;
    }
}
