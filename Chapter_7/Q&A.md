### 1. Предположим, имеется следующий фрагмент кода:
```java
class X {
  private int count;
```
### Исходя из этого, допустим ли следущий код?
```java
class Y {
  public static void main(String args[]) {
    X ob = new X ();
    
    ob.count = 10;
```
Нет, мы не можем обратиться к приватному типу данных класса X из класса Y. ``ob.count = 10;``
____
### 2. Модификатор доступа должен________________ объявлению члена класса.
предшествовать
____
### 3. Помимо очереди, в программах часто используется структура данных, которая называется стеком. Обращение к стеку осуществляется по принципу первым пришел — последним обслужен. Стек можно сравнить со стопкой тарелок, стоящих на столе. Последней берется тарелка, поставленная на стол первой. Создайте класс Stack, реализующий стек для хранения символов. Используйте методы ``push()`` и ``pop()`` для манипулирования содержимым стека. Пользователь класса Stack должен иметь возможность задавать размер стека при его создании. Все члены класса Stack, кроме методов ``push()`` и ``pop()``, должны быть объявлены как private. (Подсказка: в качестве заготовки можете воспользоваться классом Queue, изменив в нем лишь способ доступа к данным.)
``Файл TestStack2.java``
___
### 4. Предположим, имеется следующий класс:
```java
class Test {
  int а;
  Test(int i) { a = i; }
}
```
### Напишите метод ``swap()``, реализующий обмен содержимым между двумя объектами типа Test, на которые ссылаются две переменные данного типа
```java
void swap(Test ob1, Test ob2) {
  int s;
  s = ob1.a;
  ob1.a = ob2.a;
  ob2.a = s;
}
```
___
### 5. Правильно ли написан следующий фрагмент кода?
```java
class X {
  int meth(int a, int b) { ... }
  String meth(int a, int b) { ... }
```
Нет, неправильно. Перегружаемые методы должны иметь разные списки параметров.
___
### 6. Напишите рекурсивный метод, отображающий строку задом наперед.
``Файл RecStr.java``
___
### 7. Допустим, все объекты класса должны совместно использовать одну и ту же переменную. Как объявить такую переменную?
С модификатором доступа static.
___
### 8. Для чего может понадобиться статический блок?
Если для инициализации статических переменных требуется произвести вычисления, то для этой цели достаточно объявить статический блок, который будет выполняться только один раз при первой загрузке класса.
___
### 9. Что такое внутренний класс?
Внутренний класс - класс, объявленный внутри другого класса.
___
### 10. Допустим, требуется член класса, к которому могут обращаться только другие члены этого же класса. Какой модификатор доступа следует использовать в его объявлении?
С модификатором доступа private.
___
### 11. Имя метода и список его параметров вместе составляют _______________ метода.
сигнатуру
___
### 12. Если методу передается значение типа int , то в этом случае используется передача параметра по _____________. 
значению
___
### 13. Создайте метод ``sum()``, имеющий список аргументов переменной длины и предназначенный для суммирования передаваемых ему значений типа int. Метод должен возвращать результат суммирования. Продемонстрируйте работу этого метода
```java
int Sum(int ... v)
  int i = 0;
  for (int x : v)
    sum += x;
    return sum;
```
___
### 14. Можно ли перегружать методы с переменным числом аргументов?
Да, можно.
___
### 15. Приведите пример вызова перегруженного метода с переменным числом аргументов, демонстрирующий возникновение неоднозначности.
```java
void Test(int ... v) //...
void Test(int a, int ... v) //...

Test(10); // ОШИБКА: неоднозначность!
```
___
