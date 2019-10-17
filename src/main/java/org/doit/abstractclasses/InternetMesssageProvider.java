package org.doit.abstractclasses;

import org.doit.interfaces.MesssageProvider;

public class InternetMesssageProvider implements MesssageProvider {
    public String getMessage() {
        return "Message received from the Internet";
    }
}
