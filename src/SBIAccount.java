import java.util.UUID;

public class SBIAccount implements BnkInterface{

    private String name;
    private String accountNo;
    private int balanace;
    private String password;

    public SBIAccount(String name, int balanace, String password) {
        this.name = name;
        this.balanace = balanace;
        this.password = password;

        this.rateOfi = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    private double rateOfi;

    public double getRateOfi() {
        return rateOfi;
    }

    public void setRateOfi(double rateOfi) {
        this.rateOfi = rateOfi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalanace() {
        return balanace;
    }

    public void setBalanace(int balanace) {
        this.balanace = balanace;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    private double rateOfInterest;
    @Override
    public int getBalance() {
        return this.balanace;
    }

    @Override
    public String depositMoney(int amount) {
        this.balanace += amount;
        return "paisa hi paisa"+ amount;
    }

    @Override
    public String withdrwan(int amount, String enterPass) {
        if(enterPass.equals(this.password)){
            if(balanace<amount){
                return "bhai paise kam hai";
            }else{
                balanace -= amount;
                return "money deducted";
            }
        }else{
            return "Nalle berozgar galat hai";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balanace*rateOfInterest*time)/100.0 ;
    }
}
