import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Graph extends JFrame {

    //Создаем панель, в которой будет располагаться график
    public JPanel p1;
    public MyPanel1 panel;
    public MyPanel2 panel2;

    //Создаем фрэйм
    public JFrame frame;

    //Конструктор класса
    public Graph() {

        //Создаем окно для графика
        frame = new JFrame("График параметрической функции");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Устанавливаем размер окна
        frame.setPreferredSize(new Dimension(1080, 800));

        //Добавляем в окно кнопку
        JButton button1 = new JButton();
        button1.addActionListener(this::actionPerformed);
        button1.setText("<html><h2><i><font size=7>Построить график!");

        //Создаем класс графика
        panel = new MyPanel1();
        panel2 = new MyPanel2();

        //Создаем панель, в которой будет располагаться кнопка и график
        p1 = new JPanel();
        JPanel p2 = new JPanel();

        //Располагаем панели графика и кнопки
        p1.setLayout(new BorderLayout());
        p1.add(panel, BorderLayout.CENTER);

        p2.setLayout(new BorderLayout());
        p2.add(button1, BorderLayout.SOUTH);

        p1.setVisible(true);
        p2.setVisible(true);

        //Устанавливаем размер панелей
        p1.setSize(1080,720);
        p2.setSize(1080,80);

        //Добавлям во фрейм 2 панели
        frame.add(p1);
        frame.add(p2);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

     // Обработка события нажатия на кнопку
     public void actionPerformed(ActionEvent e) {
        p1.remove(panel);
        p1.revalidate();

        p1.add(panel2, BorderLayout.CENTER);
        p1.repaint();
        JOptionPane.showMessageDialog(null, "График построен :)");
        System.out.println("Loading...");
    }
}

class MyPanel1 extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Устанавливаем ширину линий
        Graphics2D line = (Graphics2D) g;
        BasicStroke stroke = new BasicStroke(2);
        line.setStroke(stroke);

        //Добавляем рендеринг линий
        line.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Чертим оси
        g.drawLine(0, 360, 1070, 360);
        g.drawLine(540, 0, 540, 720);

        //Чертим стрелочки на осях
        g.drawLine(540, 0, 550, 20);
        g.drawLine(540, 0, 530, 20);

        g.drawLine(1070, 360, 1050, 370);
        g.drawLine(1070, 360, 1050, 350);

        //Чертим горизонтальные полосы на оси
        for (int i = 540; i < 1080; i += 60) {
            g.drawLine(i, 355, i, 365);
        }
        for (int i = 540; i > 0; i -= 60) {
            g.drawLine(i, 355, i, 365);
        }

        //Чертимг вертикальные полосы на оси
        for (int i = 360; i < 720; i += 60) {
            g.drawLine(535, i, 545, i);
        }
        for (int i = 360; i > 0; i -= 60) {
            g.drawLine(535, i, 545, i);
        }

        g.setColor(Color.black);
        //Функция -> x = t^2, y = 4t
        //Чертим функцию

        g.setFont(new Font("Courier", Font.ITALIC, 30));
        g.drawString("Функция:", 60, 70);
        g.drawString("x = t^2, y = 4t", 60, 120);
    }
}

class MyPanel2 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //Устанавливаем ширину линий
        Graphics2D line = (Graphics2D)g;
        BasicStroke stroke = new BasicStroke(2);
        line.setStroke(stroke);

        //Добавляем рендеринг линий
        line.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );

        //Чертим оси
        g.drawLine(0, 360, 1070,360);
        g.drawLine(540, 0, 540,720);

        //Чертим стрелочки на осях
        g.drawLine(540,0,550,20);
        g.drawLine(540,0,530,20);

        g.drawLine(1070,360,1050, 370);
        g.drawLine(1070,360,1050,350);

        //Чертим горизонтальные полосы на оси
        for(int i = 540; i < 1080; i+=60){
            g.drawLine(i,355,i, 365);
        }
        for(int i = 540; i > 0; i-=60){
            g.drawLine(i,355,i, 365);
        }

        //Чертимг вертикальные полосы на оси
        for(int i = 360; i < 720; i+=60){
            g.drawLine(535,i,545,i);
        }
        for(int i = 360; i > 0; i-=60){
            g.drawLine(535,i,545,i);
        }

        g.setColor(Color.black);
        //Функция -> x = t^2, y = 4t
        //Чертим функцию

        g.setFont(new Font("Courier", Font.ITALIC, 30));
        g.drawString("Функция:", 60,70);
        g.drawString("x = t^2, y = 4t", 60,120);

        int t1 = -30;
        int t2 = 30;
        for(int i = t1; i <= t2; i+=1){
            g.drawLine(i*i + 540, 4*i+360, (i+2)*(i+2)+540, 4*(i+2)+360);
        }
    }

}

class DoGraph {
    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Graph();
    }
}




