package com.testjson;

import lombok.*;

import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Empleado {
    private int id;
    private String nombre;
    private String empresa;

    private List<SolicitudVacaciones> vacaciones;
}
