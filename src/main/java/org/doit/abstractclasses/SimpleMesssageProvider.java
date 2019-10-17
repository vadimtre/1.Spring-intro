package org.doit.abstractclasses;

import org.doit.interfaces.MesssageProvider;

public class SimpleMesssageProvider implements MesssageProvider {
    public String getMessage() {
        return "Hello world!";
    }
}
