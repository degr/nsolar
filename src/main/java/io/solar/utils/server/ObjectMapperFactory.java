package io.solar.utils.server;

import org.codehaus.jackson.map.ObjectMapper;

public class ObjectMapperFactory {
    public ObjectMapper create() {
        return new ObjectMapper();
    }
}
