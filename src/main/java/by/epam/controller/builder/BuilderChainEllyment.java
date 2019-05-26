package by.epam.controller.builder;

import by.epam.bean.PartOfText;
import by.epam.controller.builder.impl.WordBuilder;
import by.epam.controller.composit.Ellyment;
import by.epam.controller.composit.PartOfTextKind;
import by.epam.controller.composit.impl.PartOfTextContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class BuilderChainEllyment {
    private Pattern DELIMITER;
    private BuilderChainEllyment builder;

    public BuilderChainEllyment(Pattern delimiter) {
        this.DELIMITER = delimiter;
    }

    public List<Ellyment> build(String text) {
        List<Ellyment> list = new ArrayList<>();
        for (String string : DELIMITER.split(text)){
            PartOfText part = new PartOfText(PartOfTextKind.SENTENCE, nextBuild(string));
            list.add(new PartOfTextContainer(part));
        }
        return list;
    }

    private List<Ellyment> nextBuild(String string){
        return builder != null ? builder.build(string) : new ArrayList<>();
    }

    public BuilderChainEllyment linkWith(BuilderChainEllyment builder){
        this.builder = builder;
        return builder;
    }
}
