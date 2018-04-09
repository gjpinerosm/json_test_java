package com.testjson.Models;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Products {
    private String id;
    private String type;
    private String name;
    private String number;
    private String status;
    private Integer availableBalance;
    private Integer block;
    private Integer purse;
    private String relation;
    private Props props;
}
