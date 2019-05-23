package by.epam.controller.builder.impl;

import by.epam.controller.composit.Ellyment;
import by.epam.controller.composit.PartOfTextKind;
import by.epam.controller.composit.impl.PartOfText;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ParagraphBuilder {
    private SentenceBuilder sentenceBuilder = new SentenceBuilder();
    private static final Pattern PARAGRAPH_DELIMETER = Pattern.compile("\n(\\s{4,}|\t)");

    public List<Ellyment> build(String text) {
        String[] strings = PARAGRAPH_DELIMETER.split(text);
        return createWords(strings);
    }

    private List<Ellyment> createWords(String[] strings) {
        List<Ellyment> list = new ArrayList<>();
        for (String string : strings){
            list.add(new PartOfText(PartOfTextKind.PARAGRAPH, sentenceBuilder.build(string)));
        }
        return list;    }
}
