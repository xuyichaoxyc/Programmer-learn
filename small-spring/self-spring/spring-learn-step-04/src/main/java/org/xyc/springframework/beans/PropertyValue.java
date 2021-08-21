package org.xyc.springframework.beans;

public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
