package trenning.instanceOf;


import org.example_1.hw_27.Task_1.Abonent;


import java.time.LocalDate;
import java.util.List;

public class InstanceOfExample {

    public static void main(String[] args) {

        //object instanceOf class
        City city = new City("Minsk", "Uborevicha", 44, 2);
        Abonent abonent = new Abonent("Illia", "Belikau", "1234",
                LocalDate.of(1991, 02, 03), LocalDate.of(2023, 05, 05), false, "Minsk");

        List<Object> objectList = List.of(city, abonent);

        processObjectsDependingOnClass(objectList);



    }

    private static void processObjectsDependingOnClass(List<Object> objectList) {

        for (Object object : objectList) {
//Мы  спрашиваем через иф , что этот обьект является экземпляром этого класса?
            if(object instanceof City) {
                //Если да то мы делаем приведение типов


            }

        }
    }
}
