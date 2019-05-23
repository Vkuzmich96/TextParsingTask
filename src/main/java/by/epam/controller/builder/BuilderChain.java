package by.epam.controller.builder;


public interface BuilderChain<T> {
     T build (String text);
     BuilderChain linkWith (BuilderChain builder);
}
