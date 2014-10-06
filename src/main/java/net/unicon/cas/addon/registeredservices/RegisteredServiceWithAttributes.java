package net.unicon.cas.addon.registeredservices;

import org.jasig.cas.services.RegisteredService;

import java.util.Map;

/**
 * An extension to {@code RegisteredService} with extra arbitrary attributes.
 *
 * @author Dmitriy Kopylenko
 * @since 1.0.0
 */
public interface RegisteredServiceWithAttributes extends RegisteredService {

    /**
     * Extra metadata in a form of an arbitrary {@code Map}
     *
     *
     * @return extra attributes metadata attached to this instance of a registered service.
     */
    Map<String, Object> getExtraAttributes();
}
