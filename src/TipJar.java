public class TipJar {
    public double totalTips = 0;
    public double amountCustomerTipped;
    public int tipCount = 0;

    public String updateTip(int outcomeIndex) {
        if (outcomeIndex != 0) {
            amountCustomerTipped = (Math.random() * 10) + 1;
            amountCustomerTipped = Math.round(amountCustomerTipped * 100.0) / 100.0;
            totalTips += amountCustomerTipped;
            tipCount = tipCount + 1;
        }
        else {
            amountCustomerTipped = 0;
        }
        return ("The customer left a $" + amountCustomerTipped + " tip. The total amount of tips you received today is: $" + totalTips);
    }

    public String updateTip(boolean customerHappy) {
        if (customerHappy) {
            amountCustomerTipped = (Math.random() * 10) + 1;
            amountCustomerTipped = Math.round(amountCustomerTipped * 100.0) / 100.0;
            totalTips += amountCustomerTipped;
            tipCount = tipCount + 1;
        }
        else {
            amountCustomerTipped = 0.00;
        }
        return ("The customer left a $" + amountCustomerTipped + " tip. The total amount of tips you received today is: $" + totalTips);
    }

    public String clockingOut() {
        return ("You made a total of $" + totalTips + " in tips today. ");
    }


}
