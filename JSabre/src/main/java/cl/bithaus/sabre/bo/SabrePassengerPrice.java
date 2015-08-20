package cl.bithaus.sabre.bo;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabrePassengerPrice {

    private int passengerQuantity;
    private BigDecimal taxesTotal;
    private BigDecimal priceBase;
    private List<Tax> priceTaxes;
    private String passengerType;
    private BigDecimal total;

    /**
     *
     * @return
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     *
     * @param total
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     *
     * @return
     */
    public int getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     *
     * @param passengerQuantity
     */
    public void setPassengerQuantity(int passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    /**
     *
     * @return
     */
    public BigDecimal getTaxesTotal() {
        return taxesTotal;
    }

    /**
     *
     * @param taxesTotal
     */
    public void setTaxesTotal(BigDecimal taxesTotal) {
        this.taxesTotal = taxesTotal;
    }

    /**
     *
     * @return
     */
    public BigDecimal getPriceBase() {
        return priceBase;
    }

    /**
     *
     * @param priceBase
     */
    public void setPriceBase(BigDecimal priceBase) {
        this.priceBase = priceBase;
    }

    /**
     *
     * @return
     */
    public List<Tax> getPriceTaxes() {
        return priceTaxes;
    }

    /**
     *
     * @param priceTaxes
     */
    public void setPriceTaxes(List<Tax> priceTaxes) {
        this.priceTaxes = priceTaxes;
    }

    /**
     *
     * @return
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     *
     * @param passengerType
     */
    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    @Override
    public String toString() {
        return "PassengerPrice{" + "\n\t\ttaxesTotal=" + taxesTotal + ", \n\t\tpriceBase=" + priceBase + ", \n\t\tpriceTaxes=" + priceTaxes + ", \n\t\tpassengerType=" + passengerType + ", \n\t\ttotal=" + total + "\n\t\t}";
    }

    /**
     *
     * @param prefix
     * @return
     */
    public String toStringCustom(String prefix) {
        String str = "PsgPx(TaxTotal=" + taxesTotal + ",pxBase=" + priceBase + ",psgTyp=" + passengerType + ",total=" + total + ") \n";
        for (Tax t : priceTaxes) {

            str += prefix + t.toStringCustom() + "\n";
        }

        return str;

    }

    /**
     *
     */
    public static class Tax {

        private BigDecimal amount;
        private String code;
        private String description;

        /**
         *
         * @return
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         *
         * @param amount
         */
        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        /**
         *
         * @return
         */
        public String getCode() {
            return code;
        }

        /**
         *
         * @param code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /**
         *
         * @return
         */
        public String getDescription() {
            return description;
        }

        /**
         *
         * @param description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Tax{" + "\n\t\t\tamount=" + amount + ", \n\t\t\tcode=" + code + ", \n\t\t\tdescription=" + description + "\n\t\t\t}";
        }

        /**
         *
         * @return
         */
        public String toStringCustom() {
            return "Tax(" + code + " $" + amount + " " + description + ") ";
        }

    }

}
