Дз на закрепление:
Взять реализованный код в рамках последних семинаров (4-5) и продемонстрировать применение принципов,
усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые
рефакторим, какой принцип применяем и почему.

Формат сдачи: ссылка на гитхаб проект


Код проекта Калькулятор уже содержит применение принципов ООП.

Принцип Single Responsibility Principle(Принцип единой ответственности) применен в методах класса Calculator, каждый метод отвечает за конкретное действие: sum, multiply, division, convertToBinaryStr, convertToBinaryInt, DoubleToBinary, FloatToBinary.

Принцип Open/Closed Principle(Принцип открытия/закрытия) реализован, так как класс Calculator легко расширяем новыми методами для других операций без изменения существующего кода.

Принцип Liskov Substitution Principle(Принцип подстановки Лискова) соблюдается в методах, которые принимают различные типы данных и возвращают строковое представление в двоичном формате.

Принцип Dependency Inversion Principle(Принцип инверсии зависимостей) соблюдается в методе main, где используются абстракции (List, Arrays.asList) вместо конкретных реализаций, что позволяет легко изменять типы данных.

Вариант модифицированного кода с улучшениями по читаемости и разделению функциональности реализован в файле Main.java :

1. Ввод чисел и вывод результата в двоичном формате выведен в отдельные методы, чтобы основной метод main был более компактным.

2. Для повышения гибкости и удобства использования, добавлена проверка на корректность вводимых данных до их конвертации.
