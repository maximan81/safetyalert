package com.safetynet.alert.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@lombok.Generated
public class FireStation {

  private String  station;


  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;

    if( ! (obj instanceof FireStation) ) return false;

    FireStation other = (FireStation) obj;

    return Objects.equals(this.station, other.station);
  }

  @Override
  public int hashCode() {
    return station.length();
  }

}