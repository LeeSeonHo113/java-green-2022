package ex11;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car)
            return model.equals(((Car) obj).model);
        else
            return false;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car("HMW521");
        Car secondCar = new Car("HMW521");
        if (firstCar.equals(secondCar)) {
            System.out.println("동일한 종류의 자동차입니다.");
        } else {
            System.out.println("동일한 종류의 자동차가 아닙니다.");
        }
    }
}
