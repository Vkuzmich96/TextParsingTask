package by.epam.controller.builder;


public interface ChainEllyment<T> extends Builder {
     T linkWith (T builder);
}
