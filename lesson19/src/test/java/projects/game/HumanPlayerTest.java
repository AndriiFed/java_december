package projects.game;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HumanPlayerTest {

  @Mock
  ConsoleReaderImpl consoleReader;

  @Test
  public void testMakeMove() {

    when(consoleReader.getData()).thenReturn("12");

    HumanPlayer humanPlayer =
        new HumanPlayer("John", "Wick", 51, 'X', consoleReader);

    String result = humanPlayer.makeMove();

    assertThat(result.length(), is(2));
  }

  @Test(expected = MoveNotValidException.class)
  public void testWrongMakeMove() {

    when(consoleReader.getData()).thenReturn("123");

    HumanPlayer humanPlayer =
        new HumanPlayer("John", "Wick", 51, 'X', consoleReader);

    String result = humanPlayer.makeMove();
  }
}
