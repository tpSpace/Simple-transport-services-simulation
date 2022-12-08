public interface Payment {
    public float transactionFee(float amount);
    public float getBalance();
    public void setBalance(float balance);
    public void transfer(float amount, Driver driver);
  
}
