package org.example_1.hw_14.task_1;
/*Task 1
        Создайте свое собственное проверяемое исключение. Создайте класс интерфейс DatabaseConnector,
        в котором есть один метод - connectToDatabase, который принимает в качестве аргумента строку-название базы данных.
        В сигнатуре этого метода укажите, что он может бросать ваше исключение.
        Создайте класс, который имплементирует этот интерфейс (в случае, когда у интерфейса одна имплеметация, можно назвать его
        DatabaseConnectorImpl.
        Этот класс должен рандомно подключаться к базе данных или брость исключение.
        В классе Application создайте объект коннектора и вызовите метод connct. Обработайте исключение с помощью try-catch-finally*/

import org.apache.commons.lang3.RandomUtils;

public interface DatabaseConnector  {

      byte[] connectToDatabase() throws DatabaseChekedException;


}
