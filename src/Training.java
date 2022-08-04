public class Training {

    public static void main(String[] args){
        Calculator c1 = new Calculator();

        c1.set(10, 0);
        c1.divide();

    }
}
class Calculator{
    int left, right;

    public void set(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void divide(){
        try{
            System.out.println(this.left / this.right);
        }catch(Exception e){
            System.out.println("\nerror happned" + e.getMessage());
        }

    }

}