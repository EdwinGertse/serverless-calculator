package com.tegres.serverless.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttributeData {
    private float principalInvestment;
    private int annualInterestRate;
    private int numberOfInterestCompoundedPerYear;
    private int numberOfYearsForInvestment;
}
