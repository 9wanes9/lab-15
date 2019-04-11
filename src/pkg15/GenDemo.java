package pkg15;
public class GenDemo <T>{
    T ob;//  объявить  объект  типа  Т
    GenDemo(T o){
        ob=o;
    }
    T getob(){
        return ob;
    }
    void showType(){
        System.out.println("Тип T :"+ ob.getClass().getName());
    }
}
class Gen {
    public static void main(String[] args){
        //  Создать  ссылку  типа  Gen  для  целых  чисел
        GenDemo< Integer>  iOb ;
        iOb  =  new  GenDemo< Integer> (96);
        iOb . showType();
        int v = iOb.getob();
        System.out.println("Значение: "+v);
        System.out.println();
        GenDemo<String> strOb=new GenDemo<String>("Текст обобщения");
        strOb.showType();
        String  str = strOb.getob();
        System.out.println("Знaчeниe: "+ str) ;
    }
}