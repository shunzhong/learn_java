package com.github.designpattern.visitor;

public interface Element {
    void accept(Visitor visitor);
}
