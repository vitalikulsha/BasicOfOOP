package Task_05A_FlowerArrangement;

/*
Задача 5.
Создать консольное приложение, удовлетворяющее следующим требованиям:
- Корректно спроектируйте и реализуйте предметную область задачи.
- Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
- Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
- для проверки корректности переданных данных можно применить регулярные выражения.
- Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
- Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
 */
public class Main {
    public static void main(String[] args) {
        FlowerStore decorStore = new DecorativeFlowerStore();
        FlowerStore vegetStore = new VegetativeFlowerStore();
        FlowerArrangement flowerArrangement = decorStore.orderFlowerArrangement("роза");
        flowerArrangement = vegetStore.orderFlowerArrangement("астра");
        System.out.println(flowerArrangement.toString());
    }
}
