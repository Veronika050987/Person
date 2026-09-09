public class Main {
    public static void main(String[] args) {
        // 1. Создаем объект Person с начальными значениями
        Person person = new Person("Иван", 20);

        // 2. Изменяем оба поля через сеттеры
        person.setName("Алексей");
        person.setAge(25);

        // 3. Выводим измененные значения через геттеры
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}