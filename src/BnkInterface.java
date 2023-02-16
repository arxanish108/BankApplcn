public interface BnkInterface {
    int getBalance();
    String depositMoney(int amount);
    String withdrwan(int amount ,String enterPass);
    double calculateInterest(int time);

}
