package com.tegres.serverless.aws;

import com.tegres.serverless.domain.AttributeData;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

/**
 * @author Edwin Gertse
 *
 * Expose Financial Interest Compound Calculator via HTTP for AWS Lambdas
 */
public class CalculatorHandler extends SpringBootRequestHandler<AttributeData, Float> {
}
