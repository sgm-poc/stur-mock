package br.com.sgm.sturmock.endpoint;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.sgm.sturmock.endpoint.response.Taxes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoint mockado
 */
@Slf4j
@CrossOrigin("*")
@RestController
@RequestMapping("/stur/taxes")
public class TaxMockedEndpoint {

    @GetMapping
    public ResponseEntity<List<Taxes>> getAllTaxes() {

        log.info("getAllTaxes:"+ LocalDateTime.now().toString());

        final var taxes =
                List.of(
                        Taxes.builder().amount(BigDecimal.valueOf(1000L)).regionCode("CNTR").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(2000L)).regionCode("LEST").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(3000L)).regionCode("OEST").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(4000L)).regionCode("NORT").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(5000L)).regionCode("SUL").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(10000L)).regionCode("RUR1").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(20000L)).regionCode("RUR2").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(30000L)).regionCode("RUR3").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(40000L)).regionCode("RUR4").build(),
                        Taxes.builder().amount(BigDecimal.valueOf(50000L)).regionCode("RUR5").build()
                );
        return ResponseEntity.ok(taxes);
    }
}
