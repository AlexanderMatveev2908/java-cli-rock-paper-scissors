package server.types;

import server.lib.dev.ErrApp;

public final class Nullable<T> {
  private final T val;

  private Nullable(T val) {
    this.val = val;
  }

  public static final <T> Nullable<T> of(T val) {
    if (val == null)
      throw new ErrApp("invalid null argument for base constructor");

    return new Nullable<>(val);
  }

  public static final <T> Nullable<T> ofNullable(T val) {
    return new Nullable<>(val);
  }

  public final boolean isPresent() {
    return val != null;
  }

  public final T get() {
    if (!isPresent())
      throw new ErrApp("val not present");

    return val;
  }

  public final T orElse(T fallback) {
    return isPresent() ? val : fallback;
  }

  @Override
  public final String toString() {
    return val == null ? "Nullable.empty" : "Nullable[" + val + "]";
  }
}
