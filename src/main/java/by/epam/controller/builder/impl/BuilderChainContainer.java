package by.epam.controller.builder.impl;

import by.epam.bean.PartOfText;
import by.epam.controller.builder.ChainEllyment;
import by.epam.controller.builder.PartOfTextKind;
import by.epam.controller.composit.Ellyment;
import by.epam.controller.composit.impl.PartOfTextContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BuilderChainContainer implements ChainEllyment<BuilderChainContainer> {
    protected Pattern DELIMITER;
    protected BuilderChainContainer builder;
    private PartOfTextKind kind;

    public BuilderChainContainer(Pattern delimiter, PartOfTextKind kind) {
        this.DELIMITER = delimiter;
        this.kind = kind;
    }

    public List<Ellyment> build(String text) {
        List<Ellyment> list = new ArrayList<>();
        for (String string : split(text)){
            PartOfText part = new PartOfText(kind, nextBuild(string));
            list.add(new PartOfTextContainer(part));
        }
        return list;
    }

    protected String[] split (String string){
        return DELIMITER.split(string);
    }

    private List<Ellyment> nextBuild(String string){
        return builder != null ? builder.build(string) : new ArrayList<>();
    }

    public BuilderChainContainer linkWith(BuilderChainContainer builder){
        this.builder = builder;
        return builder;
    }
}
