package server.types;

public final class Nullable<T> {
  private final T val;

  private Nullable(T val) {
    this.val = val;
  }

  public static <T> Nullable<T> of(T val) {
    return new Nullable<>(val);
  }

  public static <T> Nullable<T> ofNullable(T val) {
    return new Nullable<>(val);
  }

  public boolean isPresent() {
    return val != null;
  }

  public T get() {
    if (!isPresent()) {
      throw new IllegalStateException("Value is null");
    }

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
