package org.doit2property;

import org.doit.interfaces.MessageRenderer;
import org.doit.interfaces.MesssageProvider;

import java.io.InputStream;
import java.util.Properties;

public class MessageFactory {
    private static MesssageProvider provider;
    private static MessageRenderer renderer;

    static {
        Properties properties = new Properties();
        try (InputStream in = MessageFactory.class.getClassLoader().getResourceAsStream("app.properties")) {
            properties.load(in);
            String messageProviderClass = properties.getProperty("MessageProviderClass");
            String messageRendererClass = properties.getProperty("MessageRendererClass");
            provider = (MesssageProvider) Class.forName(messageProviderClass).newInstance();
            renderer = (MessageRenderer) Class.forName(messageRendererClass).getConstructor(MesssageProvider.class).newInstance(provider);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MesssageProvider getProvider() {
        return provider;
    }

    public static MessageRenderer getRenderer() {
        return renderer;
    }
}
