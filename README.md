# Basics of OOP
## Description
### Решите задачи.
### Каждое решение можно оформить в отдельном проекте.

## Задача 1: [Task_01_TextFile](https://github.com/vitalikulsha/BasicOfOOP/tree/master/src/Task_01_TextFile/)

Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

## Задача 2: [Task_02_Payment](https://github.com/vitalikulsha/BasicOfOOP/tree/master/src/Task_02_Payment/)

Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.

## Задача 3: [Task_03_Сalendar](https://github.com/vitalikulsha/BasicOfOOP/tree/master/src/Task_03_Сalendar/)

Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

## Задача 4: [Task_04_DragonAndRiches](https://github.com/vitalikulsha/BasicOfOOP/tree/master/src/Task_04_DragonAndRiches/)

Создать консольное приложение, удовлетворяющее следующим требованиям:

• Приложение должно быть объектно-, а не процедурно-ориентированным.

• Каждый класс должен иметь отражающее смысл название и информативный состав.

• Наследование должно применяться только тогда, когда это имеет смысл.

• При кодировании должны быть использованы соглашения об оформлении кода java code convention.

• Классы должны быть грамотно разложены по пакетам.

• Консольное меню должно быть минимальным.

• Для хранения данных можно использовать файлы.


__Дракон и его сокровища.__ Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.

## Задача 5: [Task_05A_FlowerArrangement](https://github.com/vitalikulsha/BasicOfOOP/tree/master/src/Task_05A_FlowerArrangement/)

Создать консольное приложение, удовлетворяющее следующим требованиям:

• Корректно спроектируйте и реализуйте предметную область задачи.

• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.

• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.

• Для проверки корректности переданных данных можно применить регулярные выражения.

• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.

• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

__Вариант A. Цветочная композиция.__ Реализовать приложение, позволяющее создавать цветочные композиции (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.

__Вариант B. Подарки.__ Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок). Составляющими целого подарка являются сладости и упаковка.

# Questions
## Description
### Ответьте на следующие вопросы.
### Не всегда в литературе или обучающих видео-роликах вы можете найти прямой ответ на поставленный вопрос, использующий к тому же одинаковые формулировки.
### В этом случае необходимо обобщить имеющиеся у вас знания и вывести правильный ответ (ну, или иногда помогает Google :) ).
### [Файл](https://github.com/vitalikulsha/BasicOfOOP/blob/master/BasicsOfOOP_theory.docx) с ответами на вопросы.
1. Опишите процедуру инициализации полей класса и полей экземпляра класса. Когда инициализируются поля класса, а когда – поля экземпляров класса. Какие значения присваиваются полям по умолчанию? Где еще в классе полям могут быть присвоены начальные значения?
2. Дайте определение перегрузке методов. Как вы думаете, чем удобна перегрузка методов? Укажите, какие методы могут перегружаться, и какими методами они могут быть перегружены? Можно ли перегрузить методы в базовом и производном классах? Можно ли private метод базового класса перегрузить public методов производного? Можно ли перегрузить конструкторы, и можно ли при перегрузке конструкторов менять атрибуты доступа у конструкторов?
3. Объясните, что такое раннее и позднее связывание? Перегрузка – это раннее или позднее связывание? Объясните правила, которым следует компилятор при разрешении перегрузки; в том числе, если методы перегружаются примитивными типами, между которыми возможно неявное приведение или ссылочными типами, состоящими в иерархической связи.
4. Объясните, как вы понимаете, что такое неявная ссылка this? В каких методах эта ссылка присутствует, а в каких – нет, и почему?
5. Что такое финальные поля, какие поля можно объявить со спецификатором final? Где можно инициализировать финальные поля?
6. Что такое статические поля, статические финальные поля и статические методы. К чему имеют доступ статические методы? Можно ли перегрузить и переопределить статические методы? Наследуются ли статические методы?
7. Что такое логические и статические блоки инициализации? Сколько их может быть в классе, в каком порядке они могут быть размещены и в каком порядке вызываются?
8. Что представляют собой методы с переменным числом параметров, как передаются параметры в такие методы и что представляет собой такой параметр в методе? Как осуществляется выбор подходящего метода, при использовании перегрузки для методов с переменным числом параметров?
9. Чем является класс Object? Перечислите известные вам методы класса  Object, укажите их назначение.
10. Что такое хэш-значение? Объясните, почему два разных объекта могут сгенерировать одинаковые хэш-коды?
11. Что такое объект класса Class? Чем использование метода getClass() и последующего сравнения возвращенного значения с Type.class отличается от использования оператора instanceof?
12. Укажите правила переопределения методов equals(), hashCode() и toString().
