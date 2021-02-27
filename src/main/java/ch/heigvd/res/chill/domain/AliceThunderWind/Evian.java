package ch.heigvd.res.chill.domain.AliceThunderWind;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Evian implements IProduct {

    public final static String NAME = "Evian";
    public final static BigDecimal PRICE = new BigDecimal(1.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}