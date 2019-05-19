package controller.parser;

import controller.ControllerException;

import java.nio.file.Path;

public interface Parser {
    String parse(Path path) throws ControllerException;
}
