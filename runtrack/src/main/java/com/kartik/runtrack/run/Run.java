package com.kartik.runtrack.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime started_on,
        LocalDateTime completed_on,
        @Positive
        Integer miles,
        Location location
) {


}
