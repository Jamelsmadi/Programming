package Event;
import javax.swing.*;

public class Sounds {
public static void main(String[] args) {

	JFrame interFace = new JFrame("Button Example");
	JButton cat = new JButton("Cat sound");
	JButton dog = new JButton("Dog sound");
	
	cat.setBounds(70, 100, 100, 30);
	dog.setBounds(70, 200, 100, 30);
	
	
	interFace.add(dog);
	interFace.add(cat);
	
	interFace.setSize(400, 400);
	interFace.setLayout(null);
	interFace.setVisible(true);

	cat.addActionListener(new Button1ActionListene());
	dog.addActionListener(new Button2ActionListene());
}
	
	
	
}
