package problema5;

public abstract class PCComponent {
    private Boolean isOptional = false;

    protected Boolean getOptional() {
        return isOptional;
    }

    protected void setOptional(Boolean optional) {
        isOptional = optional;
    }
}
