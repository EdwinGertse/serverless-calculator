package com.tegres.serverless.calculator;

import com.tegres.serverless.domain.AttributeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Calculator implements Function<AttributeData, Float> {

    private FinancialCalculator financialCalculator;

    @Autowired
    public Calculator(FinancialCalculator financialCalculator) {
        this.financialCalculator = financialCalculator;
    }

    @Override
    public Float apply(AttributeData attributes) {
        return financialCalculator.calculateCompoundedInterest(attributes.getPrincipalInvestment(),
                attributes.getAnnualInterestRate(),
                attributes.getNumberOfInterestCompoundedPerYear(),
                attributes.getNumberOfYearsForInvestment());
    }
}
