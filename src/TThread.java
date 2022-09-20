
public class TThread{
    public static void main(String[] args) {
        // Создание ниток черепахи и кролика
        Tur tur = new Tur("маленькая черепаха");
        Rabbit rabbit = new Rabbit("Белый кролик");
        // Запускаем гонку
        tur.start();
        rabbit.start();
    }
}
//черепаха
class Tur extends Thread{
    public Tur(String name) {
        super(name);// Метод построения родительского класса, задаем имя
    }
    @Override
    public void run() {
        for(int i = 1;i <= 30; i ++){ // i обозначает метры
            try {
                Thread.sleep(1000);// Отдых на 1 с
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Печатать каждый раз, когда вы пробегаете один метр
            System.out.println(Thread.currentThread().getName()+"Ран"+i+"Метр");
            if (i % 10 == 0) {
                // Бег 10 метров
                try {
                    Thread.sleep(1000); // Черепаха финиширует десять метров и отдыхает секунду
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
//кролик
class Rabbit extends Thread{
    public Rabbit(String name) {
        super(name);// Метод построения родительского класса, задаем имя
    }
    @Override
    public void run() {
        for(int i = 1;i <= 30; i ++){ // i обозначает метры
            // Кролик 10 метров, 1 метр в секунду составляет 0,1 секунды
            try {
                Thread.sleep(100);// Отдых 0,1 с
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Печатать каждый раз, когда вы пробегаете один метр
            System.out.println(Thread.currentThread().getName()+"Ран"+i+"Метр");
            if (i % 10 == 0) {
                // После пробега 10 метров
                try {
                    Thread.sleep(10000); // Кролик спит 10 секунд после пробега на 10 метров
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}