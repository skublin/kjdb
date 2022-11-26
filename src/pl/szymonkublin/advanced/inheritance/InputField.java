package pl.szymonkublin.advanced.inheritance;

public abstract class InputField {

    public static final String FIELD_TYPE = "Input";    // constant value
    private final int id;
    private String name;
    private String value;

    public InputField(int id) {
        this.id = id;
    }

    public abstract void printFieldInfo();

    public final void setName(String name) {
        this.name = name;
    }

    protected void setValue(String value) {
        // FIXME
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
