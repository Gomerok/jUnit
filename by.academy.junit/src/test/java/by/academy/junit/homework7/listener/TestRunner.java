package by.academy.junit.homework7.listener;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

import by.academy.junit.listeners.OurListener;

public class TestRunner extends BlockJUnit4ClassRunner {

	private CalculatorTestListener calculatorTestListener;

	public TestRunner(Class<OurListener> clz) throws InitializationError {
		super(clz);
		calculatorTestListener = new CalculatorTestListener();
	}

	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(calculatorTestListener);
		super.run(notifier);
	}
}
