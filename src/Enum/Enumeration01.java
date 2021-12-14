package Enum;

public class Enumeration01 {
    public static void main(String[] args){
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
    }
}
enum Season{
    SPRING("春天","温和"),SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
    private final String name;
    private final String Desc;

    Season(String name, String desc) {
        this.name = name;
        Desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return Desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", Desc='" + Desc + '\'' +
                '}';
    }
}