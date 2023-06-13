package ar.com.branded.bfftransaction.repository.model.rest;

public class PaymentDetails {
    private String method;
    private String credit_card_company;
    private int installments;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCredit_card_company() {
        return credit_card_company;
    }

    public void setCredit_card_company(String credit_card_company) {
        this.credit_card_company = credit_card_company;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }
}
