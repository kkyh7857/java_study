import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class key implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {

		if( e.getKeyCode() == 37 ) System.out.println( "���� ����"); 
		if( e.getKeyCode() == 38 ) System.out.println( "�� ����");
		if( e.getKeyCode() == 39 ) System.out.println( "������ ����");
        if( e.getKeyCode() == 40 ) System.out.println( "�Ʒ� ����");  
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
