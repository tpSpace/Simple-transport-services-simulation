public interface Transportation {
    public void Service();
    public float Pay(float distance);
    public float getBalance(Payment payment);
    public void setBalance(Payment payment,float balance);
}
