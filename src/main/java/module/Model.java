package module;

import servises.Main;

public class Model extends Main {
    private  static String purchase;
    private  static String earlyRepayment;
    private  static String creditLineIncrease;





    public Model(){

    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public String getEarlyRepayment() {
        return earlyRepayment;
    }

    public void setEarlyRepayment(String earlyRepayment) {
        this.earlyRepayment = earlyRepayment;
    }

    public String getCreditLineIncrease() {
        return creditLineIncrease;
    }

    public void setCreditLineIncrease(String creditLineIncrease) {
        this.creditLineIncrease = creditLineIncrease;
    }


}
