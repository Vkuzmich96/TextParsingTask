package bean.impl;

import bean.PartOfTextKind;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartOfTextTest {

    private final PartOfText text = new PartOfText(PartOfTextKind.TEXT);
    private final PartOfText part = new PartOfText(PartOfTextKind.PARAGRAPH);
    private final PartOfText sentence = new PartOfText(PartOfTextKind.SENTENCE);

    @Before
    public void prepare(){
        sentence.add(new Word("abcdfdg"));
        sentence.add(new Word("abc"));
        sentence.add(new Word("abcfdsfs"));

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