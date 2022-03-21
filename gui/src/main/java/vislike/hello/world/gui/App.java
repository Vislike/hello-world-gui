package vislike.hello.world.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(3, false));
		shell.setSize(640, 480);
		shell.setText("Hello World App");

		Text helloWorldTest = new Text(shell, SWT.BORDER);
		helloWorldTest.setEditable(false);
		helloWorldTest.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		helloWorldTest.setText("Hello World SWT");

		Button button = new Button(shell, SWT.PUSH);
		button.setText("Go");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = helloWorldTest.getText();
				logger.info(text);
			}
		});

		Button button2 = new Button(shell, SWT.PUSH);
		button2.setText("Crash");
		button2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				throw new UnsupportedOperationException("Intentional crash!");
			}
		});

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
