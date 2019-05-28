package by.epam.controller.builder;

import by.epam.bean.PartOfTextKind;
import by.epam.controller.builder.impl.BuilderChainContainer;
import by.epam.controller.builder.impl.TextBuilder;
import by.epam.controller.builder.impl.WordBuilder;
import by.epam.service.composit.Ellyment;

import java.util.HashMap;
import java.util.Map;

public class BuilderChainFactory {

    private final static BuilderChainFactory factory = new BuilderChainFactory();

    private final Map<BuilderKey, Builder<Ellyment>> map = new HashMap<>();

    public static BuilderChainFactory getInstance() {
        return factory;
    }

    public Builder<Ellyment> get(BuilderKey key){
        return map.get(key);
    }

    private BuilderChainFactory(){
        TextBuilder builder = new TextBuilder();
        builder.linkWith(new BuilderChainContainer(Delimiters.PARAGRAPH, PartOfTextKind.PARAGRAPH))
               .linkWith(new BuilderChainContainer(Delimiters.SENTENCE, PartOfTextKind.SENTENCE))
               .linkWith(new WordBuilder());

        map.put(BuilderKey.TEXT_PARSER, builder);

    }

}
