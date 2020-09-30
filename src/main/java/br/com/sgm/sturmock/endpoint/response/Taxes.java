package br.com.sgm.sturmock.endpoint.response;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

/**
 * Impostos
 */
@Builder
public class Taxes {

    private static final String AMOUNT = "amount";
    private static final String REGION_CODE = "region_code";

    @JsonProperty(AMOUNT)
    private BigDecimal amount;

    @JsonProperty(REGION_CODE)
    private String regionCode;
}
