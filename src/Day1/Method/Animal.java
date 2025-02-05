package Day1.Method;

// method overide
// calss parent
public class Animal {
    public static String sound(){return "kiw kiw";}
}

// class children yang mewarisi sifat/method-method parent
class Cat extends Animal {
    public static String sound(){return "Miaw Miaw";}
}
