public class ShuttleProgram {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0) {
                continue;
            }
            if (i % 9 == 0){
                continue;
            }


            System.out.println("shuttle № " + i);
            }

        }
    }



