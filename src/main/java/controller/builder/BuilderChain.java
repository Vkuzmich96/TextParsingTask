package controller.builder;

import bean.Ellyment;

public interface BuilderChain {
     Ellyment build (String text);
     BuilderChain linkWith (BuilderChain builder);
}
