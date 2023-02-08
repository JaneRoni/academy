package junit;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.TestClass;

public class CalRunner extends BlockJUnit4ClassRunner{
	
	private CalculatorTestListener ourListener;

	public CalRunner(Class<CalculatorTestListener> clz) throws InitializationError {
		super(clz);
		ourListener = new CalculatorTestListener();
	}
	
	@Override
	public void run (final RunNotifier notifier) {
		notifier.addListener(ourListener);
		super.run(notifier);
	}

}
