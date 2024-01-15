import java.util.ArrayList;

class PrintedEd{
    protected String name;
    protected int maxPrint;
    public PrintedEd(){
        name="Без названия";
        maxPrint=0;
    }
    public PrintedEd(String name,int maxPrint){
        this.name=name;
        this.maxPrint=maxPrint;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPrint(int maxPrint){
        this.maxPrint=maxPrint;
    }
    public int getPrint(){
        return maxPrint;
    }

}
class Book extends PrintedEd{
    int prod;
    public Book(String name,int maxPrint,int prod){
        super(name,maxPrint);
        this.prod=prod;
    }
    public void setProd(int Prod){
        this.prod=prod;
    }
    public int getProd(){
        return prod;
    }
    public String toString(){
        String res="название - "+getName()+" количество страниц - "+getPrint()+" номер производства - "+getProd();
        return res;
    }
}
class Magazine extends PrintedEd{
    int tir;
    public Magazine(String name,int maxPrint,int tir){
        super(name,maxPrint);
        this.tir=tir;
    }
    public void setTir(int Tir){
        this.tir=tir;
    }
    public int getTir(){
        return tir;
    }
    public String toString(){
        String res="название - "+getName()+" количество страниц - "+getPrint()+" максимальный тираж - "+getTir();
        return res;
    }
}
class BookShop{
    private ArrayList<PrintedEd> masPrint=new ArrayList<PrintedEd>();

    public void Add(PrintedEd p){
        masPrint.add(p);
    }

    public BookShop(){

    }
    public void count(){
        int books=0;
        int mag=0;
        for (PrintedEd a:masPrint)
            if (a instanceof Book)
                books++;
            else mag++;
        System.out.println("В книжном магазине книг - "+books);
        System.out.println("В книжном магазине журналов - "+mag);
    }
    public BookShop(ArrayList<PrintedEd> n){
        masPrint=n;
    }

    public void printBookShop(){
        System.out.println("В книжном магазине: ");
        for (PrintedEd a:masPrint){
            System.out.println("\t"+a.toString());
        }
    }
}
