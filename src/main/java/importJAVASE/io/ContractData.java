package importJAVASE.io;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author cln
 * @version $Id: ContractData.java v 0.1 18-9-27 下午2:49 cln Exp $$
 */
public class ContractData implements Serializable {
    private static final long serialVersionUID = 8012562715330952721L;

    private Integer contractId;

    private BigDecimal contractAmount;

    private DateTime expireDate;

    private BigDecimal priceAmount;

    private Integer priceId;

    private DateTime endDate;

    private Integer contractAgreementId;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public DateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(DateTime expireDate) {
        this.expireDate = expireDate;
    }

    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getContractAgreementId() {
        return contractAgreementId;
    }

    public void setContractAgreementId(Integer contractAgreementId) {
        this.contractAgreementId = contractAgreementId;
    }

    @Override
    public String toString() {
        return "ContractData [contractId = " + contractId
                + ",contractAmount = " + contractAmount
                + ",expireDate = " + expireDate.toString(DataFix.DATE_FORMAT)
                + ",priceAmount = " + priceAmount
                + ",priceId = " + priceId
                + ",endDate = " + endDate.toString(DataFix.DATE_FORMAT)
                + "contractAgreementId = " + contractAgreementId + " ]";
    }
}
