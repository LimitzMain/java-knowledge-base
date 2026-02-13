import javax.swing.JOptionPane;

public class FindArea {
    public static void main(String[] args) {
        String length, width;
        int area;
        
        length = JOptionPane.showInputDialog("Enter length: ");
        width = JOptionPane.showInputDialog("Enter width: ");
        
        area = Integer.parseInt(length) * Integer.parseInt(width);
        
        JOptionPane.showMessageDialog(null, "Area = " + area);
    }
}
