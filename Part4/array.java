
class Arrayy {

    public static void main(String[] args) {
        int input[] = {10, 1, 223, 98, 987, 87, 3, 345, 236};
        int k = 15, rem, div;
        for (int i = 0; i <= input.length; i++) {
            while (input[i] > 0) {
                rem = input[i] % 10;
                div = input[i] / 10;
                System.out.println(rem + " " + div);
            }
        }
    }
}
