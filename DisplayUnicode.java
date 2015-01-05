import javax.swing.JOptionPane;

public class DisplayUnicode{
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,
                                     "\u0C68 \u0C69 \u0C70 \u0C71 \u0C72 ",
                                     "Numbers",
                                     JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "HelloWorld","Hello", JOptionPane.INFORMATION_MESSAGE);
    }
  }
  
