

public class BankAccount {


    public double amountOfMoney;


    public double getAmount() {
        return amountOfMoney;
    }

    public boolean put(double amountToPut) {
        if (amountToPut >= 0) {
            amountOfMoney += amountToPut;
            return true;
        }
        return false;

    }

    public boolean take(double amountToTake) {
        if (amountToTake <= amountOfMoney) {
            amountOfMoney -= amountToTake;
            return true;
        }
        return false;

    }

    public boolean send(BankAccount receiver, double amount) {
        if (amount <= amountOfMoney) {
            receiver.put(amount);
            amountOfMoney -= amount;
            return true;

        }
        return false;

    }


}