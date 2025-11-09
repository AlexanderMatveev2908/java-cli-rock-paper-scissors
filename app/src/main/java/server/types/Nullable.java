package server.types;

import server.lib.dev.ErrApp;

public final class Nullable<T> {
  private final T val;

  private Nullable(T val) {
    this.val = val;
  }

  public static <T> Nullable<T> of(T val) {
    if (val == null)
      throw new ErrApp("invalid null argument for base constructor");

    return new Nullable<>(val);
  }

  public static <T> Nullable<T> ofNullable(T val) {
    return new Nullable<>(val);
  }

  public boolean isPresent() {
    return val != null;
  }

  public T get() {
    if (!isPresent())
      throw new ErrApp("val not present");

    return val;
  }

  public T orElse(T fallback) {
    return isPresent() ? val : fallback;
  }

  @Override
  public String toString() {
    return val == null ? "Nullable.empty" : "Nullable[" + val + "]";
  }
}
