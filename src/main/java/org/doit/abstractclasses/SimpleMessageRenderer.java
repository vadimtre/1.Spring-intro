package org.doit.abstractclasses;

import org.doit.interfaces.MessageRenderer;
import org.doit.interfaces.MesssageProvider;

public class SimpleMessageRenderer implements MessageRenderer {

    private final MesssageProvider provider;

    public SimpleMessageRenderer(MesssageProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println(provider.getMessage());
    }
}
