package com.tegres.serverless.calculator;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FinancialCalculator {
    /**
     * Calculate the compounded interest.
     * @param principalInvestment
     * @param annualInterestRate
     * @param numberOfInterestCompoundedPerYear
     * @param numberOfYearsForInvestment
     * @return Investment amount
     */
    public float calculateCompoundedInterest(float principalInvestment,
                                             int annualInterestRate,
                                             int numberOfInterestCompoundedPerYear,
                                             int numberOfYearsForInvestment) {
        /**
         * A = P(1+r/n)(nt)
         */
        BigDecimal sum = BigDecimal.valueOf(((float)annualInterestRate / 100) / numberOfInterestCompoundedPerYear)
                .add(BigDecimal.ONE);
        int power = numberOfInterestCompoundedPerYear * numberOfYearsForInvestment;
        return principalInvestment * (sum.pow(power)).floatValue();
    }
}
