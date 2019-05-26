package by.epam.controller.builder.impl;

import by.epam.bean.Word;
import by.epam.controller.builder.Delimiters;
import by.epam.controller.composit.Ellyment;

import by.epam.controller.composit.impl.WordEllyment;

import java.util.ArrayList;
import java.util.List;

public class WordBuilder {
    public List<Ellyment> build(String text) {
        String[] strings = text.split(Delimiters.WORD);
        return createWords(strings);
    }

    private List<Ellyment> createWords(String[] strings) {
        List<Ellyment> list = new ArrayList<>();
        for (String string : strings){
            list.add(new WordEllyment(new Word(string)));
        }
        return list;
    }
}
