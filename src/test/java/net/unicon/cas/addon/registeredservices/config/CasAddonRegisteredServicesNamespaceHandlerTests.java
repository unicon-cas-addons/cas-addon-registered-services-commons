package net.unicon.cas.addon.registeredservices.config;

import net.unicon.cas.addon.registeredservices.RegisteredServicesReloadDisablingBeanFactoryPostProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author Dmitriy Kopylenko
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CasAddonRegisteredServicesNamespaceHandlerTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void registeredServicesReloadDisablingBFPPBeanDefinitionCorrectlyParsed() {
        assertTrue(applicationContext.getBeansOfType(RegisteredServicesReloadDisablingBeanFactoryPostProcessor.class).size() == 1);
    }
}
