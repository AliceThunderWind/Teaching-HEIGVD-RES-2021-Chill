package ch.heigvd.res.chill.domain.stephaneb1;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Calvinus implements IProduct {

    public final static String NAME = "Calvinus";
    public final static BigDecimal PRICE = new BigDecimal(1.95);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}