package com.testjson.Models;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Images {
    private String iconExtension;
    private String iconCreditCard;
    private String icon;
    private String brand;
}
