package by.epam.controller.builder.impl;

import by.epam.controller.composit.Ellyment;
import by.epam.controller.composit.PartOfTextKind;
import by.epam.controller.composit.impl.PartOfTextContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SentenceBuilder {
    private static final Pattern SENTENCE_DELIMETER = Pattern.compile("[.!?]\r?");
    private WordBuilder wordBuilder = new WordBuilder();

    public List<Ellyment> build(String text) {
        String[] strings = SENTENCE_DELIMETER.split(text);
        return createWords(strings);
    }

    private List<Ellyment> createWords(String[] strings) {
        List<Ellyment> list = new ArrayList<>();
        for (String string : strings){
            list.add(new PartOfTextContainer(PartOfTextKind.SENTENCE, wordBuilder.build(string)));
        }
        return list;
    }
}
