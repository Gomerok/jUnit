package by.academy.junit.homework7.suiteTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.academy.junit.homework7.MathMaxTest;
import by.academy.junit.homework7.MathSqrtTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ MathMaxTest.class, MathSqrtTest.class })
public class SuiteTest {
}
