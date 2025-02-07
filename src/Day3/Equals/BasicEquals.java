package Day3.Equals;

class Car{
    String model;
    int years;

    Car(String model, int years){
        this.model = model;
        this.years = years;
    }
}

/* equals : method untuk membandingkan 2 object apakah mereka punya atribut dan isi yang sama
*           ini sama kayak operator == di JS */

public class BasicEquals {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai", 2023);
        Car car2 = new Car("Toyota", 2023);
        Car car3 = car1; // mereferensikan (akses alamat) object ke object yang udah ada
        //Car car3 = new Car("Hyundai", 2023);


        // method equals default dari object
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

        System.out.println(car1 == car2);
        System.out.println(car1 == car3);

        if(car1.equals(car3)){
            System.out.println("mobilnya sama");
        } else{
            System.out.println("mobilnya beda");
        }

    }
}
