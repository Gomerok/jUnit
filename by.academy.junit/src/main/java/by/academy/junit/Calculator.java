package by.academy.junit;

public class Calculator {

//	1) создаем 3 класса-теста
//	2) каждый из которых будет тестировать одну функцию калькулятора
//	3) протестировать методы 3 наборами данных (используем Parametrize)
//	4) написать 2 класса, в которых вы напишите тесты на Math библиотеку( любую функцию), объеденить их в Test Suite.
//	5) добавить CalculatorTestListener, переопределить, метод который вызывается на успешное 
//	завершение теста и выводит на экран название нашего метода.	
	
	public static int getSum(int x, int y) {
		return x + y;
	}

	public static int getDivide(int x, int y) {
		return x / y;
	}

	public static int getMultiple(int x, int y) {
		return x * y;
	}

}
