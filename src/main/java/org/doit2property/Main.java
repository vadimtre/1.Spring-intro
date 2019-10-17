package org.doit2property;

import org.doit.interfaces.MessageRenderer;
import org.doit.interfaces.MesssageProvider;

public class Main {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        MesssageProvider provider = MessageFactory.getProvider();
        MessageRenderer renderer = MessageFactory.getRenderer();
        renderer.render();
    }
}
