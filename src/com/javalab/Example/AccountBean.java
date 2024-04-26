package com.javalab.Example;

public class AccountBean {
    // 멤버 변수
    private int accountNumber; // 계좌 번호
    private String accountName; // 계좌 주
    private int depositAmount; // 계좌 잔액

    // 기본 생성자
    AccountBean() { }

    // getter and setter
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public int getDepositAmount() {
        return depositAmount;
    }
    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String toString() {
        return
                "\n계좌번호 : "+ getAccountNumber() + "\n" +
                        "계좌주 : " + getAccountName() + "\n" +
                        "계좌잔액 : " + getDepositAmount();
    }
}
