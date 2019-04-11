package pkg15;
public class TwoGenDemo <T,V> {
    T obj1;
    V obj2;
    TwoGenDemo(T o1,V o2){
        obj1=o1;
        obj2=o2;
    }
    void showTypes(){
        System.out.println("Тип T:  "+ obj1.getClass().getName());
        System.out.println("Тип V:  "+ obj2.getClass().getName());
    }
    T getOb1(){
        return obj1;
    }
    V getOb2(){
        return obj2;
    }
}
class TwoGen {
    public static void main(String[] args) {
        TwoGenDemo<Integer,String>tgObj=new TwoGenDemo<Integer,String>(88,"Обобщения");
        tgObj.showTypes();
        int v=tgObj.getOb1();
        System.out.println("Значение: "+v);
        String str=tgObj.getOb2();
        System.out.println("Значение: "+str);
    }
}