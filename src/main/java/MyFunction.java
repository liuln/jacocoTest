package rhtect.com;

public class MyFunction {

    private Boolean myBoolean = false;

    public void setMyBoolean(Boolean isTrue) {

        if (isTrue) {
            myBoolean = true;
        }
    }

    public Boolean getMyBoolean() {

        return myBoolean;
    }

    public String isMan(String name) {

        String value = "你是男人";
        if ("".equals(name)){
            value = "你是隐形人";
        } else if ("男人".equals(name)) {
            value = "你真是是隐形人";
        } else {
            value = "你不是男人";
        }
        return value;
    }
}
