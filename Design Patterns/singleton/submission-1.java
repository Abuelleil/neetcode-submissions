static class Singleton {
    String value;
    static Singleton s;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(s==null){
            s = new Singleton();
        }
        return s;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value=value;
    }
    
}