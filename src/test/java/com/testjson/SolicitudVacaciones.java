package com.testjson;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
@Builder
public class SolicitudVacaciones {

        private String inicio;
        private String fin;
        private Integer d;
}
