package by.epam.javabase.task8_part1;

public class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private String ownerPassport;
    private int accountNumber;
    private double balance;
    private double interestRate;
    private double monthlyFee;

    public BankAccount(String ownerFirstName, String ownerLastName, String ownerPassport, int accountNumber, double balance, double interestRate, double monthlyFee) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.ownerPassport = ownerPassport;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.monthlyFee = monthlyFee;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerPassport() {
        return ownerPassport;
    }

    public void setOwnerPassport(String ownerPassport) {
        this.ownerPassport = ownerPassport;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (ownerFirstName == null ? 0 : ownerFirstName.hashCode());
        result = prime * result + (ownerLastName == null ? 0 : ownerLastName.hashCode());
        result = prime * result + (ownerPassport == null ? 0 : ownerPassport.hashCode());
        result = prime * result + accountNumber;
        result = prime * result + Double.hashCode(balance);
        result = prime * result + Double.hashCode(interestRate);
        result = prime * result + Double.hashCode(monthlyFee);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BankAccount other = (BankAccount) obj;
        if ((this.ownerFirstName == null) ? (other.ownerFirstName != null) : !this.ownerFirstName.equals(other.ownerFirstName)) {
            return false;
        }
        if ((this.ownerLastName == null) ? (other.ownerLastName != null) : !this.ownerLastName.equals(other.ownerLastName)) {
            return false;
        }
        if ((this.ownerPassport == null) ? (other.ownerPassport != null) : !this.ownerPassport.equals(other.ownerPassport)) {
            return false;
        }
        if (accountNumber != other.accountNumber) {
            return false;
        }
        if (balance != other.balance) {
            return false;
        }
        if (interestRate != other.interestRate) {
            return false;
        }
        if (monthlyFee != other.monthlyFee) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.ownerFirstName + " " + this.ownerLastName + " " + this.ownerPassport + " " + this.accountNumber + " " + this.balance + " " + this.interestRate + " " + this.monthlyFee;
    }
}
