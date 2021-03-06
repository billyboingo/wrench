package com.erigir.wrench;

import java.math.BigDecimal;

/**
 * Utils for working with BigDecimals as currency
 */
public class CurrencyUtils {
    public static final BigDecimal HUNDRED = new BigDecimal("100");

    public static BigDecimal roundToCentRound(BigDecimal b) {
        if (b == null) {
            return null;
        }
        return b.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal roundToCentRound(String s) {
        if (s == null) {
            return null;
        }
        BigDecimal b = new BigDecimal(s);
        return b.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal roundToCentRound(Number n) {
        if (n == null) {
            return null;
        }

        BigDecimal b = new BigDecimal(String.valueOf(n));
        return b.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Null-safe add for big decimal
     *
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal nsa(BigDecimal b1, BigDecimal b2) {
        BigDecimal ib1 = (b1 == null) ? BigDecimal.ZERO : b1;
        BigDecimal ib2 = (b2 == null) ? BigDecimal.ZERO : b2;
        return ib1.add(ib2);
    }

}
