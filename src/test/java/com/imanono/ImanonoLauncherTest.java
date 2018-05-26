package com.imanono;

import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ImanonoLauncherTest {
    
	@Test
	@DisplayName("Print appropriate message")
	void printAppropriateMessage() {
		PrintStream out = mock(PrintStream.class);
		System.setOut(out);
		String[] args = null;
		ImanonoLauncher.main(args);
		verify(out).println(startsWith("Imanono just launched !"));
	}
}
