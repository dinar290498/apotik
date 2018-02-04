/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tampilan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Timer;

/**
 *
 * @author SAD
 */
public class MouseClickListenerTable extends MouseAdapter{
 private Timer timer = new Timer(300, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            // timer has gone off, so treat as a single click

            singleClick();
            timer.stop();
        }

    });

	@Override
	public void mouseClicked(MouseEvent e) {

		// Check if timer is running
		// to know if there was an earlier click

		if (timer.isRunning()) {

			// There was an earlier click so we'll treat it as a double click

            timer.stop();
            doubleClick();

        } else {

        	// (Re)start the timer and wait for 2nd click

            timer.restart();
        }

	}

	protected void singleClick() {
		System.out.println("single click");
	}

	protected void doubleClick() {
		System.out.println("double click");
	}
}
