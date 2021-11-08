package com.docusign.esign.client;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;

import java.text.DateFormat;

import javax.ws.rs.ext.ContextResolver;



/**
 * JSON Class.
 *
 **/

public class JSON implements ContextResolver<ObjectMapper> {
  private ObjectMapper mapper;

 /**
  * JSON Class constructor doc.
  *
  **/
  public JSON() {
    mapper = new ObjectMapper();
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    mapper.setDateFormat(new RFC3339DateFormat());
  }

  /**
   * Returns the current object mapper used for JSON serialization/deserialization.
   * <p>
   * Note: If you make changes to the object mapper, remember to set it back via
   * <code>setObjectMapper</code> in order to trigger HTTP client rebuilding.
   * </p>
   * @return Object mapper
   */
  public ObjectMapper getObjectMapper() {
    return mapper;
  }

  public JSON setObjectMapper(ObjectMapper mapper) {
    this.mapper = mapper;
    return this;
  }

  /**
   * Set the date format for JSON (de)serialization with Date properties.
   * @param dateFormat Date format
   */
  public void setDateFormat(DateFormat dateFormat) {
    mapper.setDateFormat(dateFormat);
  }

  @Override
  public ObjectMapper getContext(Class<?> type) {
    return mapper;
  }
}
