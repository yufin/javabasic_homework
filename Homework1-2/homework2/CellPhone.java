package homework2;

public abstract class CellPhone {
    private String modeName;

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public CellPhone(String modeName){
        setModeName(modeName);
    }

    abstract void call();
    abstract void sms();
}
