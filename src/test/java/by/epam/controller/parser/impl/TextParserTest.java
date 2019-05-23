package by.epam.controller.parser.impl;

import by.epam.controller.ControllerException;
import static org.junit.Assert.*;
import org.junit.Test;


import java.nio.file.Paths;

public class TextParserTest {
    private final FileParser parser = new FileParser();

    @Test
    public void parse() throws ControllerException {
        String text = parser.parse( Paths.get("lorenIpsum"));
        assertNotNull(text);
    }

    @Test(expected = ControllerException.class)
    public void parseWithError() throws ControllerException {
        String text = parser.parse( Paths.get("lornIpsum"));
        assertNotNull(text);
    }
}