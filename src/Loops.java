public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();
    }

    public Loops(){
        countUp();
        System.out.println();
        countByThrees();
        System.out.println();
        countDown();
    }

    public void countUp(){
        for (int x = 1; x < 6; x += 1){
            System.out.println(x);
        }
    }
    public void countByThrees(){
        for (int j = 3; j < 16; j += 3){
            System.out.print(j + " ");
        }
    }

    public void countDown(){
        for (int h = 10; h > 0; h -= 1){
            if (h == 1){
                System.out.print(h);
            }
            else {
                System.out.print(h + ", ");
            }
        }
        System.out.println();
        System.out.println("Happy Loop Year!");
    }
}
