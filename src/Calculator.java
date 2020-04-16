import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
    //Объявление всех компонентов калькулятора
    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    // В конструкторе создаются все компоненты
    // и добавляются на фрейм с помощью комбинации
    //BorderLayout и GridLayout
    Calculator() {
        //Установить менеджер расположения для панели
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        //Добавляем дисплей в верхнюю часть окна
        windowContent.add("North", displayField);
        //Создаём панель с менеджером расоложения GridLayout
        //которая содержит 12 кнопок - 10 цифр
        //и кнопки с точкой и знаком равно
        JPanel pl = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        pl.setLayout(gl);
        //добавляем кнопки на панель pl
        pl.add(button1);
        pl.add(button2);
        pl.add(button3);
        pl.add(button4);
        pl.add(button5);
        pl.add(button6);
        pl.add(button7);
        pl.add(button8);
        pl.add(button9);
        pl.add(button0);
        pl.add(buttonPoint);
        pl.add(buttonEqual);
        //Помещаем панель pl в центр окна
        windowContent.add("Center", pl);
        //Создаём панель с менеджером расположения GridLayout
        //на которой будет 4 кнопки (+,-,/,*)
        JPanel p2 = new JPanel();
        GridLayout gl2 = new GridLayout(4,1);
        p2.setLayout(gl2);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiply);
        p2.add(buttonDivide);
        //Добавляем панель p2 в правую часть окна
        windowContent.add("East", p2);
        //Создаём frame и добавляем в него содержимое
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        //делаем размер окна достаточным
        //для того, чтобы вместить все компоненты
        frame.pack();

        //Отображаем окно
        frame.setVisible(true);
        //Создаём экземпляр слушателя событий и
        //регистрируем его в каждой кнопке
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}