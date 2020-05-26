package Ders_CustomClass;
public class Accumulator{
    int sum;

    public Accumulator(int sum){
        this.sum=sum;
    }

    public int getSum(){
        return sum;
    }

    public void add(int n){
        sum += n;
    }

    public void remove(int n){
        sum -= n;
    }

    public String toString() {
        String result = "Sum is: "+ sum;
        return result;
    }


    public static void main(String[] args) {
        Accumulator obj = new Accumulator(10);
        obj.add(5);
        obj.add(3);
        System.out.println(obj);


    }
}