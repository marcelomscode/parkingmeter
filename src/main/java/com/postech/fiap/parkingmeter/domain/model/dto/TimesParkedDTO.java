package com.postech.fiap.parkingmeter.domain.model.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimesParkedDTO {

  private LocalDateTime date;
  private Integer timesParked;
}
