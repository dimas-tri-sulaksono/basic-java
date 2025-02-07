package Day3.Enums;

import java.util.Set;
import java.util.EnumSet;

// enum juga bisa disimpan ke dalam set

public class EnumSetOf {
    enum Menu{
        INDOMIE,
        PECEL_AYAM,
        ES_TEH,
        KOPI
    }

    public static void main(String[] args) {
        // nambahin menu ke dalam set
        Set<Menu> availableMenu = EnumSet.of(Menu.INDOMIE, Menu.PECEL_AYAM);

        // nambahin menu lain
        availableMenu.add(Menu.ES_TEH);

        // cek menu ada kagak?
        if (availableMenu.contains(Menu.ES_TEH)){
            System.out.println("menu is available");
        } else {
            System.out.println("out of stock");
        }

        System.out.println("Today menu : "+ availableMenu);
    }
}
