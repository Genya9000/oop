package view;

import java.io.IOException;

public class Repayment extends Purchase {
     {
        System.out.println("Are you interested in the possibility of early repayment of the loan?(yes/no)");
        try {
            String numa = reader.readLine();

            setEarlyRepayment(numa);

            System.out.println("You said: " + getEarlyRepayment() );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
