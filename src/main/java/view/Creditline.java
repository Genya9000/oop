package view;

import java.io.IOException;

public class Creditline extends Repayment {
     {
        System.out.println("Are you interested in the possibility of increasing the credit line ?(yes/no)");
        try {
            String numa = reader.readLine();
            setCreditLineIncrease(numa);
            reader.close();
            System.out.println("You said: " + getCreditLineIncrease() );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
