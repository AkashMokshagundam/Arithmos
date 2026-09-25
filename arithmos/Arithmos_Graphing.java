import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Arithmos_Graphing{
    public static JFrame frame = new JFrame("Arithmos");
    private static Color funcColor = new Color(64, 64, 64);
    private static JPanel displayPanel = new JPanel(); 
    private static Scanner sc = new Scanner(System.in);
    private static Map<String, Color> list = new HashMap<>();
    private static void rgb_colours(int r, int g, int b){
        Color colour = new Color(r, g, b);
        colouring(colour);
    }
    private static void colouring(Color colour){
        frame.setSize(800, 694);
        frame.setVisible(true);
        displayPanel.setLayout(new BorderLayout());
        displayPanel.setBounds(0, 0, 800, 694);
        displayPanel.setBackground(colour);
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        topPanel.setBackground(funcColor);
        displayPanel.add(topPanel, BorderLayout.NORTH);        
        frame.add(displayPanel);       
    }
    public static void main(String[]args){
        list.put("black", Color.BLACK);
        list.put( "gray", Color.GRAY);
        list.put("white", Color.WHITE);
        list.put( "dark grey", Color.DARK_GRAY);
        list.put( "light gray",Color.LIGHT_GRAY);
        list.put( "red", Color.RED);
        list.put( "blue", Color.BLUE);
        list.put( "cyan", Color.CYAN);
        list.put( "magenta", Color.MAGENTA);
        list.put( "green", Color.GREEN);
        list.put("yellow", Color.YELLOW);
        list.put( "orange",Color.ORANGE);
        list.put( "pink", Color.PINK);
        int ch = 0;
        while(ch != 3){
            System.out.println("---MENU---");
            System.out.println("1. for choosing a default colour");
            System.out.println("2. for choosing a random colour by RGB codes");
            System.out.println("3. for exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the colour name");
                    String col = sc.next();
                    colouring(list.get(col.toLowerCase()));;
                break;
                case 2:
                    System.out.println("RGB colour code:");
                    System.out.println("Enter r value");
                    int r = sc.nextInt();
                    System.out.println("Enter g value");
                    int g = sc.nextInt();
                    System.out.println("Enter b value");
                    int b = sc.nextInt();
                    System.out.println("Your colour code: ("+r+", "+g+", "+b+")");
                    rgb_colours(r, g, b);
                break;
                default:
                    System.out.println("Wrong Entry! Try Again");
            }
        }
    }
}