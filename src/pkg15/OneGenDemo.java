package pkg15;
public class OneGenDemo {
    Object ob;
    OneGenDemo(Object o){
    ob=0;
    }
    Object getob(){
        return ob;
    }
    void showType(){
        System.out.println("Объект типа:  "+ ob.getClass().getName());
    }
}
class Security {
    public static void main(String[] args){
        //  Создать  ссылку  типа  Gen  для  целых  чисел
        OneGenDemo  iOb ;
        iOb  =  new OneGenDemo (96);
        iOb.showType();
        int v = (Integer)iOb.getob();
        System.out.println("Значение: "+v);
        System.out.println();
        OneGenDemo strOb=new OneGenDemo("Текст без обобщений");
        strOb.showType();
        String  str =(String) strOb.getob();
        System.out.println("Знaчeниe: "+ str) ;
        iOb=strOb;
        v=(Integer)iOb.getob();
    }
}
