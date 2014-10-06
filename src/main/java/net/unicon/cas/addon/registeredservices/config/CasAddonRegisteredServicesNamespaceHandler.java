package net.unicon.cas.addon.registeredservices.config;

import net.unicon.cas.addon.registeredservices.RegisteredServicesReloadDisablingBeanFactoryPostProcessor;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.w3c.dom.Element;

/**
 * {@link org.springframework.beans.factory.xml.NamespaceHandler} for convenient CAS configuration namespace of registered services addon module.
 *
 * @author Dmitriy Kopylenko
 * @since 1.0.0
 */
public class CasAddonRegisteredServicesNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("disable-default-registered-services-reloading", new RegisteredServicesReloadDisablingBFPPBeanDefinitionParser());
    }

    /**
     * Parses <pre>disable-default-registered-services-reloading</pre> elements into bean definitions of type {@link RegisteredServicesReloadDisablingBeanFactoryPostProcessor}
     */
    private static class RegisteredServicesReloadDisablingBFPPBeanDefinitionParser extends
            AbstractSingleBeanDefinitionParser {

        @Override
        protected Class<?> getBeanClass(Element element) {
            return RegisteredServicesReloadDisablingBeanFactoryPostProcessor.class;
        }

        @Override
        protected boolean shouldGenerateId() {
            return true;
        }
    }
}
