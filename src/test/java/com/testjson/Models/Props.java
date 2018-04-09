package com.testjson.Models;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Props {

    private String nextCutoffDate;
    private Integer causedInterest;
    private String dueDate;
    private String icon;
    private Integer usedCredit;
    private Integer minimumPaymentDue;
    private Integer lastAmount;
    private Integer availableAdvances;
    private String pciNumber;
    private Integer pointsExpiringSoon;
    private String directDebitIndicator;
    private String iconExtension;
    private Integer totalPayment;
    private String pointsExpiryDate;
    private String iconCreditCard;
    private Integer overdue;
    private String cutOffDate;
    private String lastPaymentDate;
    private Integer overdueDays;
    private String brand;
    private Boolean isBlockable;
    private Integer totalAccumulatedPoints;
    private Boolean closeToDue;
    private Images images;
    private Integer blockStatus;
    private String productSignature;
    private Integer limitPurchase;
    private String pciSignature;
    private Integer totalQuota;
    private Integer availablePurchase;
    private String shortName;
    private String cardNumber;
}
