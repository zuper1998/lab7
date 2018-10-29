package lab7;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaesarFrame extends JFrame {
	public enum abc {
		a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
	};

	private JButton jbut = new JButton();
	private JTextField jtext = new JTextField();
	private JComboBox<abc> jbox = new JComboBox<abc>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 338080451097971368L;

	public CaesarFrame() {
		setLayout(new GridLayout(2,3,5,5));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("SwingLab");
		setSize(2000, 500);
		setResizable(true);
		add(jbox);
		add(jtext);
		add(jbut);
		jbox.addItem(abc.a);;
		jbox.setSize(200, 200);
		jbut.setText("code");
		
		JLabel jp =  new JLabel();
		jp.add(new JTextField());
		jp.setText("Output:");
		jp.getComponent(0).setEnabled(false);
		jp.setLocation(3,3);
		add(jp);
		

		
		
		}

}
