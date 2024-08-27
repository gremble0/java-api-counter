package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
  private int counter = 0;

  @GetMapping(value = "/counter")
  public int get() {
    return this.counter;
  }

  @GetMapping(value = "/increment")
  public int increment() {
    return ++this.counter;
  }

  @GetMapping(value = "/decrement")
  public int decrement() {
    return --this.counter;
  }
}
