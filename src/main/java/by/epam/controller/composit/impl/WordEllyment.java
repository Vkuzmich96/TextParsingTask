package by.epam.controller.composit.impl;

import by.epam.bean.Word;
import by.epam.controller.composit.Ellyment;

public class WordEllyment implements Ellyment {

    private Word word;

    public WordEllyment(Word word) {
        this.word = word;
    }

    @Override
    public String get() {
        return word.getWord();
    }
}
