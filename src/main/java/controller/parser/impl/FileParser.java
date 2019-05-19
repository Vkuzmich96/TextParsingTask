package controller.parser.impl;

import controller.ControllerException;
import controller.parser.Parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileParser implements Parser {

    public String parse(Path path) throws ControllerException {
        try {
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes);
        }catch (IOException e){
            throw new ControllerException("Path is not valid", e);
        }
    }
}
