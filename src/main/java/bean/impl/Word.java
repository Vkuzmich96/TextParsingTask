package bean.impl;

import bean.Ellyment;

public class Word implements Ellyment {

    private String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String get() {
        return word;
    }
}
