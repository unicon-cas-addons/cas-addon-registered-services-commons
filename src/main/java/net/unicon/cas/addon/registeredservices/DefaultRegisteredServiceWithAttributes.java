package net.unicon.cas.addon.registeredservices;

import org.jasig.cas.services.AbstractRegisteredService;
import org.jasig.cas.services.RegisteredServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * An extension to {@code RegisteredServiceImpl} with extra arbitrary attributes.
 *
 * @author Dmitriy Kopylenko
 * @since 1.0.0
 */
public class DefaultRegisteredServiceWithAttributes extends RegisteredServiceImpl implements RegisteredServiceWithAttributes {

    private static final long serialVersionUID = 1L;

    private Map<String, Object> extraAttributes = new HashMap<>();

    @Override
    public Map<String, Object> getExtraAttributes() {
        return this.extraAttributes;
    }

    public void setExtraAttributes(final Map<String, Object> extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    @Override
    protected AbstractRegisteredService newInstance() {
        return new DefaultRegisteredServiceWithAttributes();
    }
}
