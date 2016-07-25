import java.math.BigDecimal;

/**
 * Created by marek on 7/25/16.
 */
public class Calculator {

    public static void main(String[] args) {
        BigDecimal principalSum = new BigDecimal("1000");
        BigDecimal nominalInterestRate = new BigDecimal("0.1");
        BigDecimal compoundingFrequency = new BigDecimal("5");
        BigDecimal numberOfYear = new BigDecimal("5");

        System.out.println(getAccumulatedValue(principalSum, nominalInterestRate, compoundingFrequency, numberOfYear));

    }

    public static BigDecimal getAccumulatedValue(BigDecimal principalSum, BigDecimal nominalInterestRate, BigDecimal compoundingFrequency, BigDecimal numberOfYear){
        BigDecimal ulamek = nominalInterestRate.divide(compoundingFrequency);
        BigDecimal nawias = ulamek.add(new BigDecimal("1"));
        BigDecimal wykładnik = numberOfYear.multiply(compoundingFrequency);
        BigDecimal potega = nawias.pow(wykładnik.intValue());



        return principalSum.multiply(potega);

    }

}
