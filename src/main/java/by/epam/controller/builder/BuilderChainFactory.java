package by.epam.controller.builder;

import java.util.HashMap;
import java.util.Map;

public class BuilderChainFactory {

    private final static BuilderChainFactory factory = new BuilderChainFactory();

    private final Map<BuilderKey, BuilderChain> map = new HashMap<>();

    public static BuilderChainFactory getInstance() {
        return factory;
    }

    public BuilderChain get(BuilderKey key){
        return map.get(key);
    }

    private BuilderChainFactory(){
//        map.put(BuilderKey.TEXT_PARSER,
//                new WordBuilder()
//
    }

}
