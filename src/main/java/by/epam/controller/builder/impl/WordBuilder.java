package by.epam.controller.builder.impl;

import by.epam.bean.Word;
import by.epam.controller.builder.Delimiters;
import by.epam.controller.builder.PartOfTextKind;
import by.epam.controller.composit.Ellyment;

import by.epam.controller.composit.impl.WordEllyment;

import java.util.ArrayList;
import java.util.List;

public class WordBuilder extends BuilderChainContainer {

    public WordBuilder() {
        super(Delimiters.WORD, PartOfTextKind.WORD);
    }

    public List<Ellyment> build(String text) {
        String[] strings = split(text);
        return createWords(strings);
    }

    private List<Ellyment> createWords(String[] strings) {
        List<Ellyment> list = new ArrayList<>();
        for (String string : strings){
            list.add(new WordEllyment(new Word(string)));
        }
        return list;
    }

    public BuilderChainContainer linkWith(BuilderChainContainer builder){
        throw new ClassCastException("trying use linkWith on last cain ellyment");
    }}
