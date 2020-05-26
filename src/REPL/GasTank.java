package REPL;

public class GasTank {
    //WRITE YOUR CODE HERE
    double amount = 0;
    double capacity;

    public GasTank(double capacity){
        this.capacity = capacity;
    }

    public void addGas(double d){
        amount += d;
        if(amount>capacity){
            amount = capacity;
        }
    }

    public void useGas(double e){
        amount -= e;
        if(amount<0){
            amount = 0;
        }
    }

    public boolean isEmpty(){
        if(amount<0.1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(amount>(capacity-0.1)){
            return true;
        }else{
            return false;
        }
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        double result = capacity -amount;
        amount = capacity;
        return result;
    }
}
