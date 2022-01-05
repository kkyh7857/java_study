import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class key implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {

		if( e.getKeyCode() == 37 ) System.out.println( "왼쪽 누름"); 
		if( e.getKeyCode() == 38 ) System.out.println( "위 누름");
		if( e.getKeyCode() == 39 ) System.out.println( "오른쪽 누름");
        if( e.getKeyCode() == 40 ) System.out.println( "아래 누름");  
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
