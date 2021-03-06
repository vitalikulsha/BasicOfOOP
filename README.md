# ОГЛАВЛЕНИЕ
## 1. [Basics of OOP](#Basics-of-OOP)
## 2. [Questions](#Questions)

# Basics of OOP
## Description
### Решите задачи. Каждое решение можно оформить в отдельном проекте.

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

[:arrow_up: Оглавление](#ОГЛАВЛЕНИЕ)

# Questions
## 1. [OOP, Classes and Objects, Inheritance, Class Object, Interfaces](#OOP,-Classes-and-Objects,-Inheritance,-Class-Object,-Interfaces)
## 2. [Generic classes and Interfaces, Enums](#Generic-classes-and-Interfaces,-Enums)
## 3. [Exceptions and Errors](#Exceptions-and-Errors)
## Description
### Ответьте на следующие вопросы.
### Не всегда в литературе или обучающих видео-роликах вы можете найти прямой ответ на поставленный вопрос, использующий к тому же одинаковые формулировки. В этом случае необходимо обобщить имеющиеся у вас знания и вывести правильный ответ (ну, или иногда помогает Google :) ).

### [Файл](https://github.com/vitalikulsha/BasicOfOOP/blob/master/BasicsOfOOP_theory.docx) с ответами на вопросы.

### OOP, Classes and Objects, Inheritance, Class Object, Interfaces

1. Дайте развернутое объяснение трем концепциям ООП.
2. Опишите процедуру инициализации полей класса и полей экземпляра класса. Когда инициализируются поля класса, а когда – поля экземпляров класса. Какие значения присваиваются полям по умолчанию? Где еще в классе полям могут быть присвоены начальные значения?
3. Приведите правила, которым должен следовать компонент java-bean.
4. Дайте определение перегрузке методов. Как вы думаете, чем удобна перегрузка методов? Укажите, какие методы могут перегружаться, и какими методами они могут быть перегружены? Можно ли перегрузить методы в базовом и производном классах? Можно ли private метод базового класса перегрузить public методов производного? Можно ли перегрузить конструкторы, и можно ли при перегрузке конструкторов менять атрибуты доступа у конструкторов?
5. Объясните, что такое раннее и позднее связывание? Перегрузка – это раннее или позднее связывание? Объясните правила, которым следует компилятор при разрешении перегрузки; в том числе, если методы перегружаются примитивными типами, между которыми возможно неявное приведение или ссылочными типами, состоящими в иерархической связи.
6. Объясните, как вы понимаете, что такое неявная ссылка this? В каких методах эта ссылка присутствует, а в каких – нет, и почему?
7. Что такое финальные поля, какие поля можно объявить со спецификатором final? Где можно инициализировать финальные поля?
8. Что такое статические поля, статические финальные поля и статические методы. К чему имеют доступ статические методы? Можно ли перегрузить и переопределить статические методы? Наследуются ли статические методы?
9. Что такое логические и статические блоки инициализации? Сколько их может быть в классе, в каком порядке они могут быть размещены и в каком порядке вызываются?
10. Что представляют собой методы с переменным числом параметров, как передаются параметры в такие методы и что представляет собой такой параметр в методе? Как осуществляется выбор подходящего метода, при использовании перегрузки для методов с переменным числом параметров?
11. Чем является класс Object? Перечислите известные вам методы класса  Object, укажите их назначение.
12. Что такое хэш-значение? Объясните, почему два разных объекта могут сгенерировать одинаковые хэш-коды?
13. Как вы думаете, для чего используется наследование классов в java-программе? Приведите пример наследования. Как вы думаете, поля и методы, помеченными модификатором доступа private, наследуются?
14. Укажите, как вызываются конструкторы при создании объекта производного класса? Что в конструкторе класса делает оператор super()? Возможно ли в одном конструкторе использовать операторы super() и this()?
15. Объясните, как вы понимаете утверждения: “ссылка базового класса может ссылаться на объекты своих производных типов” и “объект производного класса может быть использован везде, где ожидается объект его базового типа”. Верно ли обратное и почему?
16. Что такое переопределение методов? Как вы думаете, зачем они нужны? Можно ли менять возвращаемый тип при переопределении методов? Можно ли менять атрибуты доступа при переопределении методов? Можно ли переопределить методы в рамках одного класса?
17. Определите правило вызова переопределенных методов. Можно ли статические методы переопределить нестатическими и наоборот?
18. Какие свойства имеют финальные методы и финальные классы? Как вы думаете, зачем их использовать?
19. Укажите правила приведения типов при наследовании. Напишите примеры явного и неявного преобразования ссылочных типов. Объясните, какие ошибки могут возникать при явном преобразовании ссылочных типов.
20. Что такое объект класса Class? Чем использование метода getClass() и последующего сравнения возвращенного значения с Type.class отличается от использования оператора instanceof?
21. Укажите правила переопределения методов equals(), hashCode() и toString().
22. Что такое абстрактные классы и методы? Зачем они нужны? Бывают ли случаи, когда абстрактные методы содержат тело? Можно ли в абстрактных классах определять конструкторы? Могут ли абстрактные классы содержать неабстрактные методы? Можно ли от абстрактных классов создавать объекты и почему?
23. Что такое интерфейсы? Как определить и реализовать интерфейс в java-программе? Укажите спецификаторы, которые приобретают методы и поля, определенные в интерфейсе. Можно ли описывать в интерфейсе конструкторы и создавать объекты? Можно ли создавать интерфейсные ссылки и если да, то на какие объекты они могут ссылаться?
24. Для чего служит интерфейс Clonable? Как правильно переопределить метод clone() класса Object, для того, что объект мог создавать свои адекватные копии?
25. Для чего служат интерфейсы Comparable и Comparator? В каких случаях предпочтительнее использовать первый, а когда – второй? Как их реализовать и использовать? 

### Generic classes and Interfaces, Enums

1. Что такое перечисления в Java. Как объявить перечисление? Чем являются элементы перечислений? Кто и когда создает экземпляры перечислений?
2. Можно ли самостоятельно создать экземпляр перечисления? А ссылку типа перечисления? Как сравнить, что в двух переменных содержится один и тот же элемент перечисления и почему именно так?
3. Что такое анонимные классы?
4. Что такое параметризованные классы? Для чего они необходимы? Приведите пример параметризованного класса и пример создания объекта параметризованного класса? Объясните, ссылки какого типа могут ссылаться на объекты параметризованных классов? Можно ли создать объект, параметризовав его примитивным типом данных?

### Exceptions and Errors
1. Что для программы является исключительной ситуацией? Какие способы обработки ошибок в программах вы знаете?
2. Что такое исключение для Java-программы? Что значит “программа выбросила исключение”? Опишите ситуации, когда исключения выбрасываются виртуальной машиной(автоматически), и когда необходимо их выбрасывать вручную?
3. Приведите иерархию классов-исключений, делящую исключения на проверяемые и непроверяемые. В чем особенности проверяемых и непроверяемых исключений?
4. Объясните работу оператора try-catch-finally. Когда данный оператор следует использовать? Сколько блоков catch может соответствовать одному блоку try? Можно ли вкладывать блоки try друг в друга, можно ли вложить блок try в catch или finally? Как происходит обработка исключений, выброшенных внутренним блоком try, если среди его блоков catch нет подходящего? Что называют стеком операторов try? Как работает блок try с ресурсами.
5. Укажите правило расположения блоков catch в зависимости от типов перехватываемых исключений. Может ли перехваченной исключение быть сгенерировано снова, и, если да, то как и кто в этом случае будет обрабатывать повторно сгенерированное исключение? Может ли блок catch выбрасывать иные исключения, и если да, то опишите ситуацию, когда это может быть необходимо.
6. Когда происходит вызов блока finally? Существуют ли ситуации, когда блок finally не будет вызван? Может ли блок finally выбрасывать исключений? Может ли блок finally выполнится дважды?

[:arrow_up: Оглавление](#ОГЛАВЛЕНИЕ)
