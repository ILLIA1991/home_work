package trenning.trening_lection_6;

import java.util.Arrays;

public class JuniorExample {
    public static void main(String[] args) {

        Junior junior = new Junior(25, "Viktor", "Viktorv", "vik@mail.com" );
        Junior junior1 = new Junior(26, "Vojtek", "Przeszkievich", "voj@mail.com" );
        Junior junior2 = new Junior(27, "Piotryk", "Duda", "pio@mail.com" );

        Junior[] juniorArray = new Junior[] {junior, junior1, junior2};

        System.out.print(Arrays.toString(juniorArray));
    }
}
