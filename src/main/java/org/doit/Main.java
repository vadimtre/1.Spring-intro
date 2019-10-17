package org.doit;

import org.doit.abstractclasses.SimpleMessageRenderer;
import org.doit.abstractclasses.SimpleMesssageProvider;
import org.doit.interfaces.MessageRenderer;
import org.doit.interfaces.MesssageProvider;

public class Main {

    public static void main(String[] args) {
        //System.out.println(args[0]);
        MesssageProvider provider = new SimpleMesssageProvider();
        //MesssageProvider provider = new SimpleMesssageProvider();
        MessageRenderer renderer = new SimpleMessageRenderer(provider);
        renderer.render();
    }
}
