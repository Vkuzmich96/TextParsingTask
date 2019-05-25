package by.epam.controller.composit.impl;

import by.epam.controller.composit.PartOfTextKind;
import org.junit.Before;
import org.junit.Test;

public class PartOfTextTest {

    private final PartOfTextContainer text = new PartOfTextContainer(PartOfTextKind.TEXT);
    private final PartOfTextContainer part = new PartOfTextContainer(PartOfTextKind.PARAGRAPH);
    private final PartOfTextContainer sentence = new PartOfTextContainer(PartOfTextKind.SENTENCE);

    @Before
    public void prepare(){
        sentence.add(new WordEllyment("abcdfdg"));
        sentence.add(new WordEllyment("abc"));
        sentence.add(new WordEllyment("abcfdsfs"));

        part.add(sentence);
        part.add(sentence);
        part.add(sentence);

        text.add(part);
        text.add(part);
    }

    @Test
    public void get() {
        System.out.println(text.get());
    }
}