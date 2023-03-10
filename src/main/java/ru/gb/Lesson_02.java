package ru.gb;

public class Lesson_02 extends Lesson {
    public Lesson_02(String title) {
        super(title);

        addExercise(new Exercise_01("Дана json строка\n" +
            "    [\n" +
            "        { \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},\n" +
            "        {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},\n" +
            "        {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}\n" +
            "    ]\n" +
            "\n" +
            "Задача написать метод(ы), который распарсить строку и выдаст\n" +
            "ответ вида:\n" +
            "\n" +
            "Студент Иванов получил 5 по предмету Математика.\n" +
            "Студент Петрова получил 4 по предмету Информатика.\n" +
            "Студент Краснов получил 5 по предмету Физика.\n" +
            "\n" +
            "Используйте StringBuilder для подготовки ответа",
            getScanner()));

        addExercise(new Exercise_02("Создать метод, который запишет результат работы в файл.\n" +
            "Обработайте исключения и запишите ошибки в лог файл",
            getScanner()));
    }
}
