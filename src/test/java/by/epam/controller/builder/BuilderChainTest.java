package by.epam.controller.builder;

import by.epam.controller.composit.Ellyment;
import org.junit.Test;

public class BuilderChainTest {
    private final BuilderChain<Ellyment> chain = BuilderChainFactory.getInstance().get(BuilderKey.TEXT_PARSER);

    @Test
    public void build() {
        String string = chain.build("lorenIpsum").get();
        System.out.println(string);
    }
}