package servises;

import module.Banks;
import module.Model;

public class Controller extends Model {
    public  Banks getBank(){

        return getShwed();
    }
    public Banks getShwed(){
        if((getPurchase().equals("car"))&&(getEarlyRepayment().equals("yes"))&&(getCreditLineIncrease().equals("yes"))||(getPurchase().equals("flat"))&&(getEarlyRepayment().equals("no"))&&(getCreditLineIncrease().equals("no"))) return Banks.SWED;
    return getPrivat();
    }
    public Banks getPrivat(){
        if((getPurchase().equals("car"))&&(getEarlyRepayment().equals("no"))&&(getCreditLineIncrease().equals("yes"))||(getPurchase().equals("flat"))&&(getEarlyRepayment().equals("yes"))&&(getCreditLineIncrease().equals("no"))) return Banks.PRIVAT;
    return getMono();
    }
    public Banks getMono(){
        if((getPurchase().equals("car"))&&(getEarlyRepayment().equals("yes"))&&(getCreditLineIncrease().equals("no"))||(getPurchase().equals("flat"))&&(getEarlyRepayment().equals("no"))&&(getCreditLineIncrease().equals("yes"))) return Banks.MONO;
    return Banks.IBOX;
    }


}
