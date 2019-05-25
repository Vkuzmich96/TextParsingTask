package by.epam.controller.composit.impl;

import by.epam.controller.composit.Ellyment;

public class WordEllyment implements Ellyment {

    private String word;

    public WordEllyment(String word) {
        this.word = word;
    }

    @Override
    public String get() {
        return word;
    }
}
