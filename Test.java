import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Auto myAuto1=new Auto();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фирму: ");
        String nazv=in.next();
        myAuto1.setFirm(nazv);
        System.out.print("Введите максимальную скорость: ");
        int s=in.nextInt();
        myAuto1.setMaxSpeed(s);
        System.out.println("Какой-то автомобиль: "+myAuto1.getFirm()+" "+myAuto1.getMaxSpeed());
        System.out.println();
        Car myCar1=new Car("Ford", 200,"Mustang",2,false);
        Car myCar2=new Car();
        System.out.print("Введите фирму-производитель легкового авто: ");
        nazv=in.next();
        myCar2.setFirm(nazv);
        System.out.print("Введите максимальную скорость легкового авто: ");
        s=in.nextInt();
        myCar2.setMaxSpeed(s);
        System.out.print("Введите модель легкового авто: ");
        nazv=in.next();
        myCar2.setModel(nazv);
        System.out.print("Введите кол-во дверей легкового авто: ");
        s=in.nextInt();
        myCar2.setNumDoors(s);
        System.out.print("Введите признак полного привода легкового авто (true/false): ");
        Boolean f=in.nextBoolean();
        System.out.println();
        System.out.println("Первый легковой автомобиль: "+myCar1.toString());
        System.out.println("Второй легковой автомобиль: "+myCar2.toString());
        Truck myTruck=new Truck();
        myTruck.setAllInfo();
        System.out.println(myTruck.toString());
    }
}