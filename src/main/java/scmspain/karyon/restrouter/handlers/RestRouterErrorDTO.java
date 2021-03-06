package scmspain.karyon.restrouter.handlers;

import java.time.Instant;

/**
 * <p>
 * DTO generated by default error handler that will be serialized in case of error.
 * This object will never be generated if the {@link ErrorHandler} configured handlers
 * all errors.
 * </p>
 * <p>
 * All attributes of this class should be String or primitive types to be as simple as
 * we can to support whatever serializer is used.
 * </p>
 */
public final class RestRouterErrorDTO {

  private String description;
  private String timestamp;

  RestRouterErrorDTO(String description) {
    this.description = description;
    this.timestamp = Instant.now().toString();
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @return timestamp formatted using ISO-8601 aka Zulu time
   */
  public String getTimestamp() {
    return timestamp;
  }
}
