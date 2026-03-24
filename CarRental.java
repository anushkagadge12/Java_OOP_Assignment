public class CarRental {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    void GetRent() {
        if (CarType.equals("Small")) Rent = 1000;
        else if (CarType.equals("Van")) Rent = 800;
        else Rent = 2500;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + Rent);
    }

    public static void main(String[] args) {
        CarRental c = new CarRental();
        c.GetCar(1, "SUV");
        c.GetRent();
        c.ShowCar();
    }
}