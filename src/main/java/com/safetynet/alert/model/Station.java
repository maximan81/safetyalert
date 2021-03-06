package com.safetynet.alert.model;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The FireStation class implements a fireStation
 * entity.
 *
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@lombok.Generated
public class Station {

  private String station;


  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (!(obj instanceof Station)) {
      return false;
    }

    Station other = (Station) obj;

    return Objects.equals(this.station, other.station);
  }

  @Override
  public int hashCode() {
    return station.length();
  }

}
