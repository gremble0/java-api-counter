package com.booleanuk.api.counter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CounterControllerTest {
  @Test
  public void testCounter() {
    CounterController controller = new CounterController();
    Assertions.assertEquals(0, controller.get());
  }

  @Test
  public void testIncrement() {
    CounterController controller = new CounterController();
    Assertions.assertEquals(1, controller.increment());
    Assertions.assertEquals(2, controller.increment());
    Assertions.assertEquals(3, controller.increment());
  }

  @Test
  public void testDecrement() {
    CounterController controller = new CounterController();
    Assertions.assertEquals(-1, controller.decrement());
    Assertions.assertEquals(-2, controller.decrement());
    Assertions.assertEquals(-3, controller.decrement());
  }

  @Test
  public void testCustom() {
    CounterController controller = new CounterController();
    Assertions.assertEquals(0, controller.getCustom("Dave"));
    Assertions.assertEquals(0, controller.getCustom("Herman"));
  }

  @Test
  public void testIncrementCustom() {
    CounterController controller = new CounterController();
    Assertions.assertEquals(1, controller.incrementCustom("Dave"));
    Assertions.assertEquals(2, controller.incrementCustom("Dave"));

    Assertions.assertEquals(1, controller.incrementCustom("Herman"));
    Assertions.assertEquals(2, controller.incrementCustom("Herman"));
  }

  @Test
  public void testDecrementCustom() {
    CounterController controller = new CounterController();
    Assertions.assertEquals(-1, controller.decrementCustom("Dave"));
    Assertions.assertEquals(-2, controller.decrementCustom("Dave"));

    Assertions.assertEquals(-1, controller.decrementCustom("Herman"));
    Assertions.assertEquals(-2, controller.decrementCustom("Herman"));
  }
}
