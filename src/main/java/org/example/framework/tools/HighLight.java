package org.example.framework.supports.tools;

public enum HighLight {

    RED("arguments[0].style.outline='2px solid #ef5350'"),
    BLUE("arguments[0].style.outline='2px solid #42a5f5'"),
    GREEN("arguments[0].style.outline='2px solid #66bb6a'"),
    BLACK("arguments[0].style.outline='2px solid #000000'");

    private final String argument;

    HighLight(String argument) {
        this.argument = argument;
    }

    public String getArgument() {
        return argument;
    }

}
