/*Создать класс Triangle c тремя полями Point. Класс Point использовать из предыдущего задания.
 
Нужно составить программу которая будет вычислять площадь треугольника образованного этими точками. Программа должна учитывать условия невозможности построить треугольник через эти точки. */

package ru.job4j.condition;

public class Triangle {
   private Point a;
   private Point b;
   private Point c;

   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

/**
* Метод должен вычислять расстояние между точками left и right.
*
* Для вычисления расстояния использовать формулу.
* √(xb - xa)^2 + (yb - ya)^2
*
* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
*
* ^ - степень.
*
* /////   Math.sqrt(Math.pow(x*b - x*a, 2) + Math.pow(y*b - y*a, 2));
*
* @param left Точка слева
* @param right Точка с права.
* @return расстояние между точками left и right.
*/
public double distance(Point left, Point right) {
    return Math.sqrt(Math.pow(x*b - x*a, 2) + Math.pow(y*b - y*a, 2));
}

/**
* Метод вычисления периметра по длинам сторон.
*
* Формула.
*
* (ab + ac + bc) / 2
*
* @param ab расстояние между точками a b
* @param ac расстояние между точками a c
* @param bc расстояние между точками b c
* @return Перимент.
*/
public double period(double ab, double ac, double bc) {
    return (ab + ac + bc) / 2;
}

/**
* Метод должен вычислить прощадь треугольканива.
*
* Формула.
*
* √ p *(p - ab) * (p - ac) * (p - bc)
*
* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
*
* @return Вернуть прощадь, если треугольник существует или -1.
*
*
*  ///  Math.sqrt(p *(p - ab) * (p - ac) * (p - bc));
*
*
*/
public double area() {
    double rsl = -1;
    double ab = this.distance(this.a, this.b);
    double ac = this.distance(this.a, this.c);
    double bc = this.distance(this.b, this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
        // написать формулу для расчета площади треугольника.
        rsl = Math.sqrt(p *(p - ab) * (p - ac) * (p - bc));
    }
    return rsl;
}

/**
* Метод проверяет можно ли построить треугольник с такими длинами сторон.
* 
* Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
* 
* @param ab Длина от точки a b. 
* @param ac Длина от точки a c.
* @param bc Длина от точки b c.
* @return
*/
private boolean exist(double ab, double ac, double bc) {
    
    
    
   return ab == 0 ? false : (ac == 0 ? false : (bc == 0 ? false : true));
}
}
/*Заместо -1 - надо написать формулу вычисляющее значения методов.

При тестировании метода area - у вас будут получается числа с плавающей точкой.

Для тестирования таких чисел надо использовать класс http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/number/IsCloseTo.html

добавьте статический импорт

import static org.hamcrest.number.IsCloseTo.closeTo;

Обязательно проверьте подключение библиотеки hamcrest-all.jar

<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest-all</artifactId>
    <version>1.3</version>
    <scope>test</scope>
</dependency>

Пример использования

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
 @Test
 public void whenAreaSetThreePointsThenTriangleArea() {
 // создаем три объекта класса Point.
 Point a = new Point(0, 0);
 Point b = new Point(0, 2);
 Point c = new Point(2, 0);
 // Создаем объект треугольник и передаем в него объекты точек.
 Triangle triangle = new Triangle(a, b, c);
 // Вычисляем площадь.
 double result = triangle.area();
 // Задаем ожидаемый результат.
 double expected = 2D;
 //Проверяем результат и ожидаемое значение.
 assertThat(result, closeTo(expected, 0.1));
 }
 
 @Test
 public void whenDistanceDiffPointsThen10() {
 // создаем два объекта класса Point.
 Point left = new Point(0, 0);
 Point right = new Point(0, 10);
 // Создаем объект треугольник и в качестве точек передает null.
 // так как нам не требуется их участие.
 Triangle triangle = new Triangle(null, null, null);
 
 double rsl = triangle.distance(left, right);
 
 assertThat(rsl, closeTo(10, 0.01));
 }
}
*/